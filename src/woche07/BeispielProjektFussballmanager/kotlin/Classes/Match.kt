package Classes

import flipCoin
import rollDice

class Match(val team1: Team, val team2: Team, val ticker: Boolean) {

    var goals1: Int = 0
    var goals2: Int = 0

    val DICE_SIDES: Int = 100
    val ELFMETER_BONUS: Int = 35
    val ECKBALL_BONUS: Int = 5

    fun simulateMatch() {
        if (ticker)
            println("\nWillkommen zur Partie zwischen ${team1.name} und ${team2.name}!\n")
        // 90 Spielminuten simulieren
        for (i in 1..90) {
            /* SIMPLE
            val dice: Int = rollDice(DICE_SIDES)
            when (dice){
                1 -> {
                    goals1 += 1
                    println("$i. Spielminute: TOR für ${team1.name}")
                }
                2 -> {
                    goals2 += 1
                    println("$i. Spielminute: TOR für ${team2.name}")
                }
                else -> Thread.sleep(100)
            }
             */
            if (i == 45){
                println("Halbzeitpfiff! \t Zwischenstand: ${team1.name}: $goals1 \t ${team2.name}: $goals2")
            }
            else {
                when (rollDice(DICE_SIDES)) {
                    // bei 1 bis 10 kommt es zum Angriff (eine Mannschaft hat chance auf ein Tor)
                    in 1..10 -> {
                        val coin: String = flipCoin()
                        // Bei Kopf greift Classes.Team 1 an, sonst Classes.Team 2
                        if (coin == "KOPF") {
                            val goal = simulateAtk(team1.teamATK, team2.teamDEF)
                            goals1 += if (goal) 1 else 0
                            if (goal && ticker)
                                printGoalScored(team1, i)
                        } else {
                            val goal = simulateAtk(team2.teamATK, team1.teamDEF)
                            goals2 += if (goal) 1 else 0
                            if (goal && ticker)
                                printGoalScored(team2, i)
                        }
                    }
                    // Bei 11 und 12 hat Team1 Eckball
                    in 11..12 -> {
                        val goal = simulateAtk(team1.teamATK + ECKBALL_BONUS, team2.teamDEF)
                        goals1 += if (goal) 1 else 0
                        if (ticker) {
                            println("$i. Spielminute: Eckball für ${team1.name}")
                            if (goal)
                                printGoalScored(team1, i)
                        }
                    }
                    // Bei 13 und 14 hat Team2 Eckball
                    in 13..14 -> {
                        val goal = simulateAtk(team2.teamATK + ECKBALL_BONUS, team1.teamDEF)
                        goals2 += if (goal) 1 else 0
                        if (ticker) {
                            println("$i. Spielminute: Eckball für ${team2.name}")
                            if (goal)
                                printGoalScored(team2, i)
                        }
                    }
                    // Bei 15 gibt es einen Elfmeter
                    15 -> {
                        val coin: String = flipCoin()
                        // Bei Kopf greift Classes.Team 1 an, sonst Classes.Team 2
                        if (coin == "KOPF") {
                            val goal = simulateAtk(team1.teamATK + ELFMETER_BONUS, team2.teamDEF)
                            goals1 += if (goal) 1 else 0
                            if (ticker) {
                                println("$i. Spielminute: Elfmeter für ${team1.name}")
                                if (goal)
                                    printGoalScored(team1, i)
                            }
                        } else {
                            val goal = simulateAtk(team2.teamATK + ELFMETER_BONUS, team1.teamDEF)
                            goals2 += if (goal) 1 else 0
                            if (ticker) {
                                println("$i. Spielminute: Elfmeter für ${team2.name}")
                                if (goal)
                                    printGoalScored(team2, i)
                            }
                        }
                    }

                    else -> if (ticker) Thread.sleep(150) else Thread.sleep(1)
                }
            }
        }

        // Verzweigung wer gewinnt
        if (goals1 > goals2) {
            team1.wins += 1
            team2.losses += 1
        } else if (goals2 > goals1) {
            team2.wins += 1
            team1.losses += 1
        } else {
            team1.ties += 1
            team2.ties += 1
        }

        // Update goals and points
        team1.calculatePoints()
        team1.goalsScored += goals1
        team1.goalsConceded += goals2

        team2.calculatePoints()
        team2.goalsScored += goals2
        team2.goalsConceded += goals1

        // Endstand auf der Konsole ausdrucken
        if (ticker) {
            println("Schlusspfiff!")
            // println("Endstand: ${team1.name}: $goals1 \t ${team2.name}: $goals2 \n")
            // Wenn toString implementiert wurde:
            println("Endstand: " + this + "\n")
        }
    }

    fun simulateAtk(atkScore: Int, defScore: Int): Boolean{
        val atkRoll = rollDice(atkScore)
        val defRoll = rollDice(defScore)

        // println("ATK: $atkRoll \t DEF: $defRoll")

        return atkRoll > defRoll
    }

    fun printGoalScored(scoringTeam: Team, gameMinute: Int){
        println("$gameMinute. Spielminute: TOR für ${scoringTeam.name}. \t" +
                "Torschütze: ${scoringTeam.aufstellung.values.random()}")
    }

    override fun toString(): String{
        return "${team1.name}: $goals1 \t ${team2.name}: $goals2"
    }

    override fun equals(other: Any?): Boolean {
        return (other is Match) && (team1 == other.team1) && (team2 == other.team2)
    }

}
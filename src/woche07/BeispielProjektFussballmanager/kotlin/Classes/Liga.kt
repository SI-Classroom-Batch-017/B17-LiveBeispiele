package Classes

import normalizeStringLength
import teamInMatch

class Liga(var teams: List<Team>, val LIVE_TICKER: Boolean){
    var currentDay = 0

    val NR_TEAMS = teams.size
    val GAMES_PER_DAY: Int = NR_TEAMS/2
    var MAX_DAYS = (NR_TEAMS - 1) * 2
    var matches: Map<Int, List<Match>> = generateMatches() // Für jeden Tag gibt es eine Liste von Matches

    fun simulateDay(){
        currentDay += 1

        /*
        SIMPLE
        var matches = listOf(Classes.Match(teams[0],teams[1]), Classes.Match(teams[2],teams[3]))
        for (match in matches){
            match.simulateMatch()
        }
         */

        for(match in matches[currentDay-1]!!) {
            match.simulateMatch()
        }
        // Am Ende des Tages sortieren wir die Classes.Liga nach Punkten
        sortLeague()
    }

    fun simulateLeague(){
        for (i in 1..MAX_DAYS){
            simulateDay()
        }
    }

    // Den aktuellen Stand der Classes.Liga ausdrucken
    fun printStandings(){
        println("Aktueller Stand der Classes.Liga \n Spieltage: $currentDay\n\n")

        /* SIMPLE
        println(normalizeStringLength("Classes.Team") + " \t W \t T \t L \t P")
        for (team in teams){
            println(normalizeStringLength(team.name) + "\t ${team.wins} \t ${team.ties} \t ${team.losses} \t ${team.points}")
        }
        */

        // COMPLEX
        println(normalizeStringLength("Classes.Team") + "\tW   T   L   P   \tGs  Gc  ")
        for (team in teams){
            println(
                normalizeStringLength(team.name) + "\t" +
                        normalizeStringLength("${team.wins}", 4) +
                        normalizeStringLength("${team.ties}", 4) +
                        normalizeStringLength("${team.losses}", 4) +
                        normalizeStringLength("${team.points}", 4) + "\t" +
                        normalizeStringLength("${team.goalsScored}", 4) +
                        normalizeStringLength("${team.goalsConceded}", 4)
            )
        }
    }

    // Die Classes.Liga nach Punkten sortieren
    fun sortLeague(){
        // teams = liga.teams.sortedBy{it.name} // Alphabetisch
        // teams = teams.sortedByDescending{ it.points } // Nach Punkten
        teams = teams.sortedWith(compareBy({-it.points}, {-it.goalsScored})) // Nach Punkten, dann Tore
    }

    /* SIMPLE (4 Teams)
    *
    * */
    fun generateMatchesSimple(): List<Match>{
        require(NR_TEAMS == 4)

        var new_matches = listOf(
            //Erster Spieltag
            Match(teams[0], teams[1], LIVE_TICKER),
            Match(teams[2], teams[3], LIVE_TICKER),
            //Zweiter Spieltag
            Match(teams[0], teams[2], LIVE_TICKER),
            Match(teams[1], teams[3], LIVE_TICKER),
            //Dritter Spieltag
            Match(teams[0], teams[3], LIVE_TICKER),
            Match(teams[1], teams[2], LIVE_TICKER),
            //Vierter Spieltag
            Match(teams[1], teams[0], LIVE_TICKER),
            Match(teams[3], teams[2], LIVE_TICKER),
            //Fünfter Spieltag
            Match(teams[2], teams[0], LIVE_TICKER),
            Match(teams[3], teams[1], LIVE_TICKER),
            //Sechster Spieltag
            Match(teams[3], teams[0], LIVE_TICKER),
            Match(teams[2], teams[1], LIVE_TICKER),
            )
        return new_matches
    }

    fun generateMatchesUnsorted(): MutableList<Match>{
        val allMatches = mutableListOf<Match>()
        for (team1 in teams){
            for (team2 in teams){
                if (team1 != team2)
                    allMatches.add(Match(team1, team2, LIVE_TICKER))
            }
        }
        allMatches.shuffle() // Die Liste wird einmal gemischt damit es das generien der Matches schneller macht
        return allMatches
    }

    fun generateMatches(): Map<Int, List<Match>>{
        /*
            ZIEL:
                Jedes Classes.Team soll zweimal gegen jedes andere Classes.Team spielen,
                einmal als Heim- und einmal als Auswärtsmannschaft.
                Keine Mannschaft soll gegen sich selber spielen.
                Für jeden Spieltag sollte keine Mannschaft in den anderen Spielen desselben Tages enthalten sein.

            STRATEGIE:
                Wir generieren erst eine Liste von allen Matches einer Classes.Liga, dann sortieren wir diese nach Spieltagen.
                Dafür legen wir eine zweite (zunächst leere) Liste an und füllen diese.

                Pro Spieltag suchen wir die richtige Anzahl an Matches (GAMES_PER_DAY).
                Jeden Spieltag legen wir eine Liste an 'matchesThisDay'

                Mithilfe von 'utils.teamInMatch' schauen wir, ob ein Classes.Team in einem Classes.Match ist.
                Das prüfen wir für jedes bereits vorhandene Spiel in der Liste matchesThisDay.

                Wenn wir genug Matchen an einem Tag haben, fügen wir diese Matches der finalen Liste hinzu.

            Reminder:
            Classes.Match(Team1, Team2) != Classes.Match(Team2, Team1)  --> True
         */
        val allMatches = generateMatchesUnsorted()
        val sortedMatches = mutableMapOf<Int, List<Match>>()

        for (i in 0 until MAX_DAYS) {
            val matchesThisDay = mutableListOf<Match>()
            for (j in 0 until GAMES_PER_DAY) {
                var matchFound = false
                var idx = 0
                while (!matchFound && allMatches.size > 0) {
                    if (idx > allMatches.size-1) {
                        MAX_DAYS += 1
                        break
                    }
                    val newMatch = allMatches[idx]

                    // Prüfe, ob die Mannschaften schon heute spielen
                    var newMatchPossible = true
                    for (match in matchesThisDay) {
                        if (teamInMatch(newMatch.team1, match) || teamInMatch(newMatch.team2, match))
                            newMatchPossible = false
                    }
                    // Falls es ein gültiges Classes.Match für den heutigen Tag ist, füge es hinzu
                    if (newMatchPossible) {
                        matchesThisDay.add(newMatch)
                        allMatches.removeAt(idx)
                        matchFound = true
                    }
                    // Ansonsten probier es mit dem nächsten Classes.Match
                    else
                        idx += 1
                }
            }
            // Füge alle matches des Tages der gesamten Liste hinzu
            sortedMatches[i] = matchesThisDay
        }
        MAX_DAYS = sortedMatches.keys.size
        return sortedMatches
    }

    fun printMatches(){
        for (gameDay in matches.keys){
            println("\n${gameDay}. Spieltag: ")
            for (match in matches[gameDay]!!)
                println(match.toString())
        }
    }
}



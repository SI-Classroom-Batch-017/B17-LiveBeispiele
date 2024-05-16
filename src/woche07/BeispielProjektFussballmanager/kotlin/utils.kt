import Classes.Match
import Classes.Team

val TEAM_POSITIONS = listOf(
                        "Goalie",
    "Left Defender", "Center Defender", "Right Defender",
            "Left Def Mid", "Right Def Mid",
        "Left Mid", "Center Mid", "Right Mid",
            "Left Striker", "Right Striker"
)

fun flipCoin(): String {
    return listOf("KOPF", "ZAHL").random()
}

fun rollDice(sides: Int = 6): Int{
    return (1..sides).random()
}

val VORNAMEN = listOf("Fritz", "Marius", "Magda", "Sabrina", "Kilian", "Kevin", "James", "Kanye", "Giuseppe", "Tina",
                        "Tobias", "Fabiano", "Eduardo", "Miguel", "Alessia", "Jamie", "Fabienne", "Max", "Maximilian",
                        "Tom", "Zuzanna", "Anne", "Anna", ""
    )
val NACHNAMEN = listOf("Maier", "Brown", "Heller", "Klingler", "Löffel", "Gomez", "Snijder", "von Hofen", "Drogba",
                        "East", "West", "Trumps", "Braveheart", "Depp", "Affenhausner", "van Gerlen", "Trinity",
                        "Baker", "Potter", "Singer", "Trüffel", "Schwamko", "Riberitzki", "Pele", "Ronaldo"
    )

fun randomNameGenerator(): String{
    return VORNAMEN.random() + " " + NACHNAMEN.random()
}

fun normalizeStringLength(str: String, nr_chars: Int = 20): String {
    return if (str.length < nr_chars)
        str.padEnd(nr_chars, ' ')
    else if (str.length > nr_chars)
        str.substring(0, nr_chars)
    else
        str
}

fun teamInMatch(t: Team, m: Match): Boolean{
    return (t == m.team1) || (t ==m.team2)
}



fun main() {



}


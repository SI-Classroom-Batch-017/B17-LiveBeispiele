import Classes.Liga
import Classes.Team

// Deutsche Teams
val bayern = Team("FC Bayern München", 92, 82)
val dortmund = Team("Borussia Dortmund", 83, 81)
val leipzig = Team("RB Leipzig", 82, 79)
val hertha = Team("Hertha BSC", 74, 75)

// Ausländische Teams
val real = Team("Real Madrid", 85, 83)
val city = Team("Manchester City", 85, 86)
val paris = Team("Paris Saint-Germain", 89, 84)
val inter = Team("Inter Mailand", 82, 83)


fun main(){
    val bundesliga = Liga(listOf(bayern, dortmund, leipzig, hertha), true)
    bundesliga.simulateLeague()
    bundesliga.printStandings()

    // Champions League (enthält Platz 1 und 2 der Bundesliga)
    val firstPlace = bundesliga.teams[0]
    val secondPlace = bundesliga.teams[1]
    println("\n${firstPlace.name} und ${secondPlace.name} spielen in der Champions League \n")

    // Diese Mannschaften müssen wieder resetet werden (also punkte, tore, etc auf null setzen)
    firstPlace.resetTeam()
    secondPlace.resetTeam()

    val championsliga = Liga(listOf(firstPlace,secondPlace, real, city, paris, inter), false)

    championsliga.simulateLeague()
    championsliga.printStandings()

    val champion = championsliga.teams[0]
    println("\n${champion.name} gewinnt die Champions League \n Aufstellung:")
    for (entry in champion.aufstellung)
        println("${entry.key}: ${entry.value}")
}
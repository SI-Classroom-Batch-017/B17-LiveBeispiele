import Classes.Match
import Classes.Team

fun main() {

    var test = Team("Test United", 100, 50)
    test.aufstellung


//    val liga = Classes.Liga(listOf(
//        bayern,
//        dortmund,
//        leipzig,
//        hertha
//    ), true)
//    //val liga = Classes.Liga(listOf(bayern, dortmund, leipzig, hertha, real, city, paris, inter), false)
//
//    liga.printMatches()
//
//    var team1: Classes.Team
//    var team2: Classes.Team
//
//    println("Wählen sie ihr Classes.Team: ")
//    println("1 für FC Bayern, 2 für Hertha")
//    var input = readln()
//
//    when (input){
//        "1" -> team1 = bayern
//        "2" -> team1 = hertha
//    }


//     Freundschaftsspiele
/*    val match1 = Match(bayern, hertha, true)
    match1.simulateMatch()
    println(match1)*/

//    Classes.Match(leipzig, dortmund).simulateMatch(ticker = true)
//    val match2 = Classes.Match(hertha, bayern)

    /* Compare Teams (implement Classes.Team.equals)
    println(bayern == hertha)
    println(hertha == hertha)
    */

    /* Compare Matches (implement Classes.Match.equals)
    println(match1 == match2)
    println(match1 == match1)
    */

//    Classes.Liga
    val liga = Classes.Liga(listOf(bayern, dortmund, leipzig, hertha), true)
    liga.printStandings()
    for (i in 1..5)
        liga.simulateDay()
    liga.printStandings()


}
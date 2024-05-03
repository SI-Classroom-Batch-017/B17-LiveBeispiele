package vorlesungen.Woche05.Tag25

fun main() {

    //TODO Muenzwurf simulieren

    var anzahlGewinne: Int = 0
    var anzahlNiederlagen: Int = 0
    var playAgain: Boolean
    var runde: Int = 1

    do{
        println("---Runde $runde!---")
        // nutzer sagen, dass er wetten soll
        println("Wette! Kopf oder Zahl?")
        val wette: String = readln().lowercase()
        // muenze werfen
        val muenzwurf: String = listOf("kopf","zahl").random()
        // schauen, ob nutzer richtig geraten hat
        // wenn ja kriegt nutzer einen punkt
        if (wette == muenzwurf){
            println("Richtig geraten! Wette: $wette, Münze: $muenzwurf")
            anzahlGewinne++
            // wenn nicht, dann nicht
        } else {
            println("Verloren! Wette: $wette, Münze: $muenzwurf")
            anzahlNiederlagen++
        }

        // nutzer fragen, ob er nochmal spielen möchte
        println("Du hast bereits $anzahlGewinne x gewonnen")
        println("Du hast bereits $anzahlNiederlagen x verloren")
        println("Nochmal spielen? (true/false)")
        playAgain = readln().toBoolean()
        runde++
        if (playAgain){
            println("Willst du komplett neu starten (Anzahl an Gewinnen/Niederlagen/Runden resetten? (ja/nein)")
            var neustart: String = readln().lowercase()
            if (neustart == "ja"){
                anzahlGewinne = 0
                anzahlNiederlagen = 0
                runde = 0
            }
        }


    } while(playAgain)

    println("Spiel beendet! Du hast insgesamt ${if (anzahlGewinne >= anzahlNiederlagen) "gewonnen" else "verloren"}")


}

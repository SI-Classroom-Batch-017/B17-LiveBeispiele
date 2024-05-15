package woche06.Tag05.wiederholsession

fun main() {
    //    while Schleife
    var heldHP: Int = 100
    var gegnerHP: Int = 100
    var runde = 1
    while (heldHP > 0 && gegnerHP > 0){
        println("Spielrunde $runde läuft...")
        Thread.sleep(500)
        println("Held greift Gegner an!")
        gegnerHP -= listOf(50,60,70).random()
        println("Gegner hat noch $gegnerHP HP!")

        Thread.sleep(500)
        if (gegnerHP > 0 ) {
            println("Gegner greift Held an!")
            heldHP -= listOf(50, 60, 70).random()
            println("Held hat noch $heldHP hp!")
        }
        runde++

    }
    if (gegnerHP <= 0 ) {
        println("Spiel beendet! Held hat gewonnen!")
    } else if (heldHP <= 0) {
        println("Spiel beendet! Gegner hat gewonnen!")
    }

    println("Do While:")

    // do while: wird mindestens 1x ausgeführt
    var x = 10
    // wir kommen niemals in die while schleife, weil x = 10 ist
    while (x < 10){
        println("while: x ist kleiner als 10, nämlich: $x")
    }

    // wir kommen 1x in die do while schleife, weil der inhalt ausgeführt wird, bevor geprüft wird, ob x < 10 ist.
    do {
        println("do while: x ist kleiner als 10, nämlich: $x")
    } while(x<10)




}
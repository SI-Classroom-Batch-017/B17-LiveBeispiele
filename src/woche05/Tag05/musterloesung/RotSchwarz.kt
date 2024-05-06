package woche05.Tag05.musterloesung

//Der erste Teil besteht darin, ein kleines Spiel schreiben, in dem der Spieler die Farbe der nächsten Karte erraten soll.
//
//Erstelle dafür eine neue Kotlin Datei mit dem Namen RotSchwarz.kt. Erstelle in dieser Datei eine woche05.Tag05.musterloesung.woche05.Tag05.musterloesung.woche05.Tag05.musterloesung.main-Funktion, in der das Kartendeck erstellt und gemischt wird.


fun main() {
    // in der das Kartendeck erstellt
    var deck: MutableList<String> = kartendeck.toMutableList()
    // und gemischt wird.
    mischen(deck)


    //Rufe die Funktion in der Main Funktion auf

    // immer wieder aufgerufen bis der Kartenstapel leer ist
    while(deck.isNotEmpty()){

        val result: String? = rotOderSchwarz(deck)
        //Gib in jeder Runde entweder "richtig geraten!" oder "falsch geraten!" aus.
        if (result != null){
            println("Richtig geraten!")
        } else {
            println("Falsch geraten!")
        }
    }
    //Gib "Spiel beendet" aus wenn das Spiel vorbei ist
    println("Spiel beendet!")


}
// Diese Funktion bekommt das Kartendeck übergeben.
fun rotOderSchwarz(stapel: MutableList<String>): String? {

    //Die oberste Karte wird vom Stapel gezogen
    val karte: String = eineKarteZiehen(stapel)
    //Der Spieler versucht zu erraten, ob die Karte schwarz oder rot ist. Er wird in der Konsole danach gefragt.
    println()
    println("Ist die nächste Karte rot oder schwarz?")
    val gerateneFarbe: String = readln().lowercase()


    val kartenFarbe: String = kartenFarbe(karte)

    //Wenn die Antwort des Spielers stimmt,
    if (kartenFarbe == gerateneFarbe){
        println("Du hast geraten: $gerateneFarbe, es wurde gezogen: $karte mit der Farbe $kartenFarbe")
        // dann liefert die Funktion die gezogene Karte zurück,
        return karte
        // sonst liefert sie null zurück
    } else {
        println("Du hast geraten: $gerateneFarbe, es wurde gezogen: $karte mit der Farbe $kartenFarbe")
        return null
    }
}

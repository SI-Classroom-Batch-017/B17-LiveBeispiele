fun main() {
    // in der das Kartendeck erstellt
    var deck: MutableList<String> = kartendeck.toMutableList()
    // und gemischt wird.
    mischen(deck)

    //Die Funktion wird dabei immer wieder aufgerufen bis der Kartenstapel leer ist, oder drei mal hintereinander falsch geraten wurde
    //Gib in jeder Runde entweder "richtig geraten!" oder "falsch geraten!" aus.
    // Gib "Gewonnen!" oder "Verloren!" aus wenn das Spiel vorbei ist
    //Achtung: Wenn eine Karte richtig erraten wurde wird mit dieser Karte weitergespielt! Sie ist dann die neue Vergleichskarte

    var karte: String = eineKarteZiehen(deck)
    var repeatFalseCounter: Int = 0
    var winCounter: Int = 0
    var lossCounter: Int = 0
    // bis der Kartenstapel leer ist, oder drei mal hintereinander falsch geraten wurde
    while (deck.isNotEmpty() && repeatFalseCounter < 3){
        val neusteKarte: String? = hochOderTief(deck, karte)

        if (neusteKarte != null) {
            karte = neusteKarte
            println("Richtig geraten!")
            winCounter++
            repeatFalseCounter = 0

        } else {
            karte = eineKarteZiehen(deck)
            println("Falsch geraten!")
            repeatFalseCounter++
            lossCounter++
        }
    }

    if (winCounter >= lossCounter && repeatFalseCounter < 3){
        println("Gewonnen! $winCounter x richtig geraten, $lossCounter x falsch geraten!")
    } else if (lossCounter > winCounter){
        println("Verloren! $winCounter x richtig geraten, $lossCounter x falsch geraten! ")
    } else if (repeatFalseCounter == 3){
        println("Du hast 3x nacheinander falsch geraten, du bist raus! Verloren.")
    }




}

fun hochOderTief(deck: MutableList<String>, aktuelleKarte: String): String? {

    // Der Wert der aktuell aufgedeckten Karte wird für den Spieler auf der Konsole ausgegeben
        // Wert der aktuellen Karte rausfinden
        val aktuellerKartenWert: Int = kartenWert(aktuelleKarte)
        // diesen Wert printen
        println("Die aktuelle Karte $aktuelleKarte hat den Wert $aktuellerKartenWert")


    //Die nächste Karte wird vom Stapel gezogen.
    val neueKarte: String = eineKarteZiehen(deck)
    val neueKarteWert: Int = kartenWert(neueKarte)


    //Der Spieler versucht zu erraten, ob die Karte höher oder tiefer ist.
    // Er wird in der Konsole danach gefragt.
    println("Ist die nächste Karte höher oder tiefer als $aktuellerKartenWert?")
    val userInput: String = readln().lowercase()

    if (userInput == "höher" && neueKarteWert > aktuellerKartenWert || userInput == "tiefer" && neueKarteWert < aktuellerKartenWert){
        println("Alte Karte: $aktuelleKarte, Wert: $aktuellerKartenWert")
        println("Neue Karte: $neueKarte, Wert: $neueKarteWert")
        // //Wenn die Antwort des Spielers stimmt, liefert die Funktion die gezogene Karte zurück
        //println("Super korrekt")
        return neueKarte
    } else {
        // sonst liefert sie null zurück
        println("Alte Karte: $aktuelleKarte, Wert: $aktuellerKartenWert")
        println("Neue Karte: $neueKarte, Wert: $neueKarteWert")
        //println("Leider falsch")
        return null
    }
}
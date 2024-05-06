package woche05.Tag05.musterloesung

fun main() {
    // Main-Funktion benötigst du nun nicht nur ein Kartendeck,
    var deck: MutableList<String> = kartendeck.toMutableList()
    // das gemischt wird
    mischen(deck)

    // sondern auch einen Kontostand des Spielers, den du mit einem Betrag deiner Wahl initialisieren kannst

    var kontoStand: Int = 100
    println("Spiel - Glücksspiel")

    // Erstelle ein Schleife, jeder Durchlauf stellt eine Runde dar.
    while (kontoStand > 0 && deck.isNotEmpty()) {

        // Der Spieler setzt einen Wetteinsatz, der den Kontostand nicht übersteigt
        var wettEinsatz: Int
        do {
            println("Zeit zu wetten... Kontostand: $kontoStand")
            wettEinsatz = readln().toInt()
            if (wettEinsatz > kontoStand) {
                println("Zu viel gewettet, gib einen Betrag unter $kontoStand ein...")
            }
            if (wettEinsatz <= 0) {
                println("Zu wenig gewettet...")
            }
        } while (wettEinsatz > kontoStand || wettEinsatz <= 0)

        // Eine Karte wird gezogen und es startet das erste Spiel "Rot oder Schwarz".
        println("Spiel 1: Rot oder Schwarz?")
        var aktuelleKarte: String? = rotOderSchwarz(deck)

        // Logik, um bescheid zu sagen, ob wir richtig oder falsch geraten haben und unseren Wetteinsatz zu verlieren
        if (aktuelleKarte != null) {
            println("Richtig geraten!")
            // println("Du hast Geld gewonnen!")
//        kontoStand += wettEinsatz
//        println("Neuer Kontostand: $kontoStand")
        } else {
            // Wenn der Spieler das erste Spiel verliert, wird sein Einsatz vom Konto abgezogen und die Runde endet (aber nicht das Spiel)
            println("Falsch geraten!")
            // Kontostand abziehen
            kontoStand -= wettEinsatz
            println("Neuer Kontostand: $kontoStand")
            if (kontoStand <= 0) {
                println("Geld leer! Du wirst rausgeschmissen...")
                break
            }
            println("Runde beendet. Neue Runde startet...")
            // Runde beenden, dh wir kommen nicht mehr in HochOderTief Spiel rein
            continue

        }

        // Wenn er das erste Spiel gewinnt, startet das zweite Spiel "Höher oder Tiefer". Dabei bleibt die Karte aus "Rot oder Schwarz" aufgedeckt.

        aktuelleKarte = hochOderTief(deck, aktuelleKarte)

        // Wenn der Spieler das zweite Spiel verliert, wird sein Einsatz vom Konto abgezogen und die Runde endet (aber nicht das Spiel).


        if (aktuelleKarte == null) {
            println("Falsch geraten! Du verlierst deinen Einsatz...")
            kontoStand -= wettEinsatz
            continue
        }

        // Wenn er das erste Spiel gewinnt, bekommt er das doppelte seines Einsatzes gutgeschrieben.

        println("Richtig geraten!")
        kontoStand += wettEinsatz * 2
        println("Neuer Kontostand: $kontoStand")


        // Die Runde ist damit vorbei und der Spieler kann entscheiden ob er eine weitere Runde spielen will.

        println("Nächste Runde? ja / nein ")
        val weiterSpielen: String = readln().lowercase()
        if (weiterSpielen == "nein") {
            println("Casino wird verlassen....")
            break
        }

    }

}
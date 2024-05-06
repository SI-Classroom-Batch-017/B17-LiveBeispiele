package woche05.Tag05.musterloesung

val kartendeck: List<String> = listOf(
    "Pik Ass", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10"
)

fun main() {

    //Ein Beispiel zur Anwendung der Funktionen und des Kartendecks
    val meinDeck = kartendeck.toMutableList()

    mischen(meinDeck)
    val karte = eineKarteZiehen(meinDeck)
    val beispielWert = kartenWert(karte)
    val beispielFarbe = kartenFarbe(karte)
    println("Die gezogene Karte hat den Wert $beispielWert und die Farbe $beispielFarbe")

}

// mischt das als Parameter übergebene Deck
fun mischen(deck: MutableList<String>) {
    deck.shuffle()
}

// gibt die oberste Karte aus dem Kartendeck als Rückgabewert zurück und entfernt sie auch aus diesem.
fun eineKarteZiehen(deck: MutableList<String>): String {
    val karte = deck.first()
    deck.remove(deck.first())
    return karte
}

// gibt die Farbe der ürbergebenen Karte zurück
fun kartenFarbe(karte: String): String {
    val kartenSymbol = karte.split(" ")[0]

    return when (kartenSymbol) {
        in listOf("Pik", "Kreuz") -> "schwarz"
        in listOf("Herz", "Karo") -> "rot"
        else -> ""
    }
}

//gibt den Wert der übergebenen Karte zurück.
// z.B.: "Kreuz 7" -> 7  | "Herz König" -> 10 | ...
fun kartenWert(karte: String): Int {
    val kartenWert = karte.split(" ")[1]

    return when (kartenWert) {
        "Ass" -> 1
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        "10" -> 10
        "Bube" -> 11
        "Dame" -> 12
        "Koenig" -> 13
        else -> 0
    }
}

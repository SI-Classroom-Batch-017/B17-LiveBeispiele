/*
In der Variable cards ist ein Kartenset in Form einer Liste gespeichert.
Beispiel:
    "♥️7" steht für die Karte "Herz Sieben"
    "♥️A" steht für die Karte "Herz Ass"
 */
val cards: MutableList<String> = mutableListOf(
    "♥️7", "♦️7", "♠️7", "♣️7",
    "♥️8", "♦️8", "♠️8", "♣️8",
    "♥️9", "♦️9", "♠️9", "♣️9",
    "♥️10", "♦️10", "♠️10", "♣️10",
    "♥️B", "♦️B", "♠️B", "♣️B",
    "♥️D", "♦️D", "♠️D", "♣️D",
    "♥️K", "♦️K", "♠️K", "♣️K",
    "♥️A", "♦️A", "♠️A", "♣️A",
    "🃏JOKER"
)

/*
In der Variable values sind die Werte der Karten in einer Map gespeichert.
Beispiel:
    "♥️7" to 1 steht für einen Wert von 1 für die Karte "Herz Sieben"
    "♥️A" to 8 steht für einen Wert von 8 für die Karte "Herz Ass"
Bei einem Vergleich der Werte würde also das "Herz Ass" gewinnen
 */
val cardValues: Map<String, Int> = mapOf(
    "♥️7" to 1, "♦️7" to 1, "♠️7" to 1, "♣️7" to 1,
    "♥️8" to 2, "♦️8" to 2, "♠️8" to 2, "♣️8" to 2,
    "♥️9" to 3, "♦️9" to 3, "♠️9" to 3, "♣️9" to 3,
    "♥️10" to 4, "♦️10" to 4, "♠️10" to 4, "♣️10" to 4,
    "♥️B" to 5, "♦️B" to 5, "♠️B" to 5, "♣️B" to 5,
    "♥️D" to 6, "♦️D" to 6, "♠️D" to 6, "♣️D" to 6,
    "♥️K" to 7, "♦️K" to 7, "♠️K" to 7, "♣️K" to 7,
    "♥️A" to 8, "♦️A" to 8, "♠️A" to 8, "♣️A" to 8,
    "🃏JOKER" to 10
)

fun main() {
    // Dies ist nur 1 mögliche Beispiellösung! Viele Wege führen nach Rom...
    cardGame()
}

fun cardGame() {
    // Schritt 1: Kartenstapel mischen
    cards.shuffle()

    // Schritt 2: Spielernamen eingeben
    val (player1Name, player2Name) = setNames()

    // Schritt 3: abwechselnd Karten ziehen
    val player1Cards: MutableList<String> = mutableListOf()
    val player2Cards: MutableList<String> = mutableListOf()

    drawPlayerHands(player1Name, player1Cards, player2Name, player2Cards)

    printInfo(player1Name, player1Cards, player2Name, player2Cards)


    // Schritt 4: Spieler stehlen Gegner-Karte
    stealCard(player2Cards, player1Name, player2Name, player1Cards)
    stealCard(player1Cards, player2Name, player1Name, player2Cards)

    printInfo(player1Name, player1Cards, player2Name, player2Cards)


    // Schritt 5: Spieler dürfen eine Karte abwerfen und neu ziehen
    replaceCard(player1Name, player1Cards)
    replaceCard(player2Name, player2Cards)

    // Schritt 6: Wer hat bessere Karten?
    var player1HandValue = calculateHandValue(player1Cards)
    var player2HandValue = calculateHandValue(player2Cards)

    println("$player1Name's Karten $player1Cards haben einen Wert von: $player1HandValue")
    println("$player2Name's Karten $player2Cards haben einen Wert von: $player2HandValue")
    println()
}

fun printInfo(
    player1Name: String,
    player1Cards: MutableList<String>,
    player2Name: String,
    player2Cards: MutableList<String>
) {
    println()
    println("${player1Name}'s Karten: $player1Cards")
    println("${player2Name}'s Karten: $player2Cards")
    println()
}

private fun calculateHandValue(player1Cards: MutableList<String>): Int {
    var player1HandValue = 0
    player1HandValue += cardValues[player1Cards[0]]!!
    player1HandValue += cardValues[player1Cards[1]]!!
    player1HandValue += cardValues[player1Cards[2]]!!
    return player1HandValue
}

fun replaceCard(playerName: String, playerCards: MutableList<String>) {
    println("$playerName, wirf eine Karte ab! Welche willst du abwerfen? 1 / 2 / 3")
    val indexPlayer = readln().toInt() - 1
    val removedCardPlayer = playerCards.removeAt(indexPlayer)
    val newCardPlayer = cards.removeFirst()
    playerCards.add(newCardPlayer)
    println("$playerName hat die Karte $removedCardPlayer abgeworfen und die Karte $newCardPlayer gezogen")
    println()
}

fun stealCard(
    victimHand: MutableList<String>,
    thief: String,
    victim: String,
    thiefHand: MutableList<String>
) {
    val stolenCard = victimHand.random()
    println("$thief hat die Karte $stolenCard von $victim gestohlen")
    victimHand.remove(stolenCard)
    thiefHand.add(stolenCard)
    println()
    println("️${thief}'s Karten: $thiefHand")
    println()
}

fun drawPlayerHands(
    player1Name: String,
    player1Cards: MutableList<String>,
    player2Name: String,
    player2Cards: MutableList<String>
) {
    repeat(3) {
        drawCard(player1Name, player1Cards)
        drawCard(player2Name, player2Cards)
    }
}

/**
 * Gibt uns ein Pair zurueck, deshalb auskommentiert und durch  drawPlayerHands ersetzt
 */
fun returnPlayerHands(
    player1Name: String,
    player2Name: String
): Pair<MutableList<String>, MutableList<String>> {
    val player1Cards: MutableList<String> = mutableListOf()
    val player2Cards: MutableList<String> = mutableListOf()
    drawCard(player1Name, player1Cards)
    drawCard(player2Name, player2Cards)
    drawCard(player1Name, player1Cards)
    drawCard(player2Name, player2Cards)
    drawCard(player1Name, player1Cards)
    drawCard(player2Name, player2Cards)
    println()
    println("${player1Name}'s Karten: $player1Cards")
    println("${player2Name}'s Karten: $player2Cards")
    println()
    return Pair(player1Cards, player2Cards)
}

fun drawCard(playerName: String, playerCards: MutableList<String>) {
    println("$playerName zieht eine Karte...")
    playerCards.add(cards.removeFirst())
}

fun setNames(): Pair<String, String> {
    println("Spieler 1, bitte gib deinen Namen ein...")
    val player1Name = readln()
    println("Spieler 2, bitte gib deinen Namen ein...")
    val player2Name = readln()
    println()
    return Pair(player1Name, player2Name)
}
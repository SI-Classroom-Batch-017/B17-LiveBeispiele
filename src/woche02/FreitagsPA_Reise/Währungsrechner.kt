fun main() {
    println("---Währungsrechner: Yen in Euro / Euro in Yen")
    println("Möchtest du von Euro nach Yen (1) oder von Yen nach Euro (2) umrechnen?")
    val choice = readln()

    if (choice == "1") {
        println("Bitte gib den Betrag in Euro ein:")
        val euroAmount: Double = try {
            readln().toDouble()
        } catch (e: NumberFormatException) {
            println("Ungültige Eingabe für den Betrag in Euro. Starte das Programm neu.")
            return
        }
        val yenAmount = euroAmount * 130
        println("$euroAmount Euro entsprechen $yenAmount Yen.")
    } else if (choice == "2") {
        println("Bitte gib den Betrag in Yen ein:")
        val yenAmount = try {
            readln().toDouble()
        } catch (e: NumberFormatException) {
            println("Ungültige Eingabe für den Betrag in Yen. Starte das Programm neu.")
            return
        }
        val euroAmount = yenAmount * 0.0062
        println("$yenAmount Yen entsprechen $euroAmount Euro.")
    } else {
        println("Ungültige Auswahl.  Starte das Programm neu und wähle 1 oder 2.")
    }
}
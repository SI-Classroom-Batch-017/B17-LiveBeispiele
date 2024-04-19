package woche03

import kotlin.random.Random

var spieler1Name = ""
var spieler2Name = ""

var spieler1Leben = 0
var spieler2Leben = 0

// Diese Variablen werden verwendet, um kurzzeitig Zahlen zu halten
var heilen: Int = 0
var schaden: Int = 0

fun main() {

    // -------------------------------------------------------------
    //
    //                      Das Duell
    //
    //  Das Spiel:
    //
    //  Der Spieler sucht sich zu Begin des Spiels für die
    //  zwei Akteure zwei Namen aus. Dann kämpfen die Akteure
    //  jeweils 3 Runden gegeneinander, wobei beide Akteure
    //  sich abwechselnd angreifen und dann heilen.
    //  Am Ende jeder Runde kann der Spieler für jeden Akteur
    //  eine Spezialattacke auswählen. Der Akteur, der am Ende
    //  des Spiels die meisten Lebenspunkte hat, gewinnt.
    //
    // -------------------------------------------------------------

    spielStart()

    runde()
    runde()
    runde()

    println("Spiel zu Ende")
}

fun spielStart() {
    // Wenn das Spiel startet, muss der Nutzer einen Namen für Spieler 1 und Spieler 2 eingeben
    println("Spieler 1, bitte gib deinen Namen ein...")
    spieler1Name = readln()
    println("Spieler 2, bitte gib deinen Namen ein...")
    spieler2Name = readln()
    println()

    // Spieler 1 und Spieler 2 bekommen zufällig zwischen 500 und 600 Lebenspunkte
    spieler1Leben = (500..600).random()
    spieler2Leben = (500..600).random()

    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")
    println()

    println("Es findet ein Duell zwischen $spieler1Name und $spieler2Name statt.")
    println()
    println("Möge der Bessere gewinnen!")
}

fun runde() {
    //Spielrunde
    println(
        "     ___   .___________.___________.    ___       ______  __  ___ \n" +
                "    /   \\  |           |           |   /   \\     /      ||  |/  / \n" +
                "   /  ^  \\ `---|  |----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
                "  /  /_\\  \\    |  |        |  |      /  /_\\  \\  |  |     |    <   \n" +
                " /  _____  \\   |  |        |  |     /  _____  \\ |  `----.|  .  \\  \n" +
                "/__/     \\__\\  |__|        |__|    /__/     \\__\\ \\______||__|\\__\\ \n" +
                "\n"
    )

    schaden = (10..100).random()
    println("$spieler1Name greift $spieler2Name an und verursacht $schaden Schadenspunkte.")
    spieler2Leben -= schaden
    println()

    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")

    println(
        "     ___   .___________.___________.    ___       ______  __  ___ \n" +
                "    /   \\  |           |           |   /   \\     /      ||  |/  / \n" +
                "   /  ^  \\ `---|  |----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
                "  /  /_\\  \\    |  |        |  |      /  /_\\  \\  |  |     |    <   \n" +
                " /  _____  \\   |  |        |  |     /  _____  \\ |  `----.|  .  \\  \n" +
                "/__/     \\__\\  |__|        |__|    /__/     \\__\\ \\______||__|\\__\\ \n" +
                "\n"
    )

    schaden = (10..100).random()
    println("$spieler2Name greift $spieler1Name an und verursacht $schaden Schadenspunkte.")
    spieler1Leben -= schaden
    println()

    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")

    println(
        " __    __   _______  __   __       _______ .__   __. \n" +
                "|  |  |  | |   ____||  | |  |     |   ____||  \\ |  | \n" +
                "|  |__|  | |  |__   |  | |  |     |  |__   |   \\|  | \n" +
                "|   __   | |   __|  |  | |  |     |   __|  |  . `  | \n" +
                "|  |  |  | |  |____ |  | |  `----.|  |____ |  |\\   | \n" +
                "|__|  |__| |_______||__| |_______||_______||__| \\__| \n" +
                "\n"
    )

    heilen = (5..50).random()
    println("$spieler1Name heilt sich um $heilen Lebenspunkte.")
    spieler1Leben += heilen

    heilen = (5..50).random()
    println("$spieler2Name heilt sich um $heilen Lebenspunkte.")
    spieler2Leben += heilen
    println()

    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")

    println(
        "     _______..______    _______  ________   __       ___       __      \n" +
                "    /       ||   _  \\  |   ____||       /  |  |     /   \\     |  |     \n" +
                "   |   (----`|  |_)  | |  |__   `---/  /   |  |    /  ^  \\    |  |     \n" +
                "    \\   \\    |   ___/  |   __|     /  /    |  |   /  /_\\  \\   |  |     \n" +
                ".----)   |   |  |      |  |____   /  /----.|  |  /  _____  \\  |  `----.\n" +
                "|_______/    | _|      |_______| /________||__| /__/     \\__\\ |_______|\n" +
                "\n"
    )

    println("Welche Spezialattacke soll $spieler1Name ausführen?")
    println("Diese Spezialattacken sind verfügbar:")
    println("1. Schwertschlag")
    println("2. Feuerball")
    println("3. Giftangriff")
    println("Bitte gib den Index für die Spezialattacke an.")

    val auswahl1Runde1 = readln().toInt()

    when (auswahl1Runde1) {
        1 -> {
            val schaden = 25
            println("$spieler1Name fügt $spieler2Name mit der Spezialattacke Schwertschlag $schaden zu.")
            spieler2Leben -= schaden
        }

        2 -> {
            val schaden = 50
            println("$spieler1Name fügt $spieler2Name mit der Spezialattacke Feuerball $schaden zu.")
            spieler2Leben -= schaden
        }

        3 -> {
            val schaden = 30
            println("$spieler1Name fügt $spieler2Name mit der Spezialattacke Giftangriff $schaden zu.")
            spieler2Leben -= schaden
        }

        else -> {
            println("Ungültige Auswahl. Normale Attacke wird durchgeführt.")
            schaden = (10..100).random()
            println("$spieler1Name greift $spieler2Name an und verursacht $schaden Schadenspunkte.")
            spieler2Leben -= schaden
        }
    }

    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")

    println(
        "     _______..______    _______  ________   __       ___       __      \n" +
                "    /       ||   _  \\  |   ____||       /  |  |     /   \\     |  |     \n" +
                "   |   (----`|  |_)  | |  |__   `---/  /   |  |    /  ^  \\    |  |     \n" +
                "    \\   \\    |   ___/  |   __|     /  /    |  |   /  /_\\  \\   |  |     \n" +
                ".----)   |   |  |      |  |____   /  /----.|  |  /  _____  \\  |  `----.\n" +
                "|_______/    | _|      |_______| /________||__| /__/     \\__\\ |_______|\n" +
                "\n"
    )

    println("Welche Spezialattacke soll $spieler2Name ausführen?")
    println("Diese Spezialattacken sind verfügbar:")
    println("1. Schwertschlag")
    println("2. Feuerball")
    println("3. Giftangriff")
    println("Bitte gib den Index für die Spezialattacke an.")

    val auswahl2Runde1 = readln().toInt()

    when (auswahl2Runde1) {
        1 -> {
            val schaden = 25
            println("$spieler2Name fügt $spieler1Name mit der Spezialattacke Schwertschlag $schaden zu.")
            spieler1Leben -= schaden
        }

        2 -> {
            val schaden = 50
            println("$spieler2Name fügt $spieler1Name mit der Spezialattacke Feuerball $schaden zu.")
            spieler1Leben -= schaden
        }


        3 -> {
            val schaden = 30
            println("$spieler2Name fügt $spieler1Name mit der Spezialattacke Giftangriff $schaden zu.")
            spieler1Leben -= schaden
        }

        else -> {
            println("Ungültige Auswahl. Normale Attacke wird durchgeführt.")
            schaden = (10..100).random()
            println("$spieler2Name greift $spieler1Name an und verursacht $schaden Schadenspunkte.")
            spieler1Leben -= schaden
        }
    }

    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")
}
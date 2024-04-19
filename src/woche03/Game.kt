package woche03

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

    spielEnde()
}

fun spielEnde() {
    println("Spiel zu Ende")
    if (spieler1Leben > spieler2Leben) {
        println("$spieler1Name hat gewonnen!")
    } else if (spieler2Leben > spieler1Leben) {
        println("$spieler2Name hat gewonnen!")
    } else {
        println("Unentschieden!")
    }
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

    printLifePoints()
    println()

    println("Es findet ein Duell zwischen $spieler1Name und $spieler2Name statt.")
    println()
    println("Möge der Bessere gewinnen!")
}

fun runde() {
    //Spielrunde
    // 1. Spieler1 und Spieler2 greifen sich nacheinander an
    attackPhase()

    // beide Spieler heilen sich:
    healPhase()

    // Spieler1 und Spieler2 greifen sich nacheinander mit Spezialattacke an
    specialAttackPhase()
}


fun specialAttackPhase() {
    spieler2Leben -= specialAttack(spieler1Name, spieler2Name)
    printLifePoints()

    spieler1Leben -= specialAttack(spieler2Name, spieler1Name)
    printLifePoints()
}

fun specialAttack(angreifer: String, opfer: String): Int {
    printSpecial()
    val auswahl = printSpecialAttack(angreifer)
    return specialAttackPicker(auswahl, angreifer, opfer)
}

fun specialAttackPicker(auswahl: Int, angreifer: String, opfer: String): Int {
    when (auswahl) {
        1 -> {
            val schaden = 25
            println("$angreifer fügt $opfer mit der Spezialattacke Schwertschlag $schaden zu.")
            return schaden
        }

        2 -> {
            val schaden = 50
            println("$angreifer fügt $opfer mit der Spezialattacke Feuerball $schaden zu.")
            return schaden
        }

        3 -> {
            val schaden = 30
            println("$angreifer fügt $opfer mit der Spezialattacke Giftangriff $schaden zu.")
            return schaden
        }

        else -> {
            println("Ungültige Auswahl. Normale Attacke wird durchgeführt.")
            val schaden = (10..100).random()
            println("$angreifer greift $opfer an und verursacht $schaden Schadenspunkte.")
            return schaden
        }
    }
}

fun printSpecialAttack(angreifer: String): Int {
    println("Welche Spezialattacke soll $angreifer ausführen?")
    println("Diese Spezialattacken sind verfügbar:")
    println("1. Schwertschlag")
    println("2. Feuerball")
    println("3. Giftangriff")
    println("Bitte gib den Index für die Spezialattacke an.")

    val auswahl = readln().toInt()
    return auswahl
}

fun printSpecial() {
    println(
        "     _______..______    _______  ________   __       ___       __      \n" +
                "    /       ||   _  \\  |   ____||       /  |  |     /   \\     |  |     \n" +
                "   |   (----`|  |_)  | |  |__   `---/  /   |  |    /  ^  \\    |  |     \n" +
                "    \\   \\    |   ___/  |   __|     /  /    |  |   /  /_\\  \\   |  |     \n" +
                ".----)   |   |  |      |  |____   /  /----.|  |  /  _____  \\  |  `----.\n" +
                "|_______/    | _|      |_______| /________||__| /__/     \\__\\ |_______|\n" +
                "\n"
    )
}

fun attackPhase() {
    // attacke gibt uns den Schaden zurueck, der dem Opfer abgezogen werden soll.
    // 1. Spieler1 greift Spieler2 an
    spieler2Leben = spieler2Leben - attack(spieler1Name, spieler2Name)
    printLifePoints()

    // 1. Spieler2 greift Spieler1 an
    // kurze schreibweise zum - rechnen:
    spieler1Leben -= attack(spieler2Name, spieler1Name)
    printLifePoints()
}


fun healPhase() {
    printHeal()

    spieler1Leben += healPlayer(spieler1Name)
    spieler2Leben += healPlayer(spieler2Name)

    println()
    printLifePoints()
}




fun printHeal() {
    println(
        " __    __   _______  __   __       _______ .__   __. \n" +
                "|  |  |  | |   ____||  | |  |     |   ____||  \\ |  | \n" +
                "|  |__|  | |  |__   |  | |  |     |  |__   |   \\|  | \n" +
                "|   __   | |   __|  |  | |  |     |   __|  |  . `  | \n" +
                "|  |  |  | |  |____ |  | |  `----.|  |____ |  |\\   | \n" +
                "|__|  |__| |_______||__| |_______||_______||__| \\__| \n" +
                "\n"
    )
}

fun healPlayer(zuHeilenderPlayer: String): Int {
    heilen = (5..50).random()
    println("$zuHeilenderPlayer heilt sich um $heilen Lebenspunkte.")
    return heilen
}





fun attack(angreifer: String, opfer: String): Int {
    printAttack()

    schaden = (10..100).random()
    println("$angreifer greift $opfer an und verursacht $schaden Schadenspunkte.")
    return schaden
    // alternative ohne return, einfach auf die globalen Variablen zugreifen darauf ankommend, wer gerade angreift/opfer ist:
    if (angreifer == spieler1Name) {
        spieler2Leben -= schaden
    }
    else {
        spieler1Leben -= schaden
    }
}

fun printAttack() {
    println(
        "     ___   .___________.___________.    ___       ______  __  ___ \n" +
                "    /   \\  |           |           |   /   \\     /      ||  |/  / \n" +
                "   /  ^  \\ `---|  |----`---|  |----`  /  ^  \\   |  ,----'|  '  /  \n" +
                "  /  /_\\  \\    |  |        |  |      /  /_\\  \\  |  |     |    <   \n" +
                " /  _____  \\   |  |        |  |     /  _____  \\ |  `----.|  .  \\  \n" +
                "/__/     \\__\\  |__|        |__|    /__/     \\__\\ \\______||__|\\__\\ \n" +
                "\n"
    )
}


fun printLifePoints() {
    println("$spieler1Name hat noch $spieler1Leben Lebenspunkte.")
    println("$spieler2Name hat noch $spieler2Leben Lebenspunkte.")
    println()
}
package woche02

// Programm schreiben, das den Nutzer nach 2 Zahlen fragt, danach, welche Operation er ausführen will (*,/,+,-,%), dann Ergebnis ausdruckt


fun main() {
    println("Bitte gib die 1. Zahl ein...")
    var nr1: Double = readln().toDouble()
    println("Bitte gib eine 2. Zahl ein...")
    var nr2: Double = readln().toDouble()

    println("Welche Operation willst du machen? (*,/,+,-,%)")

    var operator: String = readln()

    // je nachdem, Welche Operation gewählt wurde, das Ergebnis berechnen

    val result: Double = when(operator){
        "*" -> {
            println("$nr1 * $nr2 =")
            nr1 * nr2
        }
        "/" -> {

            println("$nr1 / $nr2 =")
            nr1 / nr2
        }
        "+" -> {
            println("$nr1 + $nr2 =")
            nr1 + nr2
        }
        "-" -> {
            println("$nr1 - $nr2 =")
            nr1 - nr2
        }
        "%" -> {
            println("$nr1 % $nr2 =")
            nr1 % nr2
        }
        else -> {
            println("Keine gültige Operation angegeben, starte das Programm erneut.")
            // bei Versagen, Operator einzugeben, wird nicht gerechnet, sondern als Standard 0.0 zurueck gegeben
            0.0
        }
    }

    println("$result")


}




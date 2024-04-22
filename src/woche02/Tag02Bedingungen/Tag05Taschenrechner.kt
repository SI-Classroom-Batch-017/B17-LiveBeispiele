package woche02.Tag02Bedingungen

// Programm schreiben, das den Nutzer nach 2 Zahlen fragt, danach, welche Operation er ausführen will (*,/,+,-,%), dann Ergebnis ausdruckt


fun main() {

    println("Bitte gib die 1. Zahl ein...")
    // 1. Variante: erst readln, dann leeres Double, dann das Double im try konvertieren
    var nr1Input: String = readln()
    var nr1: Double? = null

    // 2., kürzere Variante: Double anlegen, readln.toDobule im try block machen
    var nr2: Double = 0.0



    try {
        nr1 = nr1Input.toDouble()
        println("Bitte gib eine 2. Zahl ein...")
        nr2 = readln().toDouble()
    } catch (e: NumberFormatException){
        println("Fehler bei der Zahleneingabe! $e")
    }

    println("Welche Operation willst du machen? (*,/,+,-,%)")
    var operator: String = readln()

    // je nachdem, Welche Operation gewählt wurde, das Ergebnis berechnen

    val result: Double? = when(operator){
        "*" -> {
            println("$nr1 * $nr2 =")
            nr1?.times(nr2)
        }
        "/" -> {
            println("$nr1 / $nr2 =")
            nr1?.div(nr2)
        }
        "+" -> {
            println("$nr1 + $nr2 =")
            nr1?.plus(nr2)
        }
        "-" -> {
            println("$nr1 - $nr2 =")
            nr1?.minus(nr2)
        }
        "%" -> {
            println("$nr1 % $nr2 =")
            nr1?.rem(nr2)
        }
        else -> {
            println("Keine gültige Operation angegeben, starte das Programm erneut.")
            // bei Versagen, Operator einzugeben, wird nicht gerechnet, sondern als Standard null zurueck gegeben
            null
        }
    }

    if (result == Double.POSITIVE_INFINITY){
        throw Exception("Durch 0 teilen ergibt Infinity, starte neu...")
    }

    println("$result")


}




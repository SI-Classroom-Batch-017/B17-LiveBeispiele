package woche02

// Programm schreiben, das den Nutzer nach 2 Zahlen fragt, danach, welche Operation er ausführen will (*,/,+,-,%), dann Ergebnis ausdruckt


fun main() {
    try{
        println("Bitte gib die 1. Zahl ein...")
        var nr1: Double = readln().toDouble()
        println("Welche Operation willst du machen? (*,/,+,-,%)")
        var operator: String = readln()
        println("Bitte gib eine 2. Zahl ein...")
        var nr2: Double = readln().toDouble()



        // je nachdem, Welche Operation gewählt wurde, das Ergebnis berechnen

        val result: Double? = when(operator){
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
                // bei Versagen, Operator einzugeben, wird nicht gerechnet, sondern als Standard null zurueck gegeben
                null
            }
        }

        if (result == Double.POSITIVE_INFINITY){
            throw Exception("Durch 0 teilen ergibt Infinity, starte neu...")
        }

        println("$result")

    } catch (e: NumberFormatException){
        println("Fehler bei der Zahleneingabe! $e")
    } catch (e: ArithmeticException){
        println("Fehler! Man darf nicht durch 0 teilen! $e")
    } catch (e: Exception){
        println("Weder NFE, AE: $e")
    }



}




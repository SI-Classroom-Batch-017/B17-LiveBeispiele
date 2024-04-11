package woche02.Tag04TryCatch

// Programm schreiben, dass 2 Zahleneingaben erwartet und nr1 durch nr2 teilt, mögliche Exceptions dabei abfangen


fun main() {
    var nr1String: String = readln()
    var nr2String: String = readln()
    var nr1: Int = 0
    var nr2: Int = 0
    var result: Int = 0


    try {
        nr1 = nr1String.toInt()
        nr2 = nr2String.toInt()

        result = nr1 / nr2

        // 100000 Zeile


    } catch (e: ArithmeticException){
        println("AE aufgefangen: $e")
        println("Wir duerfen nicht durch 0 teilen.... Probier's nochmal.")

    } catch (e: NumberFormatException){
        println("NFE aufgefangen: $e")
        println("Du hast keine Zahl eingegeben")
    }

    println("Das Ergebnis von $nr1 / $nr2 ist $result")

}
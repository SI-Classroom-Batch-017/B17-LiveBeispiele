package woche01

fun main() {

    // toDouble()
    val stringNr: String = "123.0" // Kommas sind IMMER . (Punkte) , nicht , (Kommas)

    val stringResult = stringNr + 10 // die wird konkateniert, statt dass gerechnet wird. Mit Strings kann man nicht rechnen
    println("Ergebnis von \"123.0\" + 10 = $stringResult") // Ergebnis von "123.0" + 10 = 123.010

    val stringNrToDouble: Double = "123".toDouble() // 123.0
    val stringNrToDoubleMitVariable: Double = stringNr.toDouble() // 123.0

    println("Ergebnis von 123.0 (zum Double konvertiert) + 10 = ${stringNrToDouble+10.0}")

    // toInt()
    val doubleNr: Double = 10.5
    val doubleToInt: Int = doubleNr.toInt() // 10, Nachkommastelle wird abgeschnitten
    println("Double $doubleNr zum Integer machen ergibt $doubleToInt")

    // toString()
    val doubleNumber: Double = 100.7
    // doubleNumber = doubleNumber + " ist eine Zahl." // geht nicht, da wir in ein Double keinen String, der jetzt rauskommen würde, speichern dürfen
    println(doubleNumber+0.3) // Ergebnis: 101.0

    var doubleToString: String = doubleNumber.toString()
    doubleToString = doubleToString + " ist eine Zahl."

    //toBoolean


    // Konvertierung in 2 Schritten (lange Version)
    val x: String = readln()
    val xConverted: Double = x.toDouble()

    // Konvertierung in 1 einzigen Schritt (kurze Version)
    val z: Double = readln().toDouble()

    println(x)
    println(x + 10)

    var string : String = "Hier im String findet Rechenlogik statt: 3+4= ${3+4}"
    println("Hier im String findet Rechenlogik statt: 3+4= ${3+4}")

    var rechnung: Int = (4+4) + (3+5)

}
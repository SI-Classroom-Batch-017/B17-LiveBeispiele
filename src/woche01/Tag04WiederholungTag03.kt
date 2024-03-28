package woche01

// Globale Variablen: ausserhalb von Funktionen, solange sie im gleichen package sind, werden sie in allen anderen Dateien, die im package liegen, erkannt (hier in woche01)
var BEISPIEL_GLOBAL: String = "Dies hier ist eine globale Variable"
fun main() {

    // Wiederholung Typkonvertierung
    println("Bitte gib eine Zahl ein...")

    // kurze Variante: direkt in 1 Schritt
    var number: Int = readln().toInt()

    // lang Variante: 1 Variable für einen String, 2. Variable für die konvertierte Zahl
    val stringNumber: String = readln()

    println("Ergebnis: ${stringNumber + 333}") // 1333
    // Variable fuer das Int extra erstellen, die originale stringNumber Variable wird NICHT verändert
    var intNumber: Int = stringNumber.toInt()
    println(intNumber+333) // 334

    println("------------")
    var nr: Int = 1 + 2
    var nr1: Int = 1
    var nr2: Int = 2
    var readlnInt: Int = readln().toInt()

    // Variablen koennen aus anderen Variablen oder Funktionsaufrufen, die den ensprechenden Datentyp zurueckgeben, zusammengesetzt werden
    var result: Int = nr1 + nr2 + 0 + 9 + nr + readlnInt + readln().toInt() + 99
    println(result)



}

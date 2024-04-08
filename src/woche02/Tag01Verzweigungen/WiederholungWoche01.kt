package woche02.Tag01Verzweigungen

fun main() {
    // Variablen anlegen
    var firstName: String = "Marius"
    var isSunShining: Boolean = true
    var nr1: Double = 1.0
    var nr2: Int = 1

    // Variable aktualisieren
    firstName = "Simon"

    println("Der Namen lautet: $firstName")
    println("Der Namen lautet: firstName")

    println("Bitte gib eine Zahl ein...")
    var input: String = readln()
    // input ist ein String, daher bedeutet das + Konkatenation (Verkettung), die 2 wird ans Ende gehängt
    println(input + 2)

    // das funktioniert nicht: input ist und bleibt ein String. wir brauchen eine neue Variable
    // input = readln().toInt()

    // Konvertierung von readln() in 1 einzigen Schritt
    var input2: Int = readln().toInt()

    // originalen Input später konvertieren:
    var input3: Int = input.toInt()
    println(input2 + 2)
    println(input3 + 2)




}
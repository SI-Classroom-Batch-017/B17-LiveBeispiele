package woche03.Tag04Dokumentation

fun main() {
    // Funktionen ohne return Wert geben immer Kotlin.Unit zurück
    // so machen wir es also NICHT:
    println(greeting()) // Kotlin.Unit wird gedruckt, nachdem greeting() ausgefuehrt wurde
    var gruss = greeting() // Kotlin.Unit wird in gruss gespeichert, nachdem greeting() ausgefuehrt wurde
    println(gruss)
    println("-----")
    greeting()


    // Funktionen mit return geben immer das Ergebnis, das hinter dem return Schlüsselwort am Ende der Funktion steht, zurück
    var result: Double = divide()
    println(result+10.0)
    // das gleiche nur ohne Variable:
    println(divide()+10.0)

    // Funktionsaufrufe können unendlich tief geschachtelt werden
    println("Gib 1 Double ein:")
    var readlnResult = readln().toDouble()
    println("Gib 2 weitere Doubles ein:")
    val divideSum: Double =
        divide() +
                13.0 +
                divide(9.0,3.0) +
                divide(readlnResult, readln().toDouble()) +
                divide(
                    divide(),
                    divide(readln().toDouble(),5.0)
                )

    // um Ergebnis weiter zu benutzen, müssen wir es in eine Variable packen. Sonst wird es in Zeile 19 sofort wieder vergessen
    var result2: Double = divide(4.0,2.0)

    var endResult: Double = divideSum + result2


}

// 1. Stufe: einfache Void-Funktion (Void = ohne return Wert)
fun greeting(){
    println("Hallo, wie geht's?")
}


// 2. Stufe: einfache return Funktion (mit return Wert)
// braucht return Wert Datentypen und return Ausdruck mit Ergebnis dahinter
fun divide(): Double {
    // 1. Variante
    return 10.0/2.0

    // sobald return kommt wird aus der Funktion rausgesprungen, alle Code Zeilen darunter werden niemals erreicht:
    // 2. Variante
    return readln().toDouble()/ readln().toDouble()

    // 3. Variante
    var nr1: Double = readln().toDouble()
    var nr2: Double = readln().toDouble()
    var result = nr1/nr2
    return result

    // 4. Variante
    return nr1/nr2
}


// 3. Stufe: Funktion mit Parametern
// btw: Funktionen dürfen gleich heißen, solange sie unterschiedliche Signaturen haben (heißt: solange sie unterschiedliche Parameter haben)
fun divide(nr1: Double, nr2: Double): Double {
    return nr1/nr2

}












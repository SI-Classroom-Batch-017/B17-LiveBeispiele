package woche03.Tag04Parameter

fun calculateAge(): Int {
    println("Geburtstagsrechner")
    // User sein Geburtsjahr eingeben lassem
    val birthYear: Int = readlnToInt()
    // und das aktuelle Alter in 2024 ausrechnen lässt
    val age: Int = 2024-birthYear
    return age // oder direkt: return 2024-birthYear

    // unreachable code: nach dem return wird die fun verlassen, zeile 12 wird niemals ausgefuehrt.
    println("Dein Alter, wenn du in $birthYear geboren bist, ist in 2024 $age")
}

fun readlnToInt(): Int {
    println("Bitte gib eine Zahl ein...")
    return readln().toInt()
    // lange Alternative mit 2 Variablen:
//    var input: String = readln()
//    var inputAsInt: Int = input.toInt()
//    return inputAsInt

}

fun calcAgeShort(): Int {
    return 2024 - readlnToInt()
}
fun main() {
    var age: Int = calculateAge()
}

fun multWithReturn() : Int {
    var nr1: Int = readlnToInt()
    var nr2: Int = readlnToInt()
    var result: Int = nr1*nr2
    println("Ergebnis der Multiplikation von $nr1 und $nr2 = $result")
    return result
}
package woche03.Tag02ReturnFunktionen

fun calculateAge(): Int {
    // die den User sein Geburtsjahr eingeben lässt
    println("Bitte gib dein Geburtsjahr ein...")
    val birthYear: Int = readln().toInt()
    // und das aktuelle Alter in 2024 ausrechnen lässt
    val age: Int = 2024-birthYear
    return age // oder direkt: return 2024-birthYear

    // unreachable code: nach dem return wird die fun verlassen, zeile 11 wird niemals ausgefuehrt.
    println("Dein Alter, wenn du in $birthYear geboren bist, ist in 2024 $age")
}

fun calcAgeShort(): Int {
    println("Bitte gib dein Geburtsjahr ein...")
    return 2024 - readln().toInt()
}
fun main() {
    var age: Int = calculateAge()
}
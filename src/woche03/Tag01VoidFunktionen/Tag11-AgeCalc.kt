package woche03.Tag01VoidFunktionen

// was drauf steht, ist auch drin: Name der fun soll aussagen, was genau die Funktion tut
fun calculateAge(){
    // die den User sein Geburtsjahr eingeben lässt
    println("Bitte gib dein Geburtsjahr ein...")
    val birthYear: Int = readln().toInt()
    // und das aktuelle Alter in 2024 ausrechnen lässt
    val age: Int = 2024-birthYear
    println("Dein Alter, wenn du in $birthYear geboren bist, ist in 2024 $age")
}


// Funktion aufrufen: in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.main() in dieser Datei, in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.main() in Tag11-Funktionen
fun main() {
    // woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.main soll immer moeglichst schlank sein, ist das Steuerzentrum/Gehirn des Programms
    choices()
}

fun choices() {
    println("Welche Funktion willst du aufrufen?")
    println("1 -> printName(), 2 -> calculateAge()")
    val input: String = readln()
    if (input == "1") {
        printName()
    } else if (input == "2") {
        calculateAge()
    }
}



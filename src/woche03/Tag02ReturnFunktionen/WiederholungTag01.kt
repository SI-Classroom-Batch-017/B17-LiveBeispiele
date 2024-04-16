package woche03.Tag02ReturnFunktionen


fun main() {
//    println("1. Aufruf von printStringLength()")
//    printStringLength()
//    println("2. Aufruf von printStringLength()")
//    printStringLength()
//    println("3. Aufruf von printStringLength()")
//    printStringLength()
//    println("Aufruf von mult:")
    var ergebnis = mult() // Ergebnis soll eig Double sein, wenn ich Datentypen weglasse, füllt das Programm Unit rein
    var name = printName() // name soll eig ein String sein
    println("Ergebnis: $ergebnis")
    println("Name: $name")
}

fun printName()    {
    println("Bitte gib deinen Namen ein...")
    var name = readln()
    println("Dein Name ist: $name")
}
fun mult(){
    println("Bitte 2 Zahlen eingeben...")
    var nr1: Double = readln().toDouble()
    var nr2: Double = readln().toDouble()
    var result: Double = nr1*nr2
    println("Ergebnis der Multiplikation von $nr1 und $nr2 = $result")
}

fun printStringLength() {
    println("Bitte einen String eingeben... Ich sage dir, wie viele Zeichen er hat.")
    val stringInput: String = readln()
    val stringLength: Int = stringInput.length
    println("Die Länge des Strings ist: $stringLength")
}

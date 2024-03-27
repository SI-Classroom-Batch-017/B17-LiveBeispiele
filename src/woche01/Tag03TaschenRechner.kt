package woche01

fun main() {
    // Programm, das einen Taschenrechner zum Plus Rechnen simuliert
    // Der Nutzer soll 2 Zahlen eingeben, die addiert werden sollen

    println("Willkommen im Summen Rechner!")
    println("Bitte 2 Zahlen eingeben...")

    // kurze Version: in einem einzigen Schritt Variable anlegen, readln() nutzen und direkt zum Int machen
    var zahl1: Int = readln().toInt()
    var zahl2: Int = readln().toInt()
    var result = zahl1+zahl2

    println("Das Ergebnis von $zahl1 + $zahl2 ist: ${zahl1+zahl2}")
    println("Das Ergebnis von $zahl1 + $zahl2 ist: $result")


    // LANGE VERSION: in 2 Schritten erst Variable als String mit readln() anlegen
    var zahl1String: String = readln()
    // dann auf dieser Variable die Konvertierung machen
    var zahl1Int: Int = zahl1String.toInt()


}
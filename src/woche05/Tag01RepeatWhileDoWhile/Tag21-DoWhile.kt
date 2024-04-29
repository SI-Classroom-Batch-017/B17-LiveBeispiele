package VORLESUNG.Woche05.Tag21


fun main() {
    // do while: ich will den Schleifenköper MINDESTENS 1 x ausfuühren, auch, wenn die Bedingung beim 1. Mal direkt stimmt.
    // positive Zahl eingeben und prüfen, ob sie positiv ist. wenn nicht nochmal eingeben
    // --> hiermit können wir ab jetzt dafür sorgen, dass das Programm bei falschen Eingaben neu startet
    // do While: Zahlen Eingabe
    var number: Int
    do {
        println("Bitte gib eine positive Zahl über 0 ein.....")
        number = readln().toInt()
    } while (number <= 0)

    println("Super, du hast mit $number eine Zahl > 0 eingegeben!")



    // Elemente aus der Liste entfernen, bis nur noch 1 Element übrig ist
    val movies = mutableListOf("Inception", "Tenet", "Dunkirk", "Memento", "The Dark Knight")
    // do While: letztes Element so lange entfernen, bis nur noch Inception (= 1 Element in der Liste) übrig ist





    // password und prüfen, ob es stimmt. wenn nicht, nochmal eingeben


}

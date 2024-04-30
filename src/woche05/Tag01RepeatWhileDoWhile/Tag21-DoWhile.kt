package VORLESUNG.Woche05.Tag21


fun main() {
    // do while: ich will den Schleifenköper MINDESTENS 1 x ausfuühren, auch, wenn die Bedingung beim 1. Mal direkt stimmt.
    // positive Zahl eingeben und prüfen, ob sie positiv ist. wenn nicht nochmal eingeben
    // --> hiermit können wir ab jetzt dafür sorgen, dass das Programm bei falschen Eingaben neu startet
    // do While: Zahlen Eingabe
    //doWhilePositiveNumber()


    // Elemente aus der Liste entfernen, bis nur noch 1 Element übrig ist
    val movies = mutableListOf("Inception", "Tenet", "Dunkirk", "Memento", "The Dark Knight")
    // do While: letztes Element so lange entfernen, bis nur noch Inception (= 1 Element in der Liste) übrig ist
    //doWhileMovies(movies)


    // Name und prüfen, ob er nicht leer ist. wenn doch, nochmal laufen
    doWhileName()


}

fun doWhilePositiveNumber() {
    var number: Int
    do {
        println("Bitte gib eine positive Zahl über 0 ein.....")
        number = readln().toInt()
    } while (number <= 0)

    println("Super, du hast mit $number eine Zahl > 0 eingegeben!")
}

fun doWhileName() {
    var input: String
    // do körper wird mind. 1x ausgeführt
    do {
        println("Name eingeben....")
        input = readln()
    } while (input.isEmpty())

    println("Hallo, $input")
}

fun doWhileMovies(movies: MutableList<String>) {
    var i = movies.size - 1 // fangen beim letzten element an
    do {
        println("Zu entfernendes Element: ${movies[i]}")
        // das element entfernen
        movies.removeAt(i)
        println("Länge der Liste nach dem Entfernen: ${movies.size}")
        println("Übrige Elemente: $movies")
        i--
    } while (i > 0)
}

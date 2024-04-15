package woche03.Tag01VoidFunktionen

fun main() {
    println("Es folgt der Funktionsaufruf von printName....")
    printName()
    println("----")
    printName()
    println("----")
    printName()
    println("----")

    // funktionen aus anderen dateien lassen sich ebenfalls hier aufrufen, solange sie im gleichen package (Ordner) lokalisiert sind
    calculateAge()

    printStars()
}

// Sinn von Funktionen: Wiederholbarer Code, der nicht immmer wieder geschrieben werden muss!


// ## Aufgabe 6: Sternchen drucken
//Erstelle eine Funktion `printStars()`, die mit Hilfe der `repeat()`-Funktion 13 Sternchen (*)
//- a) in einer Zeile
//- b) in 13 Zeilen
// ausdruckt. User darf wählen, was er will

fun printStars(){
    // User darf wählen, was er will, 13 * in einer Zeile oder in 13 Zeilen
    println("Willst du deine Sternchen [1] in einer Zeile oder [2] in 13 Zeilen gedruckt haben?")
    val input: String = readln()
    when{
        input == "1" -> {
            repeat(13){
                print("*")
            }
        }
        input == "2" -> {
            print13Stars()
        }
    }
}

fun print13Stars() {
    repeat(13){
        println("*")
    }
}

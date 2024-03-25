// package = Ordner. Diese Datei befindet sich im Ordner "woche01"
package woche01

/*
 die main() Funktion ist der Einstiegspunkt eines Kotlin-Programms.
 Wird aufgerufen, wenn ein Programm gestartet wird
 */


fun main() {
    // println druckt (= print) eine Zeichenfolge auf der Standardausgabe (Konsole) aus, gefolgt von einem Zeilenumbruch (=ln, line)
    // LiveBeispiel 1.1
    print("Nach dieser Zeile kommt kein Zeilenumbruch...") // print ohne ln macht keinen Zeilenumbruch
    println("Hello World! 1")
    println() // leere Zeile wird gedruckt
    // println("Hello World! 2") // auskommentierter Code, wird nicht ausgeführt
    println()
    println("Hello World! 3")
    println("Hello World! 4")

    // Compilefehler:
    // unbekannte Funktion:
    //prnnnnln("Hallo")
    // unbekannte Syntax:
    //bla bla hallo wie geht's

    // geschweifte Klammer schreiben: option + 8 { }

    // LiveBeispiel 1.2 Vorschau: readln()
    println("Bitte gib ein Wort ein:")
    var input = readln()
    println("Ich habe gerade folgendes in der Konsole eingegeben: input")
    println("Ich habe gerade folgendes in der Konsole eingegeben: $input")

}
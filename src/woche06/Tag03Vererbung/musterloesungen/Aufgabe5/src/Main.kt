package woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src

import Book
import Page

fun main() {
    val book = Book(
        listOf(
            Page("Das ist der Anfang des Buches."),
            Page("Jetzt sind wir auf Seite 2."),
            Page("Hier haben wir gerade Seite 3. erreicht."),
            Page("Nun sind wir bei der letzten Seite angekommen."),
        )
    )
    book.read()
    book.nextPage()
    book.read()
    book.nextPage()
    book.read()
    book.nextPage()
    book.read()
    book.nextPage()

    println()

    book.read()
    book.previousPage()
    book.read()
    book.previousPage()
    book.read()
    book.previousPage()
    book.read()
    book.previousPage()
}
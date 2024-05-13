package woche04.Tag02MehrOperationen

import kotlin.system.exitProcess

/*
In dieser Aufgabe sollst du einige Zahlen über die Konsole einlesen und im Anschluss den jeweiligen Namen an der Listenpostion ausgegeben.

24 a.



Schreibe eine Funktion namens getPartWithIndex() die eine Liste an Strings namens list' und 2 Integers namensstartundend` übergeben bekommt und eine Liste an Strings zurück gibt.
Die zwei Integers sollen als Indizes gewertet und für Anfang und Ende einer Teilliste der Liste stehen.
Tipp:
Die Teilliste soll zurück gegeben und in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.main() ausgedruckt werden.
 */


fun main() {
    val namensliste = listOf("Lisa", "Marko", "Sebastian", "Florian", "Henrik", "Lillie", "Martin")


    val result: String = printAtIndex(namensliste)
}

//  Schreibe eine Funktion namens printAtIndex(), die eine Liste an Strings übergeben bekommt.
fun printAtIndex(liste: List<String>): String {
    //Lese darin eine Zahl über die Konsole ein
    println("Bitte eine Zahl eingeben...")
    val index: Int = readln().toInt()

    if (index in 0..liste.size-1){ // if ( index > -1 && index < 8) ODER: if (index >= 0 && index <= 7)
        // mithilfe des von dir eingegeben Indexsoll der dazugehörige Wert von der namensListe auf der Konsole ausgegeben werden.
        var foundName: String = liste.get(index) // alternativ: liste[zahl]
        println(foundName)
        //Bonus: lass die Funktion einen String, den entsprechenden Wert am Index, zurückgeben
        return foundName
    } else {
        println("Deine Eingabe $index liegt nicht im erlaubten Bereich zwischen 0 und 7.... probier's nochmal!")
        exitProcess(0)
    }
}
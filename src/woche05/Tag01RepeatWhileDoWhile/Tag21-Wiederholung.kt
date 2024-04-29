package VORLESUNG.Woche05.Tag21

import kotlin.system.exitProcess

val automat: MutableMap<String,Double> = mutableMapOf(
    "Gummibärchen" to 1.99,
    "Coca Cola" to 1.49,
    "Schokolade" to 0.99,
    "Kekse" to 1.49,
    "Apfel" to 0.49
)

val sortimentAnzahl: MutableMap<String,Int> = mutableMapOf(
    "Gummibärchen" to 4,
    "Coca Cola" to 5,
    "Schokolade" to 2,
    "Kekse" to 1,
    "Apfel" to 3
)

fun main() {
    useAutomat()

}

fun useAutomat() {
    println("Hier ist unser Sortiment:")
    println(automat)
    println(sortimentAnzahl)
    println("Bitte geben Sie ihre Auswahl ein...")
    useAutomat(readln())
    println("Kauf abgeschlossen!")
    println("Aktualisiertes Sortiment:")
    println(automat)
    println(sortimentAnzahl)
}

/**
 * holt die Auswahl des Users aus dem Sortiment
 * @param choice, String
 */

fun useAutomat(choice: String){
    // basierend auf Kundeneingabe den Preis ausdrucken
    println("Deine Wahl ist $choice!")

    // pruefen, ob choice im sortiment vorhanden ist
    if (sortimentAnzahl[choice] != null ){
        if (sortimentAnzahl[choice]!! > 0) {
            println("$choice kostet ${automat[choice]}")
            println("Guten Appetit!")
            sortimentAnzahl[choice] = sortimentAnzahl[choice]!! - 1
            println("(Noch ${sortimentAnzahl[choice]} $choice vorhanden)")

            if (sortimentAnzahl[choice]!! == 0) {
                automat.remove(choice)
                println("$choice ist ausverkauft, wird aus dem Sortiment entfernt...")
            } else {
                println("Alles gut, Produkt ist noch vorhanden.")
            }
        } else {
            println("Produkt ist nicht vorhanden, Menge ist < 0")
        }
    } else {
        println("Diese Produkt gibt es bei uns nicht. Starte nochmal von vorne...")
        System.exit(0)
        // exitProcess(0)
    }
}






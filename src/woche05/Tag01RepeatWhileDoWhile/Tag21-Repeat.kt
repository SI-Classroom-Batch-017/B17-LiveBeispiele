package VORLESUNG.Woche05.Tag21

import kotlin.random.Random

fun main() {
    // repeat mit hardgecodetem Int und it, das sich automatisch erhöht

    repeat(10){ // repeat liefert it für uns mit
        println("-------")
        println("${it + 1}. Hello World!")
        // Thread.sleep(2000)
        // irgendein krasser Funktionsaufruf ist hier moeglich, der dann 10x gemacht wird
    }

    println("Repeat Schleife wurde 10x ausgeführt, der Code läuft weiter...")
    println("--------")


    // repeat mit counter variable, die wir manuell erhöhen müssen
    var counter = 1
    repeat(7){
        println("$counter. Wochentag")
        counter = counter + 1
        // kurze Schreibweise: counter++ oder counter += 1
    }

    val fruits = mutableListOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")
    repeat(fruits.size-1){
        println(fruits[it])
    }




    // repeat mit Variable und Counter
    // Wochentage rückwärts runterzählen


    println("Es wurde 7x was zum Wochentag gesagt, der Code läuft weiter von oben nach unten...")


    // repeat mit Funktionsaufruf, wo ein Int rauskommt (.toInt(), randomInt())
    repeat(randomInt()){ // 20
        println("${it+1}. Durchlauf")
    }




    // repeat über Liste mit it.
    val weekDays = listOf("Mo","Di","Mi","Do","Fr","Sa","So")
    // it = von Kotlin bereitgestellte implizierte Indexvariable,
    // enthält automatisch erst den Index 0, zählt dann automatisch hoch

    repeat(weekDays.size){
        println("${it+1}. " + weekDays[it])
    }

    println("Liste erfolgreich durchlaufen, Repeat-Schleife beendet...")

    // repeat über weitere Liste mit it.
    // it = von Kotlin bereitgestellte implizierte Indexvariable,
    // enthält automatisch erst den Index 0, zählt dann automatisch hoch
    var herbstKleidung = mutableListOf("Wollsocken", "Winterschuhe", "gefütterte Jeans", "Daunenjacke", "Schal", "Handschuhe")
    repeat(herbstKleidung.size){ // in herbstKleidung.size steht 6 drin
        println("$it. Element in der Liste: ${herbstKleidung[it]}")
    }

    println("Liste erfolgreich durchlaufen, Schleife beendet...")


}

fun randomInt(): Int {
    return Random.nextInt(1,20)

}
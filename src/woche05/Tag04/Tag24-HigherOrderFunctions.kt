package VORLESUNG.Woche05.Tag24

import kotlin.math.min


fun main() {
    // WICHTIGSTE HIGHER ORDER FUNCTIONS / LAMBDAS

    // count mit selbst geschriebener Schleife:
    var text: String = "Das sind zwei as"


    var counter: Int = 0
    for (letter in text){
        if (letter == 'a'){
            counter++
        }
    }
    println("Anzahl an a's mit for Schleife rausgefunden: $counter")

    // count:
    // lange Variante mit eigenem parameternamen
    val aCounter: Int = text.count { letter -> letter == 'a'}
    // kurze variante mit it
    // ideale Lösung mit it, erspart uns Tipparbeit und Kopfzerbrechen über Parameternamen
    val aCounterIt: Int = text.count { it == 'a'}

    println("Anzahl an a's mit count Lambda rausgefunden: $aCounter")

    println("---")
    // filter
    val reviews = listOf(1,2,3,4,5,4,3,4,5,4,3,2,1,2,3)

    // zum Vergleich: filter mit Schleife. mühsam und lang, alle reviews rausfiltern, die >= 4 sind
    val goodReviews: List<Int> = reviews.filter { it >= 4 }

    println(goodReviews)
    val loopGoodReviews: MutableList<Int> = mutableListOf()
    for (review in reviews){
        if (review >= 4){
            loopGoodReviews.add(review)
        }
    }


    println("---")
    // sortedBy: sortiert entweder aufsteigend (mit it.eigenschaft: nach einer Eigenschaft (wie length)
    val dogs = mutableListOf("Mops","Pitbull","Bulldogge","Schäferhund","Chihuahua")

    val sortedDogsByLength: List<String> = dogs.sortedBy { it.length }
    val sortedDogsByAbc: List<String> = dogs.sortedBy { it }

    println(sortedDogsByLength)
    println(sortedDogsByAbc)
    println("---")
    // sortedByDescending: descend = absteigen, sortiert absteigend
    val sortedDogsByLengthDesc: List<String> = dogs.sortedByDescending { it.length }
    val sortedDogsByAbcDesc: List<String> = dogs.sortedByDescending { it }


    // forEach: geht jedes Element durch und wir können darauf zugreifen und zB drucken. nicht bearbeiten! das geht nur mit map
    dogs.forEach { println(it) }

    for (dog in dogs){
        println(dog)
    }

    println("---")


    // map: führt Operation in den { } für jedes Element aus. damit können wir Elemente bearbeiten
    val modifiedDogs: MutableList<String> = dogs.map { it + " ist ein Hund" }.toMutableList()
    println(dogs)
    println(modifiedDogs)

    // map mit Zahlen
    val reviewsDoubled: MutableList<Int> = reviews.map { it*2 }.toMutableList()

    val newReviewsList: MutableList<Int> = mutableListOf()
    for (r in reviews){
        newReviewsList.add(r*2)
    }


    println("---")
    // minBy: sucht kleinstes Element raus
    val shortestDog: String = dogs.minBy { it.length }
    println(shortestDog)

    var shortestDogName: String = "oeih aoih aoeigh oehg oehgo hg "
    for (dog in dogs){
        if (dog.length < shortestDogName.length){
            shortestDogName = dog
        }
    }

    println("---")
    // maxBy: sucht größten Hund nach Länge raus
    val longestDog: String = dogs.maxBy { it.length }
    println(longestDog)

    println("---")
    // any: true oder false: gibt es irgendein ein Element, das die Bedingung erfüllt? (Zahl gerade)

    val isAnyReviewEven: Boolean = reviews.any { it % 2 == 0 } // true
    println(isAnyReviewEven)

    println("---")
    // all: true oder false: erfüllen ALLE Elemente in der Liste die Bedingung? (durch 2 teilbar)
    val isEveryReviewEven: Boolean = reviews.all { it % 2 == 0 } // false
    println(isEveryReviewEven)

    println("---")

    // mehrere Lambdas in Kombination benutzen: gerade zahlen rausfiltern, verdoppeln
    val evenReviewsDoubled : List<Int> = reviews.filter { it % 2 == 0 }.map { it*2 }
    println(evenReviewsDoubled)


    // aus den dogs: nur woerter die länger als 4 sind
    // alphabetisch sortieren
    // alle in ALL CAPS schreiben
    val longDogsSortedAllCaps: List<String> = dogs.filter { it.length > 4 }.sortedBy { it }.map { it.uppercase() }
    println(longDogsSortedAllCaps)

    // alle hunde rausfiltern, die ein I im namen haben
    val dogsWithI: List<String> = dogs.filter { it.length > 4 }.sortedBy { it }.map { it.uppercase() }.filter { it.contains("I") }
    println(dogsWithI)


}
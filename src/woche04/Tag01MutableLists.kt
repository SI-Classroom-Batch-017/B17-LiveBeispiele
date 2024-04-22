package woche04

fun main() {
    val mutableMovies: MutableList<String> = mutableListOf("Barbie", "Harry Potter", "Oppenheimer", "Dune")

    // lesende Operationen: genau wie bei Lists möglich
    println(mutableMovies.first()) // Barbie
    println(mutableMovies.last()) // Dune
    println(mutableMovies[2]) // Oppenheimer

    println(mutableMovies.contains("Dune")) // true
    // reminder: das 2. Argument ist EXklusive
    println(mutableMovies.subList(2,4)) // Oppenheimer, Dune

    // schreibende Operationen:
    // .add(): fügt Element ans Ende der Liste hinzu
    mutableMovies.add("Dune 2")
    println(mutableMovies)

    // .add() mit Index: fuegt Element an den gegebenen Index hinzu
    println("Gib einen Film ein, der an den Anfang der Liste kommt:")
    mutableMovies.add(0, readln())
    println(mutableMovies)

    mutableMovies.add(getRandomInt(),"Herr der Ringe")
    println(mutableMovies)

    println("Gib einen Film ein, der in die Liste kommt:")
    var newMovie: String = readln()
    println("Gibt die Stelle ein, an die der Film geschrieben werden soll (Zahl zwischen 0 und ${mutableMovies.size-1})")
    mutableMovies.add(readln().toInt(),newMovie)

    println(mutableMovies)

    println("Gib einen Film ein, der ans Ende der Liste kommen soll:")
    mutableMovies.add(readln())
    println(mutableMovies)

    // sort: verändert original geht also nur bei mutable lists, sorted: gibt sortierte Kopie zurueck, geht bei lists und mutable lists
    mutableMovies.sort()
    var mutableMoviesSortedCopy: List<String> = mutableMovies.sorted()
    println(mutableMovies)
    println(mutableMoviesSortedCopy)


    val mutableNumbers: MutableList<Int> = mutableListOf(1,2,3,7,5,9)
    mutableNumbers.add(0,12)
    println(mutableNumbers)
    mutableNumbers.add(100)

    // remove: Entfernt Element aus Liste
    mutableMovies.remove("Dune 2")
    println(mutableMovies)

    // removeAt: entfernt Element an der übergebenen Stelle aus der Liste
    mutableMovies.removeAt(0)
    println(mutableMovies)

    println(returnList())

    println(giveList(mutableMovies,mutableNumbers))
    println(giveList(listOf("hi","moin"), mutableListOf(9,47)))
}

fun returnList(): List<String> {
    val list = listOf("bla","bla","bla")
    return list
}
fun giveList(liste: List<String>, liste2: MutableList<Int>) {
    println(liste)
    println(liste2)
}
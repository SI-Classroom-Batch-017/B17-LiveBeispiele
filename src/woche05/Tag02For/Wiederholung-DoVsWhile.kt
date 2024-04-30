package vorlesungen.woche05.Tag02


fun main() {


    // Unterschied do while / while


    // while: Bedingung muss stimmen, sonst kommen wir niemals in die Schleife
    var i = 11
    while (i < 10){
        println("Hurra, wir sind in der while schleife gelandet!")
        println(i)
        i++
    }


    println("---Ende der while Schleife---")

    // do while: wird immer mind 1x ausgefuehrt, auch wenn die Bedingung nicht true ist
    do {
        println("Hurra, wir sind in der DO while schleife gelandet!")
        println(i)
        i++
    } while (i < 10)

    println("---Ende der DO while Schleife---")



    // Elemente aus der Liste entfernen, bis nur noch das letzte Element, Inception, übrig ist
    val movies = mutableListOf("Inception", "Tenet", "Dunkirk", "Memento", "The Dark Knight")

    println("removeMoviesReverseWhile:")
    removeMoviesReverseWhile(movies)
    println("---------")

    movies.addAll(listOf("Tenet", "Dunkirk", "Memento", "The Dark Knight"))

    println("removeMoviesDoWhile:")
    removeMoviesDoWhile(movies)

}

fun removeMoviesDoWhile(movies: MutableList<String>) {
    println(movies)
    // mit do while schleife movies vorwaerts durchgehen, filme entfernen, bis nur noch the dark knight da ist
    var i = 0
    do {
        movies.removeAt(0)
        i++
    } while (movies.size > 1)

    println(movies)
}

fun removeMoviesReverseWhile(movies: MutableList<String>) {
    println(movies)
    // mit while schleife movies RUECKWAERTS durchgehen, filme entfernen, bis nur noch inception da ist
    var i = movies.size-1
    while (i > 0){
        movies.removeAt(i)
        i--
    }
    println(movies)

}



fun main() {

    var favoritePlaces: List<String> = listOf("Berge", "Strand", "Stadt")
    println(favoritePlaces)
    println(firstPlace(favoritePlaces))
}

fun firstPlace(favoritePlaces: List<String>): String{
    return favoritePlaces[0]
    favoritePlaces
}
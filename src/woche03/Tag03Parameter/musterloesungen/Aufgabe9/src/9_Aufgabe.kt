



fun combineCountryAndCapital(country: String, capitalCity: String): String {
    return "$country - Hauptstadt von  : $capitalCity"
}

fun main() {
    val result = combineCountryAndCapital("Deutschland", "Berlin")
    println(result)
}


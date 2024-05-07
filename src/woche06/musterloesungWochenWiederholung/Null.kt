package woche06.musterloesungWochenWiederholung

fun main() {
    // Aufgabe 1
    val list: List<String?> = listOf("Alice", null, "Bob")
    println(list)


    // Aufgabe 2
    val lengths = list.map { it?.length }
    println(lengths)

    // Aufgabe 3
    val lengthsWElvis = list.map { it?.length ?: -1 }
    println(lengthsWElvis)

    // Aufgabe 4
    val str: String? = null
    val length = str!!.length
    println(length)

    // Aufgabe 5
    var name: String? = null
    if (name == null) {
        name = "StandardName"
    }
    val strLength = name.length
    println(strLength)

    // Aufgabe 6
    var firstName: String? = null
    if (firstName == null) {
        firstName = "StandardName"
    }
    val firstNameLength = firstName.length
    println(firstNameLength)





}
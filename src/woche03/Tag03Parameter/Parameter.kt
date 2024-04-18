package woche03.Tag03Parameter

fun main() {
    // greeting direkt mit String aufrufen
    greeting("Johannes")
    greeting("Lea")
    greeting("Johnny")

    // greeting mit Variable aufrufen, in der ein String ist
    var name: String = "Marianne"
    greeting(name)
    var name1: String = readln()
    greeting(name1)

    // greeting mit Funktion aufrufen, die einen String zurueck gibt
    greeting(readln())
}

fun greeting(name: String): Int {
    println("Hallo $name, wie geht es dir?")
    return 0
}

fun greeting() {
    println("Bitte Name eingeben...")
    val name: String = readln()
    greeting(name)
}
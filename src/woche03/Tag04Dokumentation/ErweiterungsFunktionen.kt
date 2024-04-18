package woche03.Tag04Dokumentation

fun main() {
    var string: String = "harry"

    println(string.erstesZeichenGross())

    println("kleiner String".erstesZeichenGross())
    
    println(string.erstesZeichenErsetzen("G"))

    string.erstesZeichenErsetzen("G")

    "hallo".erstesZeichenGross()

    println(readln().erstesZeichenGross())

    println(25.0.timesTwo()) // 50.0

    var doubleNr: Double = 99.99
    println(doubleNr.timesTwo())

    println("13,3".convertToDouble())
    // println("13,3".toDouble()) // NumberFormatException, toDouble kommt nicht mit , klar

}

// erstes Zeichen gross fuer Strings

fun String.erstesZeichenGross(): String {
    return this.first().uppercase() + this.substring(1)
}

fun String.erstesZeichenErsetzen(neuesErstesZeichen: String) : String {
    return neuesErstesZeichen + this.substring(1)
}


// mal 2 fuer Double
fun Double.timesTwo(): Double {
    return this*2
}

// rueckkonvertierung von strings zu doubles
fun String.convertToDouble(): Double{
    return this.replace(",",".").toDouble()
}


// geradeZahl fuer ints

fun Int.isEven(): Boolean {
    return this % 2 == 0
}
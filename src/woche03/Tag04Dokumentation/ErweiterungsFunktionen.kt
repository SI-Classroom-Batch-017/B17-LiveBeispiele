package woche03.Tag04Dokumentation

fun main() {
    var string: String = "harry"

    println(string.erstesZeichenGross())

    println("kleiner String".erstesZeichenGross())
    
    println(string.erstesZeichenErsetzen("G"))

    string.erstesZeichenErsetzen("G")

    "hallo".erstesZeichenGross()

    println(readln().erstesZeichenGross())

}

// erstes Zeichen gross fuer Strings

fun String.erstesZeichenGross(): String {
    return this.first().uppercase() + this.substring(1)
}

fun String.erstesZeichenErsetzen(neuesErstesZeichen: String) : String {
    return neuesErstesZeichen + this.substring(1)
}


// mal 2 fuer Double

// rueckkonvertierung von strings zu doubles

// geradeZahl fuer ints
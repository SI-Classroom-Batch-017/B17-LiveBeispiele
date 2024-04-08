package woche02.Tag01Verzweigungen

// Suessigkeitenautomat

fun main() {
    println("Bitte gib ein, welches Produkt du kaufen willst.... Zahl ")
    println("""
        [1] -> Cola
        [2] -> Gummibarchen
        [3] -> Kekse
    """.trimIndent())


    var input: String = readln()

    when (input){
        "1" -> println(" Du hast Cola gewählt")
        "2" -> println(" Du hast Gummibaerchen gewählt")
        "3" -> println(" Du hast Kekse gewählt")
        else -> println("Ungueltige Eingabe...")
    }

}



// Alterspruefung
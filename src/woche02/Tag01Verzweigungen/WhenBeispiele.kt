package woche02.Tag01Verzweigungen

// Suessigkeitenautomat

fun main() {
    println("Bitte gib ein, welches Produkt du kaufen willst.... Zahl ")
    println("""
        [1] -> Cola
        [2] -> Gummibaerchen
        [3] -> Kekse
    """.trimIndent())


    var input: String = readln()

    when (input){
        "1" -> println(" Du hast Cola gewählt")
        "2" -> println(" Du hast Gummibaerchen gewählt")
        "3" -> println(" Du hast Kekse gewählt")
        else -> println("Ungueltige Eingabe...")
    }


    println("Bitte gib eine Zahl von 1-12 ein und wir sagen dir, zu welcher Jahreszeit der entsrpechende Monat gehört!")

    var monatsInput: String = readln()


    when(monatsInput){
        "1","2","12" -> {
            println("Winter")
            when(monatsInput){
                "1" -> println("Januar")
                "2" -> println("Februar")
                "12" -> println("Dezember")
            }
        }
        "3","4","5" -> {
            println("Frühling")
            if(monatsInput == "3"){
                println("März")
            } else if(monatsInput == "4"){
                println("April")
            } else {
                println("Mai")
            }

        }
        "6","7","8" -> println("Sommer")
        "9","10","11" -> println("Herbst")
    }

// Alterspruefung




}




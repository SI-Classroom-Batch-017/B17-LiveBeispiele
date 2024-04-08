package woche02.Tag01Verzweigungen

fun main(){


//
//    // Typkonvertierung: toBoolean()
//    var input: Boolean = readln().toBoolean()
//
//    // nur der VariablenName in der if () : Variable muss true sein, damit wir in den if Block springen
//    // if erwartet immer etwas, das letztendlich zu einem Boolean (true oder false) ausgewertet wird
//    if (isItRaining){
//        println("Es regnet...")
//    } else {
//        println("es regnet nicht...")
//    }
//
//
//    println("In jedem Fall geht der Code hier weiter...")


    // Bei einzelnen Anweisungen kann man die {} weglassen


    // Verschachtelte If Abfragen
//    var isItRaining: Boolean = true
//    var isSunShining: Boolean = false
//    var isRainHeavy: Boolean = false
//    var isItWindy: Boolean = true
//
//    // else if:
//    if (isSunShining){
//        println("Die Sonne scheint, es regnet nicht!")
//    // else if = kommen wir nur rein, wenn das vorherige if nicht gestimmt hat
//    } else if (isItRaining){
//        println("Es regnet, die Sonne scheint nicht!")
//        if (isRainHeavy){
//            println("Der Regen ist sehr stark...")
//        } else {
//            println("Der Regen ist nicht stark...")
//        }
//    }
//    // unabaängige, neue if abfrage
//    if (isItWindy){
//        println("Die Sonne scheint nicht, es regnet nicht, es ist nur windig.")
//    }
//
//    println("Der Code läuft hier weiter, egal, welches Wetter gerade ist...")
//
//

    // .contains -> Boolean
    var string: String = "Dieser String enthält den Buchstaben ö"

    var stringContainsLetter: Boolean = string.contains("y")

    if (stringContainsLetter){ // alternative: if (string.contains("y")) geht genauso, Variable nicht zwingend notwendig
        println("Buchstabe enthalten")
    } else {
        println("Buchstabe nicht enthalten")
    }


    // Altersüberprüfung

    // nutzer input programm


}
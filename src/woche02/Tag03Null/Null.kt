package woche02.Tag03Null

fun main() {
    // nullable Variable anlegen: braucht ? (nullable bedeutet: es darf null in der Variable stehen)
    var firstName: String? = null
    println(firstName) // null
    firstName = "Tom"

    var lastName: String? = "Sandoval"
    lastName = null

    // gilt für alle Datentypen
    var number: Double? = 10.0
    number = null

    var isSunny: Boolean? = null
    isSunny = false

    var number2: Int? = 9
    number2 = null

    // + mit nullable: ist wie beim String eine Konkatenation (Verkettung)
    var x = number2 + 3
    println("-----")
    println(x) // null3




    // auch konstanten können null sein:



    // SAFE CALL: den benutzen wir best practice mässig immer, umgeht programm absturz, falls null drin steht, gibt einfach null zurück und läuft dann weiter
    // number2 = 10
    var y: Int? = number2?.minus(3)
    println("Ergebnis von $number2 minus 3: $y")


    // NON NULL ASSERTED CALL: garantiert dem Compiler: keine Sorge, hier steht kein null drin.
    // Gefahr: bringt Programm zum abstürzen, falls doch null in der Variable steht.
    // Zum gezielten Fehler suchen nutzbar
    var string: String? = null
    // var stringToInt: Int = string!!.toInt()
    // println(stringToInt)



    // Elvis Operator: extrem verkürztes if else
    var name: String? = null
    // ?: ausgeschrieben: if else abfrage, wenn name null ist, John reinschreiben
//    if (name == null ){
//        name = "John"
//    }

    // ?:  wenn name null ist, John reinschreiben
    var fullName: String  = name?:"John" + " Mayer"
    println(fullName)
    println("Der volle Name lautet: ${if (fullName == null) "null" else "John"}")
    println("Hi mein Name ist $fullName")

    var newNumber: Int? = null
//    if (newNumber == null){
//        newNumber = 10
//    }

    var result: Int = newNumber?:10.plus(3)

    newNumber = 10
    var result2: Int = newNumber?:10.minus(10)









    // nullable Variablen können zu jedem Zeitpunkt wieder auf null gesetzt werden



}
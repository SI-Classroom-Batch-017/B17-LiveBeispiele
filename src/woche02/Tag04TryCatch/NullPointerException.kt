package woche02.Tag04TryCatch

fun main() {
    var string: String? = "Kotlin"
    var stringLength: Int?
    //println(stringLength)
    try {
        // !! = Non Null Asserted Call.
        stringLength = string!!.length

    } catch (e: Exception){
        // FehlerMeldung ausdrucken
        println("Fehler aufgefangen! $e")
        // Fehlerbehandlung: stringLength konnte nicht festegestellt werden, da string null war.
        // was wollen wir stattdessen in stringLength speichern? -> null
        stringLength = null
    }

    println("Stringlength: $stringLength")
    println("Hier kommen wir nur an, wenn wir nicht abstuerzen, also den Fehler aufgefangen haben...")
}
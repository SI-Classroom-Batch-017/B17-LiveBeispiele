package woche02.Tag04TryCatch

fun main() {

    var result: Int = 0

    try {
        result = 10 / 0
    } catch (e: Exception){
        println("Fehler! $e")
        // als default -1 in result schreiben, wenn was schief gelaufen ist
        result = -1
        println("In Result wurde der Standardwert -1 geschrieben, da die Rechnung nicht geklappt hat.")
    }

    println(result)


}
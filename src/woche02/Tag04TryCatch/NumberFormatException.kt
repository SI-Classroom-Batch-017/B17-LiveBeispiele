package woche02.Tag04TryCatch

fun main() {
    println("Bitte eine Zahl eingeben...")
    var zahlString: String = readln()
    var zahlKonvertiert: Int

    try {
        // Variablen, die im try Block angelegt werden, sind auch nur in diesem Block bekannt!
        // Deshalb in try nie neue Variablen anlegen (es sei denn, man braucht sie danach nicht mehr)
        var beispiel: Int = 0
        zahlKonvertiert = zahlString.toInt()


    } catch (e: Exception){

        println("Fehler! $e")
        println("Bitte probier es nochmal und gib eine richtige Zahl ein...")
        var input: String = readln()
        zahlKonvertiert = input.toInt()
    }

    println("Unsere konvertierte Zahl ist $zahlKonvertiert")

}
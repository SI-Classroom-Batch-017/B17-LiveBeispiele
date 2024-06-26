package woche06.Tag03Vererbung

class Rakete(val name: String, val farbe: String, val gewicht: Double) {

    fun starten() {
        println("$name startet in den Himmel!")
    }


    // toString: lässt uns ein gesamtes Objekt ausdrucken
    override fun toString(): String {
        return """
            ${super.toString()}
            Rakete: ${name}, 
            Farbe: ${farbe}, 
            Gewicht: $gewicht kg""".trimIndent()
    }
}

fun main() {
    // Erstellen von Instanzen der Raketenklasse
    val falcon9 = Rakete("Falcon 9", "Weiß", 54905.0)
    val saturnV = Rakete("Saturn V", "Schwarz", 2979345.0)
    val soyuz = Rakete("Soyuz", "Rot", 31300.0)

    // Zugriff auf die Eigenschaften und Methoden der Raketen über den Punktoperator
    println(falcon9)
    falcon9.starten()

    println(saturnV)
    saturnV.starten()

    // das Ergebnis der toString() Methode wird ausgedruckt, wenn man das ganze Objekt ausdruckt
    println(soyuz)
    soyuz.starten()


}

package woche06.Tag05.Fahrzeuge

// open: darf vererben
// protected: wie private, nur, dass es vererbt werden kann. private kann nichtmal vererbt werden.
open class Fahrzeug(var bezeichner: String, protected val maxKmh: Int, var price: Double, open val anzahlRaeder: Int, var istVermietet: Boolean = false){

    // sekundärer Konstruktor:
    constructor(bezeichner: String): this(bezeichner,150,49.99,4)

    open fun getMaxKmhh(): Int {
        return this.maxKmh
    }


    // toString(): liefert bevor wir es overriden nur die Speicheradresse eines Objekts zurueck, wir machen daraus, dass es alle Informationen liefert
    // statt printInfo() geschrieben
    override fun toString(): String {
        return "Fahrzeug $bezeichner\nMaxKmh: $maxKmh\nPreis: $price\nAnzahl an Rädern: $anzahlRaeder\nIst Vermietet: $istVermietet\n"
    }

    open fun testDrive(){
        println("Das Fahrzeug $bezeichner wird zur Probe gefahren...")
    }


}

fun main() {
//    var auto = Fahrzeug("Mercedes")
//    var auto2 = Fahrzeug("Mercedes",200,39.99,4)
//    auto.getMaxKmhh()
//    println(auto)

    var landfahrzeug = Landfahrzeug("Audi",6)
    // hier wird implizit .toString() aufgerufen. wir koennen das ganze Objekt ausdrucken, ohne, dass die nervige Speicheradresse rauskommt, weil wir toString() selbst definiert haben
    // das toString() wird übrigens von der Fahrzeug Mutter geerbt
    println(landfahrzeug)
    // getMaxKmhh ist von der Fahrzeug Mutter geerbt
    landfahrzeug.getMaxKmhh()

    val wassser = Wasserfahrzeug("Sunshine",40,60.0)
    println(wassser)
    wassser.getMaxKmhh()
    val wasser2 = Wasserfahrzeug("Segelschiff")
}
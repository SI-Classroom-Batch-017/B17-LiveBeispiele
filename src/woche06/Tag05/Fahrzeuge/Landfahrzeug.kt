package woche06.Tag05.Fahrzeuge

open class Landfahrzeug(bezeichner: String, maxKmh: Int, price: Double, override val anzahlRaeder: Int = 4): Fahrzeug(bezeichner, maxKmh, price, anzahlRaeder){

    constructor(bezeichner: String, anzahlRaeder: Int): this(bezeichner,150,40.0,anzahlRaeder){
        println("Landfahrzeug $bezeichner mit 2.K. erstellt!")
        // println(super.toString())
    }

    constructor(bezeichner: String): this(bezeichner,180,50.0)

    override fun toString(): String {
        return "--Landfahrzeug-- \n${super.toString()} "

    }

    override fun testDrive() {
        println("Das LANDfahrzeug $bezeichner wird Probe gefahren...")
    }
}
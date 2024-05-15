package woche06.Tag05.Fahrzeuge

class Motorrad(bezeichner: String, override val anzahlRaeder: Int = 2): Landfahrzeug(bezeichner,anzahlRaeder){

    override fun testDrive() {
        println("Das Motorrad $bezeichner wird Probe gefahren...")
    }

}
package woche06.Tag05.Fahrzeuge

class PKW(bezeichner: String, price: Double): Landfahrzeug(bezeichner,120,price){

    override fun testDrive() {
        println("Der PKW $bezeichner wird zur Probe gefahren...")
    }


}
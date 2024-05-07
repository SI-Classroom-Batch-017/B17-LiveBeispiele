package woche06.musterloesungWochenWiederholung

open class Produkt(val bezeichner: String, val preis: Double, val kategorie: String) {
    fun printInfo() {
        println("Produkt: $bezeichner")
        println("Preis: $preis")
        println("Kategorie: $kategorie")
    }
}

class Elektronik(bezeichner: String, preis: Double) : Produkt(bezeichner, preis, "Elektronik")

class Kleidung(bezeichner: String, preis: Double) : Produkt(bezeichner, preis, "Kleidung")

class Nahrung(bezeichner: String, preis: Double) : Produkt(bezeichner, preis, "Nahrung")

class Buch(bezeichner: String, preis: Double) : Produkt(bezeichner, preis, "Bücher")

class Haushalt(bezeichner: String, preis: Double) : Produkt(bezeichner, preis, "Haushalt")

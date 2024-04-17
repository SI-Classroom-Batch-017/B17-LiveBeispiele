package woche03.Tag04Parameter

fun preisRechner(produktName: String, anzahlProdukte: Int, produktPreis: Double, rabatt: Double = 0.0): Double {

    println("Preis für $anzahlProdukte Einheiten des Produkts $produktName:")
    println("Preis Pro $produktName: $produktPreis")
    val gesamtPreis: Double = anzahlProdukte*produktPreis

    println("Preis ohne Rabatt: $gesamtPreis")
    if (rabatt != 0.0){
        println("Rabatt von $rabatt wird ausgerechnet...")
        val rabattPreis: Double = gesamtPreis*(1-rabatt)
        println("Preis mit Rabatt: $rabattPreis")
        return rabattPreis

    }


    return gesamtPreis
}

fun main() {
    var preisJeans: Double = preisRechner("Jeans",2,19.99)
    println("--------")
    var preisJacken: Double = preisRechner("Jacke", 3,39.99,0.5)
    println("-------")
    var preisAlleProdukte: Double = preisJeans + preisJacken
    println("Unser Einkauf kostet insgesamt $preisAlleProdukte")
}
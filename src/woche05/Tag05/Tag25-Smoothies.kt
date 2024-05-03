package VORLESUNG.`W05-Schleifen`.d03

val preise: Map<String,Double> = mapOf(
    "Tropical" to 3.49,
    "Erdbeere Mango" to 2.99,
    "Banane Kirsch" to 2.99,
    "Detox" to 3.99,
    "Wild Berries" to 3.49
)

val orders: List<List<String>> = listOf(
    listOf("Tropical", "Detox"),
    listOf("Banane Kirsch"),
    listOf("Erdbeere Mango", "Erdbeere Mango"),
    listOf("Banane Kirsch", "Wild Berries", "Detox")
)


fun main() {

    // Gesamtpreis aller orders mit lambda:

    var gesamtPreis: Double = 0.0
    orders.forEach {
        order -> order.forEach {
            println("Aktueller Smoothie: $it, dessen Preis:${preise[it]} ")
            gesamtPreis += preise[it]?:0.0
            println("Neuer Preis: $gesamtPreis")
        }
    }

    println("GESAMTPREIS ALLE ORDERS: $gesamtPreis")


    gesamtPreisLambdaFunction()


    // mit Schleife
    // Preis von allen orders ausrechnen
    // mit Funktionsaufruf
    gesamtPreisWFunctionCall()

    // mit Schleife
    // Preis von allen orders ausrechnen
    getPriceNoFunctionCall()


    //Preis von einer Order ausrechnen
        // mit loop
    println(getOrderPriceLoop(orders[0]))
    val sndOrder: List<String> = orders[1]
    println(getOrderPriceLoop(sndOrder))
        // mit lambda
    println(getOrderPriceLambda(sndOrder))


    //TODO mit Lambda



}

fun gesamtPreisLambdaFunction() {
    var gesamtPreis: Double = 0.0
    orders.forEach { gesamtPreis += getOrderPriceLambda(it) }
    // orders.forEach { drinks -> gesamtPreis += getOrderPriceLambda(drinks) }

    println("Gesamtpreis alle Bestellungen: $gesamtPreis")
}


fun getOrderPriceLambda(order: List<String>): Double {
    var preis: Double = 0.0
    order.forEach { preis += preise[it] ?: 0.0 }
    return preis
}

fun getPriceNoFunctionCall() {
    var gesamtPreis: Double = 0.0
    for (order in orders) {
        for (drink in order) {
            println("Preis $drink: ${preise[drink]}")
            gesamtPreis += preise[drink] ?: 0.0
        }
        println("Zwischenstand Gesamtpreis mit $order: $gesamtPreis")
    }

    println("Gesamter Preis aller orders $orders: \n$gesamtPreis")
}

fun gesamtPreisWFunctionCall() {
    var gesamtPreis: Double = 0.0
    for (order in orders) {
        gesamtPreis += getOrderPriceLoop(order)
    }
    println("Gesamtpreis aller Bestellungen (orders): $gesamtPreis")
}

fun getOrderPriceLoop(order: List<String>): Double {
    var preis: Double = 0.0
    for (drink in order){
        preis += preise[drink] ?: 0.0
    }
    return preis
}




package woche06.musterloesungWochenWiederholung

fun displayStore(){
    val storeName = "MeinStore"
    val storeDescription = "Ein virtueller Store mit tollen Produkten"
    val branchNumber = 13

    print("Geben Sie den Namen des Store-Leiters ein: ")
    val storeManagerName = readln()

    print("Geben Sie das Alter des Store-Leiters ein: ")
    val storeManagerAge = readln().toInt()

    val isDiscountAvailable = true

    println("Willkommen bei $storeName!")
    println("Unser Store bietet $storeDescription an.")
    println("Filialnummer: $branchNumber")
    println("Store-Leiter: $storeManagerName, Alter: $storeManagerAge Jahre")
    println("Rabattaktion läuft: $isDiscountAvailable")

}

fun addProduct(inventar: MutableMap<String,Double>, produkt: String, preis: Double){
    inventar.put(produkt,preis)
}

fun updatePrice(inventar: MutableMap<String, Double>, produkt: String){
    inventar[produkt] = inventar[produkt]!!-1.5
}

fun removeProduct(inventar: MutableMap<String, Double>, produkt: String){
    inventar.remove(produkt)
}

fun doesProductExist(inventar: MutableMap<String, Double>, produkt: String){
    if (inventar.containsKey(produkt)) {
        println("$produkt ist im Inventar.")
    } else {
        println("$produkt ist nicht im Inventar.")
    }

}

fun doesPriceExist(inventar: MutableMap<String, Double>, preis: Double){
    if (inventar.containsValue(preis)) {
        println("Ein Produkt kostet $preis Euro.")
    } else {
        println("Kein Produkt kostet $preis Euro.")
    }
}
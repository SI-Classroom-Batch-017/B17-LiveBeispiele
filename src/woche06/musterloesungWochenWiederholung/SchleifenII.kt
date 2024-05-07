package woche06.musterloesungWochenWiederholung


// Schleifen.kt


// Erstelle eine mutable Kopie von woche06.musterloesungWochenWiederholung.getCMitarbeiterListe
val cEmployees = cMitarbeiterListe.toMutableList()

// Aufgabe 10: Produkte hinzufügen
fun addProductToCategory(category: String, productName: String) {
    val productsInCategory = cProductMap[category]
    if (productsInCategory != null) {
        val mutableProducts = productsInCategory.toMutableList()
        mutableProducts.add(productName)
        cProductMap[category] = mutableProducts
        println("Produkt '$productName' wurde zur Kategorie '$category' hinzugefügt.")
    } else {
        println("Die Kategorie '$category' existiert nicht.")
    }
}

// Aufgabe 11: Produkte entfernen
fun removeProductFromCategory(category: String, productName: String) {
    val productsInCategory = cProductMap[category]!!.toMutableList()
    if (productsInCategory.remove(productName)) {
        println("Produkt '$productName' wurde aus der Kategorie '$category' entfernt.")
    } else {
        println("Das Produkt '$productName' existiert nicht in der Kategorie '$category'.")
    }
}

// Aufgabe 12: Produkte in jeder Kategorie alphabetisch sortieren
fun sortProductsAlphabetically() {
    for ((category, products) in cProductMap) {
        val mutableProducts = products.toMutableList()
        mutableProducts.sort()
        cProductMap[category] = mutableProducts
        println("Produkte in Kategorie '$category' wurden alphabetisch sortiert.")
    }
}

// Aufgabe 13: Kategorie umbenennen
fun renameCategory(oldCategory: String, newCategory: String) {
    val productsInOldCategory = cProductMap[oldCategory]
    if (productsInOldCategory != null) {
        cProductMap.remove(oldCategory)
        cProductMap[newCategory] = productsInOldCategory
        println("Kategorie '$oldCategory' wurde in '$newCategory' umbenannt.")
    } else {
        println("Die Kategorie '$oldCategory' existiert nicht.")
    }
}

// Aufgabe 14: Produkte in den Warenkorb legen
val shoppingCart = mutableListOf<Pair<String, Int>>()

fun addToShoppingCart(productName: String, quantity: Int) {
    shoppingCart.add(productName to quantity)
    println("$quantity Stück(e) von '$productName' wurden zum Warenkorb hinzugefügt.")
}


fun main() {
    addProductToCategory("Elektronik", "Smartwatch")
    removeProductFromCategory("Kleidung", "Jacke")
    sortProductsAlphabetically()
    renameCategory("Nahrung", "Lebensmittel")
    addToShoppingCart("Smartphone", 2)
    println(cProductMap)

}

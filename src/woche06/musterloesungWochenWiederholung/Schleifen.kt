package woche06.musterloesungWochenWiederholung

// Aufgabe 1
fun filterEmployeesByFirstLetter(letter: Char) {
    val filteredEmployees = mitarbeiterListe.filter {
        it.startsWith(letter, ignoreCase = true) }
    println("Mitarbeiter, deren Namen mit '$letter' beginnen:")
    filteredEmployees.forEach { println(it) }
}

// Aufgabe 2
fun findLongestProductNames() {
    for ((category, products) in produktMap) {
        val longestProductName = products.maxBy { it.length }
        println("Längster Produktname in Kategorie '$category': $longestProductName")
    }
}

// Aufgabe 3
fun filterProductsByCategory(category: String) {
    val productsInCategory = produktMap[category]
    if (productsInCategory != null) {
        println("Produkte in der Kategorie '$category':")
        productsInCategory.forEach { println(it) }
    } else {
        println("Die Kategorie '$category' existiert nicht.")
    }
}

// Aufgabe 4
fun sortEmployeesAlphabetically() {
    val sortedEmployees = mitarbeiterListe.sorted()
    println("Mitarbeiterliste (alphabetisch sortiert):")
    sortedEmployees.forEach { println(it) }
}

// Aufgabe 5
fun filterProductsByLength(maxLength: Int) {
    for ((category, products) in produktMap) {
        val filteredProducts = products.filter { it.length < maxLength }
        println("Produkte in Kategorie '$category' mit weniger als $maxLength Zeichen:")
        filteredProducts.forEach { println(it) }
    }
}

// Aufgabe 6
fun countTotalProducts() {
    var totalProducts = 0
    for ((categories, products) in produktMap) {
        totalProducts += products.size
    }
    println("Gesamtanzahl der Produkte: $totalProducts")
}

// Aufgabe 7
fun selectRandomProductPerCategory() {
    for ((category, products) in produktMap) {
        val randomIndex = (0 until products.size).random()
        val randomProduct = products[randomIndex]
        println("Zufälliges Produkt in Kategorie '$category': $randomProduct")
    }
}

// Aufgabe 8
fun groupProductsByFirstLetter() {
    val productGroups = produktMap.flatMap { (categories, products) -> products }
        .groupBy { it.first().uppercase() }
    for ((letter, products) in productGroups) {
        println("Produkte, die mit '$letter' beginnen:")
        products.forEach { println(it) }
    }
}

// Aufgabe 9
fun countProductsPerCategory() {
    for ((category, products) in produktMap) {
        val productCount = products.size
        println("Anzahl der Produkte in Kategorie '$category': $productCount")
    }
}

fun main() {
    filterEmployeesByFirstLetter('A')
    findLongestProductNames()
    filterProductsByCategory("Kleidung")
    sortEmployeesAlphabetically()
    filterProductsByLength(6)
    countTotalProducts()
    selectRandomProductPerCategory()
    groupProductsByFirstLetter()
    countProductsPerCategory()
}

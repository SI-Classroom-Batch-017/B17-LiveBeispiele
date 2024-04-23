package woche04.Tag02MehrOperationen



fun main() {
    // liste anlegen: ShoppingList
    val shoppingList: List<String> = listOf("Banane","Apfel","Nutella","Aal","Zahnpasta","Shampoo","Milch")


    // letztes Element: 3 Varianten
        val lastIndex: Int = shoppingList.size-1 // exakt das gleiche wie listenName.lastIndex
        val milch: String = shoppingList[lastIndex]
        println(milch)
        // alternative zum Inhalt des letzten index: last()
        println(shoppingList.last())

        // 2. alternative: get
        // lastIndex = beinhaltet den letzten Index, also das gleiche wie size-1
        println(shoppingList.get(shoppingList.lastIndex))



    // erstes Element: 2 Varianten
        val first: String = shoppingList[0]
        val firstGet: String = shoppingList.get(0)

        // alternative zum Inhalt des ersten index: first()
        val firstElement: String = shoppingList.first()

    // ist die Liste leer? true, wenn liste leer ist
    val listEmpty: Boolean = shoppingList.isEmpty()

    // ist die Liste nicht leer? false, wenn liste leer ist
    val listNotEmpty: Boolean = shoppingList.isNotEmpty()



    // liste in mutable (veränderbare) liste umwandeln, in neuer variable speichern:
    val mutableShoppingList: MutableList<String> = shoppingList.toMutableList()
    // Bonus: String in Liste umwandeln println("Hallo dies ist ein String".split(" "))


    // shoppingList.add() // geht immernoch nicht, shoppingList wird nicht bearbeitet, es wird nur eine mutable Kopie davon zurueckgegeben.
    //shoppingList.add()
    mutableShoppingList.add("Birne")



    // LESENDE OPERATIONEN: AUF LISTS UND MUTABLE LISTS
    println("---Lesende Operationen: auf List und MutableList---")


    // size, also Länge der Liste, in variable speichern
    val shoppingSize: Int = shoppingList.size

    // Liste an Integers
    val intList: List<Int> = listOf(2,4,55,88,33,20,0)

    // min: gibt "kleinstes" Element raus
    val minShop: String = shoppingList.min()
    val minInt: Int = intList.min()


    // max gibt "größtes" Element raus
    val maxShop: String = shoppingList.max()
    val maxInt: Int = intList.max()

    // indexOf() - erstes Vorkommen eines Elements in der Liste
    // Vorbereitung: Ein Element doppelt in die Liste fügen
    mutableShoppingList.add("Milch")
    var firstMilkIndex: Int = mutableShoppingList.indexOf("Milch")

    // lastIndexOf() - letztes Vorkommen eines Elements in der Liste
    var lastMilkIndex: Int = mutableShoppingList.lastIndexOf("Milch")


    // contains: gibt true zurück, wenn das gesuchte Element in der Liste ist
    var containsApple: Boolean = shoppingList.contains("Apfel") // true

    // containsAll : siehe contains, aber: nicht ein einzelnes Element, sondern ganze Liste
    var containsElements: Boolean = shoppingList.containsAll(listOf("Apfel", "Shampoo", "Nutella", "Duschgel"))


    // subList: gibt liste vom 1. index in den Klammern bis AUSschliesslich den 2. Index aus
    println("Sublist: ")
    val subShopList: List<String> = shoppingList.subList(1,4)



    // slice: kann eine Int Range (x..y) übergeben bekommen, das obere Ende der Range ist INklusive EINbegriffen (nicht wie bei subList)
    println("Slice mit IntRange:")
    val slicedShopList: List<String> = shoppingList.slice(1..3)



    // reversed: erstellt eine Kopie der shoppingList, kehrt darin die Reihenfolge um
    println("Reversed:")
    val reversedShopList: List<String> = shoppingList.reversed()

    // shuffled: erstellt eine Kopie der shoppingList, mischt sie durch
    println("Shuffled:")
    val shuffledShopList: List<String> = shoppingList.shuffled()
    println(shuffledShopList)

    println("Sorted: ")
    val sortededShopList: List<String> = shoppingList.sorted()
    println(sortededShopList)

    println()
    // indexOf: gibt den ersten Index, an dem das Element vorkommt, zurück
    val firstIndexOfMilk: Int = mutableShoppingList.indexOf("Milch") // 6

    // lastIndexOf: gibt den Index, an dem das Element zum letzten Mal vorkommt, zurück
    val lastIndexOfMilk: Int = mutableShoppingList.lastIndexOf("Milch") // 8


}
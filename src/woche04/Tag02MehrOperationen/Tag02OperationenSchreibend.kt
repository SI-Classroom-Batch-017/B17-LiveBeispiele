package woche04.Tag02MehrOperationen

fun main() {
    val shoppingList: List<String> = listOf("Apfel", "Banane", "Brokkoli", "Kuchen", "Kekse", "Kaffee", "Tee")
    val mutableShoppingList: MutableList<String> = shoppingList.toMutableList()
    val nonMutableSL: List<String> = mutableShoppingList.toList()


// SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS
    println("---Schreibende Operationen: nur mit MutableList---")


    // remove: entfernt das 1. vorkommende, passende Element (nicht mehrere, falls mehrere passen)
    println("Remove:")
    println("Vorher: $mutableShoppingList")
    // Element entfernen
    mutableShoppingList.remove("Kuchen")

    println("Nachher:")
    println(mutableShoppingList)

    // mit add ohne Index nur 1 Element hinzufügen
    println("Element wird mit add() hinzugefuegt:")
    mutableShoppingList.add("Kuchen")

    println(mutableShoppingList)

    // addAll: fügt ganze Liste an Elementen hinzu
    println("Gib 1 Element zum Hinzufuegen ein:")
    mutableShoppingList.addAll(listOf("Zahnpasta", readln(), "Bohnen", "Lachs", "Erbeeren").sorted())
    println(mutableShoppingList)
    val listExtension: List<String> = listOf("Joghurt","Proteinshake","Haargel","Klopapier")
    val didAddWork: Boolean = mutableShoppingList.addAll(listExtension)

    // removeAll: nimmt eine Liste an Elementen, die entfernt werden sollen, als Parameter
    println("RemoveAll:")
    var didRemoveWork: Boolean = mutableShoppingList.removeAll(listOf("Apfel","Kekse","Thunfisch")) // true

    println(mutableShoppingList)


    // add: mit Index: fügt ein Element am gegebenem Index  hinzu
    println("Add mit Index:")

    mutableShoppingList.add(0,"")

    // Element wird an die 4. Stelle geschrieben:
    mutableShoppingList.add(3,"Melone")


    // clear: leert Liste komplett aus
    println("Clear:")
    mutableShoppingList.clear()
    println(mutableShoppingList)// [ ]


    //mutableShoppingList = mutableListOf() // wuerde das gleiche machen aber mit val nicht erlaubt

    // addAll: fügt neue Liste in Liste ein

    println("AddAll:")
    val newShoppingList: List<String> = listOf("Eier", "Mehl", "Milch", "Butter", "Puderzucker")
    mutableShoppingList.addAll(newShoppingList)

    println(mutableShoppingList)

    println("RemoveAt 0")
    // removeAt: entfernt Element an spezifischen Index
    mutableShoppingList.removeAt(0) // Eier werden entfernt

    println(mutableShoppingList)

    println("RemoveAt last Index")
    // lastIndex ginge auch, Puderzucker wird entfernt
    mutableShoppingList.removeAt(mutableShoppingList.lastIndex) // mutableShoppingList[mutableShoppingList.size-1]
    println(mutableShoppingList)

    // removeLast: entfernt das letzte Element aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove Last:")
    val lastElement: String = mutableShoppingList.removeLast() // Butter wird rausgenommen, in lastElement gespeichert

    println(mutableShoppingList)

    // removeFirst: entfernt das 1. Element (index 0) aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove First:")
    val firstElement: String = mutableShoppingList.removeFirst()


    println(mutableShoppingList)



    // shuffle: mischt liste durch
    println("Shuffle:")
    mutableShoppingList.shuffle()
    println(mutableShoppingList)

    // sort: sortiert ORGINALE liste aufsteigend, es wird keine Kopie erstellt, die urspruengliche liste wird sortiert
    println("Sort:")
    mutableShoppingList.sort()
    println(mutableShoppingList)


    // reverse: dreht reihenfolge um
    println("Reverse:")
    mutableShoppingList.reverse()

    println(mutableShoppingList)

    mutableShoppingList.addAll(newShoppingList)
    mutableShoppingList.addAll(listExtension)
    // retainAll: behält nur die übergebenen Elemente in der originalen Liste, entfernt den Rest

    mutableShoppingList.retainAll(listOf("Apfel","Birne","Melone"))

}
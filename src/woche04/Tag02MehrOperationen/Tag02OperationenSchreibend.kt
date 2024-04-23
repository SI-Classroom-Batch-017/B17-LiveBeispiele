package woche04.Tag02MehrOperationen

fun main() {
    val shoppingList: List<String> = listOf("Apfel", "Banane", "Brokkoli", "Kuchen", "Kekse", "Kaffee", "Tee")
    val mutableShoppingList: MutableList<String> = shoppingList.toMutableList()


// SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS
    println("---Schreibende Operationen: nur mit MutableList---")


    // remove: entfernt das 1. vorkommende, passende Element (nicht mehrere, falls mehrere passen)
    println("Remove:")
    //println("Vorher: $mutableShoppingList")
    // Element entfernen

    println("Nachher:")
   // println(mutableShoppingList)

    // mit add ohne Index nur 1 Element hinzufügen

    //println(mutableShoppingList)

    // addAll: fügt ganze Liste an Elementen hinzu

    //println(mutableShoppingList)



    // removeAll: nimmt eine Liste an Elementen, die entfernt werden sollen, als Parameter
    println("RemoveAll:")

   // println(mutableShoppingList)

   // println(mutableShoppingList)

    // add: mit Index: fügt ein Element am gegebenem Index  hinzu
    println("Add mit Index:")

    // Element wird an die 4. Stelle geschrieben:



    // clear: leert Liste komplett aus
    println("Clear:")

    // mutableShoppingList = mutableListOf() // wuerde das gleiche machen aber mit val nicht erlaubt
   // println(mutableShoppingList)

    // addAll: fügt neue Liste in Liste ein

    println("AddAll:")
    val newShoppingList: List<String> = listOf("Eier", "Mehl", "Milch", "Butter", "Puderzucker")

   // println(mutableShoppingList)

    println("RemoveAt 0")
    // removeAt: entfernt Element an spezifischen Index

   // println(mutableShoppingList)

    println("RemoveAt last Index")
    // lastIndex ginge auch
   // println(mutableShoppingList)

    // removeLast: entfernt das letzte Element aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove Last:")

   // println(mutableShoppingList)

    // removeFirst: entfernt das 1. Element (index 0) aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove First:")


    //println(mutableShoppingList)



    // shuffle: mischt liste durch
    println("Shuffle:")

   // println(mutableShoppingList)

    // sort: sortiert ORGINALE liste aufsteigend, es wird keine Kopie erstellt, die urspruengliche liste wird sortiert
    println("Sort:")

    //println(mutableShoppingList)


    // reverse: dreht reihenfolge um
    println("Reverse:")

   // println(mutableShoppingList)

    // retainAll: behält nur die übergebenen Elemente in der originalen Liste, entfernt den Rest

    // lastIndexOf/ firstIndexOf

}
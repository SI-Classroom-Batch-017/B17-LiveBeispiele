fun main() {
    val shoppingList: MutableList<String> = mutableListOf("Eis", "Kaugummi", "Gummibärchen")
    var onDiet: Boolean = false
    println(shoppingList)

    if (!onDiet){
        shoppingList.add("Marshmallows")
        shoppingList.add(0,"Schokolade")
    } else {
        shoppingList.remove("Eis")
        shoppingList.remove("Gummibärchen")
        shoppingList.add("Apfel")
        shoppingList.add("Banane")
    }
    println(shoppingList)
}



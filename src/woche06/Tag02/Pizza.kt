package woche06.Tag02

// Attribut ohne var/val davor: Konstruktorvariable, ist nur im Konstruktor (also auch im init-Block) verfuegbar, ansonsten nirgendwo. Wird nach der Ausführung des init-Blocks komplett "vergessen"
class Pizza(var name: String, var size: Int, var price: Double, toppings: List<String> = listOf()) {

    var allIngredients: MutableList<String> = mutableListOf("Mehl","Hefe","Tomatensauce","Käse")


    init {
        println("Nur Toppings der Pizza $name:")
        for (i in toppings) {
            println(i)
        }
        println("---Ende Nur Toppings---")
        this.allIngredients.addAll(toppings)
    }

    fun printAllIngredients(){
        this.allIngredients.forEach{ println(it) }
    }
}

fun main() {

    var margarita: Pizza = Pizza("Margarita",30,3.99)
    var salami: Pizza = Pizza("Margarita",30,3.99, listOf("Salami","Tomate","Zwiebel"))
    var tonno: Pizza = Pizza("Margarita",30,3.99, listOf("Thunfisch","Olive","Zwiebel"))
    // nicht mehr moeglich: ingredients ist eine Konstruktorvariable, die ist nirgendwo verfügbar außer im init-Block
    // println(margarita.toppings)
    // margarita.printAllToppings()
    margarita.printAllIngredients()
    println(margarita.allIngredients)


}

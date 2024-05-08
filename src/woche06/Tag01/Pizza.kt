package woche06.Tag01

class Pizza(var name: String, var size: Int, var price: Double, var ingredients: List<Ingredient>) {

    fun printAllIngredients(){
        for (i in ingredients){
            println(i.name)
        }
    }
}

class Ingredient(var name: String, var price: Double){

}


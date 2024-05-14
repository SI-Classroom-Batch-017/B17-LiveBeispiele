package woche06.Tag04Kapselung

class Pizza(private var name: String, var price: Double = 4.99){

    val ingredients: MutableList<Ingredient> = mutableListOf()

    init {
        println("Pizza $name gebacken!")
        privateFunction()
        protectedFunction()
    }


    fun calculatePrice(): Double{
        for (i in ingredients){
            price += i.cost
        }
        return price
    }

    fun calculatePriceLambda(): Double {
        ingredients.forEach { price += it.cost }
        return price
    }

    // Getter Methode: Schnittstelle, um private Eigenschaften nach außen zu holen
    fun getName(): String {
        return this.name
    }

    // Setter Methode: extra Schnittstelle, um private Eigenschaften zu verändern
    fun setName(name: String){
        this.name = name
    }

    // ALTERNATIVE SYTNAX: nur für NICHT PRIVATE Variablen. wenn man zusätzliche Logik beim getten/setten haben will
      var zubereitungsZeit: Int = 10
         get() {
             println("Getter Aufruf Zubereitungszeit!")
             return field // mit field ist hier zubereitungsZeit gemeint
         }
         set(value) {
             println("Setter Aufruf Zubereitungszeit!")// value ist der neue Wert
             field = value // der neue Wert wird in das field, also die zubereitungsZeit geschrieben
         }

    private fun privateFunction(){
        println("Diese Funktion ist privat....")
    }

    protected fun protectedFunction(){
        println("Diese Funktion ist protected....")
    }

}

fun main() {
    val margharita: Pizza = Pizza("Margharita")
    val mozarella: Pizza = Pizza("Margharita")
    println(margharita.zubereitungsZeit)
    margharita.zubereitungsZeit = 15
    println(margharita.zubereitungsZeit)
    // margharita.privateFunction()   beide funs sind protected/private, also nicht von außen aufrufbar. nur innerhalb der Klasse bzw im Fall von protected auch von den Kindern
    // margharita.protectedFunction()



    var tomate: Ingredient = Ingredient("Tomate",0.49)
    var salami: Ingredient = Ingredient("Salami", 0.99 )

    var salamiPizza: Pizza = Pizza("Salami")
    salamiPizza.ingredients.addAll(listOf(tomate,salami))

    println(salamiPizza.calculatePriceLambda()) // macht das gleiche wie calculatePrice()

    // KAPSELUNG
    // Getter
    // println(salamiPizza.name) funktioniert NICHT, denn name ist private
    // extra Schnittstelle / Funktion benutzen, die das private Attribut name rausholt:
    println(margharita.getName())
    println(mozarella.getName())

    // Setter
    // salamiPizza.name = "Salami Deluxe" funktioniert NICHT, denn name ist private
    salamiPizza.setName("Salami Deluxe")



}
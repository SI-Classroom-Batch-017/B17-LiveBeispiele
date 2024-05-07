package woche06

// eine Klasse kann auch andere Klassen als Attribut / Eigenschaft / Variable haben: hier zB owner ist vom Datentyp Person
class Cat(var name: String, var breed: String, var owner: Person?) {

    fun meow(){
        println("Miau, ich bin $name mit der Rasse $breed und dem Besitzer ${owner?.firstName}")
        println("Mein Besitzer begrüßt uns:")
        owner?.greeting()
    }
}

fun main() {
    var ingredientsList: List<Ingredient> = listOf(Ingredient("Tomate", 0.5),Ingredient("Zwiebel",0.6))
    var pizza1: Pizza = Pizza("Monzarella",30,5.99, ingredientsList)
    var cat2: Cat = Cat("Alfie","BKH",Person("Mario","Mustermann",30,pizza1))
    var person1: Person = Person("Harry", "Potter", 11,pizza1)

    var cat1: Cat = Cat("Betty","Perser",person1)

    var cat3: Cat = Cat("Miamiau","BKH",null)


    cat1.meow()
    cat2.meow()
    // Nachname Harry (person1)
    person1.lastName
    // Nachname Mario (owner von cat2)
    cat2.owner?.lastName

}
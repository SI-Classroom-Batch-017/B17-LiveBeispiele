package woche06


// Klasse definieren: Bauplan/Blaupause
// in den Konstruktor kommen parametrisierte Attribute (= die Variablen einer Klasse)
class Person(val firstName: String, var lastName: String, var age: Int, var favPizza: Pizza, var favColor: String = "white") {


    // Verhalten einer Klasse: Funktionen/Methoden:
    fun greeting() {
        println("Hi, ich bin $firstName $lastName und $age Jahre alt. Meine Lieblingsfarbe ist $favColor und meine Lieblingspizza ist ${favPizza.name}!")
    }

    fun birthDay(){
        println("$firstName hatte Geburtstag! Ist ein Jahr älter geworden")
        age++
    }

    fun wedding(partner: Person){
        println("$firstName $lastName heiratet ${partner.firstName} ${partner.lastName}")
        lastName = partner.lastName
        println("${firstName}s Nachname lautet jetzt auch $lastName")
    }

    fun printFavPizza(){
        println()
    }

}


fun main() {
    var number: Int = 10
    var ingredientsList: List<Ingredient> = listOf(Ingredient("Tomate", 0.5),Ingredient("Zwiebel",0.6))
    var pizza1: Pizza = Pizza("Monzarella",30,5.99, ingredientsList)
    pizza1.printAllIngredients()
    // erste Instanz der Klasse Person erstellt: in der Variable person1 gespeichert
    var person1: Person = Person("Harry", "Potter", 11,pizza1,"green")
    var person2: Person = Person("Ron", "Weasley", 11,Pizza("Salami",35,7.99,ingredientsList))
    println("Bitte gib Vorname, Nachname, Alter ein:")
    //var person3: Person = Person(readln(), readln(), readln().toInt())

    // wenn man eine Instanz direkt printed: kommt die Speicheradresse raus
    println(person1)

    // einzelne Eigenschaften einer Instanz ausdrucken
    println(person1.firstName)
    println(person1.lastName)
    println(person1.age)
    println("person1.age++")
    person1.age++
    println(person1.age)

    10.toDouble()


    person1.greeting()
    person2.greeting()
    //person3.greeting()

    person1.birthDay()
    person2.birthDay()
    //person3.birthDay()
    println(person1.age)
    println(person2.age)
    //println(person3.age)

    person1.wedding(person2)


    var personList: List<Person> = listOf(person1,person2,Person("Simon","Meyer",22,pizza1))




    // Funktionsaufrufe
    var result1: Int = calculate(1,2)
    var result2: Int = calculate(10,20)
    var result3: Int = calculate(4)
    result2 *= 2
}


fun calculate(nr1: Int, nr2: Int = 0): Int {
    return nr1+nr2
}

package woche06.Tag02

// Default Attribut / Default Parameter gender: muss im Konstruktor nicht angegeben werden, wenn es nicht angegeben wird, greift der Default Wert "male"
// muss immer als letztes angegeben werden
class Human(var name: String, var age: Int, var cars: List<Car>, var gender: String = "male") {

    var favColor: String = "white"
    var eyeColor: String = "brown"

    fun changeName(name: String){
        this.name = name
    }

    // override = überschreiben
    override fun toString(): String {
        return "Human: Name $name, Alter $age"
    }

}

fun changeName(human: Human, name: String){
    human.name = name
}

class Dog{
    var name: String = ""

    fun bell(){
        println("Wau wau ich bin $name")
    }
}


fun main() {
    var car1: Car = Car("Toyota",1999)
    var car2: Car = Car("VW",1969)
    var car3: Car = Car("Mercedes",2020)
    var human1: Human = Human("Norbert",55,listOf(car1,car2))
    var human2: Human = Human("Norberta",55,listOf(car1,car2),"female")
    human1.favColor
    human1.eyeColor
    println("------------")
    println(human1.name)
    human1.changeName("Otto")
    println(human1.name)

    changeName(human2,"Simone")

    var dog1: Dog = Dog()
    println(dog1.name)
    dog1.name = "Bello"
    println(dog1.name)
    dog1.bell()

    println(human1)
    println(human2)

}
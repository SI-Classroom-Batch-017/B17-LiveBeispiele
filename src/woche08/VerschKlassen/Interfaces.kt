// Interface
interface Vehicle {
    // Attribute koennen nicht initialisiert werden, muessen abstrakt bleiben
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The vehicle is braking.")
    }
}

interface LandVehicle{
    // hier irgendwelche Attribute/Methoden
}

// Interface in Klasse implementieren
class Car(override val maxSpeed: Double) : Vehicle, LandVehicle {
    // drive muss überschriebeen ewrden
    override fun drive(): String {
        return "The car is driving at a speed of $maxSpeed km/h"
    }
}

class Bicycle(override val maxSpeed: Double) : Vehicle {
    override fun drive(): String {
        return "The bicycle is driving at a speed of $maxSpeed km/h"
    }

    // brake kann überschrieben werden
    override fun brake() {
        println("The bicycle is braking gently.")
    }
}

fun main() {
    val car: Vehicle = Car(220.0)
    val bicycle: Vehicle = Bicycle(30.0)

    println(car.drive())
    car.brake()

    println(bicycle.drive())
    bicycle.brake()
}

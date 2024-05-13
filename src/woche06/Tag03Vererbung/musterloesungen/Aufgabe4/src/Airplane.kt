class Airplane(
    val amountTurbines: Int,
    val flyingSpeed: Double,
) {
    var isAirborne: Boolean = false

    fun takeOff() {
        if (!isAirborne) {
            isAirborne = true
        }
    }

    fun land() {
        if (isAirborne) {
            isAirborne = false
        }
    }
}

fun main() {
    val airplane = Airplane(4, 753.2)
    airplane.takeOff()
    airplane.land()
}
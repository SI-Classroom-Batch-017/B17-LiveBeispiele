import kotlin.math.PI

fun squareCalculations(sideLength: Double) {
    val area = sideLength * sideLength
    val perimeter = 4 * sideLength

    println("Quadrat - Flächeninhalt: $area, Umfang: $perimeter")
}

fun rectangleCalculations(length: Double, width: Double) {
    val area = length * width
    val perimeter = 2 * (length + width)

    println("Rechteck - Flächeninhalt: $area, Umfang: $perimeter")
}

fun circleCalculations(radius: Double) {
    val area = PI * radius * radius
    val perimeter = 2 * PI * radius

    println("Kreis - Flächeninhalt: $area, Umfang: $perimeter")
}

fun main() {
    squareCalculations(5.0)
    rectangleCalculations(4.0, 6.0)
    circleCalculations(3.0)
}

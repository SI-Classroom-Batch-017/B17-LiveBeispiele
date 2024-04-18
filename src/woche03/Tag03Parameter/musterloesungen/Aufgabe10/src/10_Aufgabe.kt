




fun convertEuroToDollar(amountEuro: Double): Double {
    return amountEuro * 1.08
}

fun main() {
    val dollarAmount = convertEuroToDollar(50.0)
    println("$50 Euro entsprechen $dollarAmount Dollar.")
}

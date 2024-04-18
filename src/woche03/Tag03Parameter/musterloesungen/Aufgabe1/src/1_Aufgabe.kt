




fun yourName(name: String) {
    if (name.isNotEmpty()) {
        println("Dein Name ist: $name")
    } else {
        println("Du hast keinen Namen eingegeben.")
    }
}

fun main() {
    yourName("Max")
}

// Aufgabe 10
fun dollarToEuro(dollarAmount: Double, exchangeRate: Double): Double {
    return dollarAmount * exchangeRate
}


// Aufgabe 11
fun calculateBMI(weight: Double, height: Double): Double {
    return weight / (height * height)
}

//Aufgabe 12
fun convertTemperature(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

// Aufgabe 13
fun validateEmail(email: String): Boolean {
    return email.contains("@")
}

// Aufgabe 14
fun calculateAverage(num1: Int, num2: Int, num3: Int): Double {
    return (num1 + num2 + num3) / 3.0
}


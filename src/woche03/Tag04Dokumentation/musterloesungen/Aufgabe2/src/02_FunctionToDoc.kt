/**
 * Wandelt eine Temperatur von Fahrenheit in Celsius um.
 * @param fahrenheit Die Temperatur in Fahrenheit.
 * @return Die Temperatur in Celsius.
 */
fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

/**
 * Überprüft, ob die erste Zahl größer oder gleich der zweiten Zahl ist.
 * @param num1 Die erste Zahl.
 * @param num2 Die zweite Zahl.
 * @return `true`, wenn num1 größer oder gleich num2 ist, andernfalls `false`.
 */
fun isGreaterOrEqual(num1: Int, num2: Int): Boolean {
    return num1 >= num2
}

/**
 * Wandelt die gegebene Anzahl von Sekunden in Minuten um.
 * @param seconds Die Anzahl der Sekunden.
 * @return Die Anzahl der Minuten, die den gegebenen Sekunden entsprechen.
 */

fun convertSecondsToMinutes(seconds: Int): Double {
    return seconds / 60.0
}

/**
 * Berechnet den Durchschnitt von drei Zahlen.
 * @param num1 Die erste Zahl.
 * @param num2 Die zweite Zahl.
 * @param num3 Die dritte Zahl.
 * @return Der Durchschnitt der drei Zahlen.
 */
fun calculateAverage(num1: Double, num2: Double, num3: Double): Double {
    return (num1 + num2 + num3) / 3
}


/**
 * Dreht den gegebenen String um.
 * @param inputString Der Eingabestring, der umgedreht werden soll.
 * @return Der umgedrehte String.
 */
fun reverseString(inputString: String): String {
    return inputString.reversed()
}

/**
 * Entfernt Leerzeichen aus dem gegebenen String.
 * @param inputString Der Eingabestring mit Leerzeichen.
 * @return Der Eingabestring ohne Leerzeichen.
 */
fun removeSpaces(inputString: String): String {
    return inputString.replace(" ", "")
}

fun main() {

}
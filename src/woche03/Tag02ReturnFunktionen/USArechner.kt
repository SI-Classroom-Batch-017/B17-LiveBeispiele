package woche03.Tag02ReturnFunktionen

fun main() {
    var fahrenheit: Double = celsiusToFahrenheit()

    println("Die aktuelle Temperatur in Fahrenheit: $fahrenheit")
    println("Die aktuelle Temperatur in Fahrenheit: ${celsiusToFahrenheit()}")

    println("Damit rechnen wir weiter...")
    var result = fahrenheit + 10
    println("Die Fahrenheit-Temperatur um 10 erhöht ist $result")

}

fun celsiusToFahrenheit(): Double {
    // Grad Fahrenheit = Grad Celsius mal 1,8 plus 32
    // multiply the temperature in Celsius by 9/5 and then add 32

    println("Bitte gib eine Temperatur in Celsius ein, die wir in Fahrenheit rechnen werden...")
    val temp: Double = readln().toDouble()
    val result: Double = temp*1.8 + 32

    return result
    // extra kurz mit 0 Variablen:
    // return readln().toDouble()*1.8+32
}


fun euroToDollar(): Double{
    println("Bitte gib einen Euro Betrag ein, den wir in Dollar rechnen werden...")
    val euro: Double = readln().toDouble()
    val result = euro*1.06
    return result
    // extra kurz:
    //return readln().toDouble() * 1.06
}

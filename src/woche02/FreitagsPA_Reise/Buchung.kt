fun main() {
    println("---Buchung---")
    println("Bitte gib dein Budget ein:")
    val budget = try {
        readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Ungültige Eingabe für das Budget. Muss eine Zahl sein. Starte das Programm erneut.")
        return
    }

    println("Wie viel kosten die Flugtickets?")
    val flightPrice: Double = try {
        readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Ungültige Eingabe für den Preis der Flugtickets. Muss eine Zahl sein. Starte das Programm erneut.")
        return
    }

    println("Wie viel kosten die Hotelzimmer?")
    val hotelPrice: Double = try {
        readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Ungültige Eingabe für den Preis der Hotelzimmer. Muss eine Zahl sein. Starte das Programm erneut.")
        return
    }

    val totalPrice: Double = flightPrice + hotelPrice

    if (totalPrice <= budget) {
        val remainingBudget = budget - totalPrice
        println("Die Flugtickets ($flightPrice) und Hotelzimmer ($hotelPrice) wurden erfolgreich gebucht!")
        println("Verbleibendes Budget: $remainingBudget")
    } else {
        println("Das Budget wurde um ${budget-totalPrice} überschritten. Bitte wähle günstigere Optionen.")
    }
}
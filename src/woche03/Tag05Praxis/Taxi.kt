package woche03.Tag05Praxis

import kotlin.system.exitProcess


/**
 * Verwaltet die Auswahl der Zahlungsmethode und bestätigt die Zahlung.
 */
fun managePaymentMethods() {
    println("Bitte wählen Sie Ihre Zahlungsmethode (paypal, visa, kreditkarte, giro):")
    var chosenPaymentMethod = readln()

    when (chosenPaymentMethod) {
        "paypal", "visa", "kreditkarte", "giro" -> println("Zahlung erfolgreich mit $chosenPaymentMethod.")
        else -> println("Ungültige Zahlungsmethode. Bitte wählen Sie eine der folgenden Methoden: paypal, visa, kreditkarte, giro")
    }
}

/**
 * Verarbeitet die Anfrage des Kunden, indem sie den Fahrpreis schätzt, die Verfügbarkeit des Fahrzeugs überprüft
 * und die Buchung bestätigt.
 *
 * @param distance Entfernung in Kilometern
 * @param vehicleType Typ des Fahrzeugs ("standard" oder "luxury")
 * @return Geschätzter Fahrpreis als Double
 */
fun processCustomerRequest(distance: Double, vehicleType: String): Double {
//    val standardRate = 0.50
//    val luxuryRate = 1.50
//
//    val rate = when (vehicleType) {
//        "standard" -> standardRate
//        "luxury" -> luxuryRate
//        else -> {
//            println("Ungültiger Fahrzeugtyp. Bitte wählen Sie zwischen Standard und Luxus.")
//            exitProcess(1)
//        }
//    }
    val fare = calculateFare(distance, vehicleType)
    println("Geschätzter Fahrpreis: $fare Euro")

    println("Möchten Sie die Fahrt buchen? (ja/nein)")
    val response = readln()
    if (response == "ja") {
        managePaymentMethods()
        println("Buchung bestätigt.")
    } else {
        println("Buchung abgelehnt.")
    }
    return fare
}

/**
 * Berechnet den Fahrpreis basierend auf der Entfernung und dem Fahrzeugtyp.
 *
 * @param distance Entfernung in Kilometern
 * @param vehicleType Typ des Fahrzeugs ("standard" oder "luxury")
 * @return Fahrpreis
 */
fun calculateFare(distance: Double, vehicleType: String): Double {
    val standardRate = 0.50
    val luxuryRate = 1.50

    val rate = when (vehicleType) {
        "standard" -> standardRate
        "luxury" -> luxuryRate
        else -> {
            println("Ungültiger Fahrzeugtyp. Bitte wählen Sie zwischen Standard und Luxus.")
            exitProcess(1)
        }
    }
    return distance * rate * 1.1
}


/**
 * Ruft den Taxidienst auf und führt den gesamten Buchungsprozess durch.
 * Der Benutzer wird aufgefordert, die Entfernung und den Fahrzeugtyp einzugeben.
 * Basierend auf diesen Eingaben wird ein Fahrvorschlag gemacht, der Fahrpreis berechnet
 * und die Zahlung verwaltet.
 */
fun getTaxi() {
    println("Please enter the distance in kilometers:")
    val distance = readln().toDouble()


    println("Please choose the vehicle type (standard/luxury):")
    val vehicleType = readln().lowercase()

    if (vehicleType == "standard" || vehicleType == "luxury") {

        val fareProposal = processCustomerRequest(distance, vehicleType)
        println("Fare Proposal: $fareProposal")

    } else {
        println("Invalid input for vehicle type. Exiting the program.")
        exitProcess(0)
    }
}


fun main() {
    getTaxi()
    druckeName("Johnny",99)
}

fun druckeName(name: String, zahl: Int){
    println(name)

    rufMichInDruckeNameAuf(name,zahl)
}


fun rufMichInDruckeNameAuf(string: String, zahl: Int): String {
    println("Ich wurde in druckeName mit durchgereichtem Parameter aufgerufen!")
    println("Der Parameter lautetet: $string")
    println("Es wurde auch eine Zahl übergeben: $zahl")

    return "Dieser String wird returned"
}
























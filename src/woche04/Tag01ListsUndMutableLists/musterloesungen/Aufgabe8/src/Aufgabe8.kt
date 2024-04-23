import kotlin.system.exitProcess

fun main() {
    var fahrzeuge = mutableListOf("Auto", "Motorrad", "Fahrrad", "Bus", "LKW")

    //a)
    fun entferneFahrzeug(fahrzeugName: String) {
        if (fahrzeuge.contains(fahrzeugName)) {
            fahrzeuge.remove(fahrzeugName)
            println("$fahrzeugName wurde aus der Liste entfernt.")
        } else {
            println("$fahrzeugName wurde nicht in der Liste gefunden.")
        }
    }

    //b)
    fun fuegeFahrzeugHinzu(neuesFahrzeug: String) {
        fahrzeuge.add(neuesFahrzeug)
        println("$neuesFahrzeug wurde zur Liste hinzugefügt.")
    }

    //c)
    println("Aktuelle Liste von Fahrzeugen: $fahrzeuge")

    entferneFahrzeug("Fahrrad")

    println("Liste nach Entfernen von 'Fahrrad': $fahrzeuge")

    fuegeFahrzeugHinzu("Motorroller")

    println("Liste nach Hinzufügen von 'Motorroller': $fahrzeuge")






}

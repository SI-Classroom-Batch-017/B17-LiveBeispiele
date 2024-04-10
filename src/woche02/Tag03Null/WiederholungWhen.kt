package woche02.Tag03Null
/*
Werbungsalgorithmus:
Speichere in der Variable ad (String) verschiedene Nachrichten abhängig von
- Geschlecht
- Alter (u18 / ü18)
- ob ein User Kinder hat oder nicht
- ob das Einkommen des Users hoch ist oder nicht

 */

fun main() {
    println("Programm startet....")
    var gender: String = "female"
    var age: Int = 18
    var hasChildren: Boolean = true
    var income: Double = 50.0















    // Speichere in der Variable ad (String) verschiedene Nachrichten

    var ad: String = when{
        gender == "female" && age >= 18 -> {
            if (income > 100){
                "Anzeige 1: Entdecke luxuriöse Produkte für junge Frauen!"
            }
            "Anzeige 1: Entdecke Produkte für junge Frauen!"
        }
        age > 30 && hasChildren /* == true */ -> {
            "Anzeige 2: Produkte für Babys"
        }
        age in 30..50 && income >= 100 -> {
            "Anzeige 3: Luxusprodukte für erwachsene Frauen!"
        }

        else -> {
            println("Mit { } darf ich mehr als 2 Zeilen Code pro Fall schreiben...")
            "Default Anzeige: Entdecke die besten Angebote!"
        }
    }
    println(ad)


    var weather: String = "sunny"

    when(weather){
        "sunny" -> {
            println("es ist sonnig")
        }
        "rainy" -> {
            println("es ist regnerisch")
        }
        "snowy" -> {
            println("es schneit")
        }
    }

}



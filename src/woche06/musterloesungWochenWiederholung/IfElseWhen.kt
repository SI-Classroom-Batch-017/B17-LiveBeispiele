package woche06.musterloesungWochenWiederholung

// Aufgabe 1
fun purchaseAllowed(name: String, age: Int) {
    if (age > 6) {
        println("$name darf einkaufen.")
    } else {
        println("$name muss mit den Eltern wiederkommen.")
    }
}

// Aufgabe 2
fun calculateDiscount(customerAge: Int, isRegularCustomer: Boolean): Double {
    var discount = 0.0

    if (customerAge > 60 && isRegularCustomer) {
        discount = 0.6 // 60% Rabatt
    } else if (customerAge > 60) {
        discount = 0.1 // 10% Rabatt
    } else if (isRegularCustomer) {
        discount = 0.2 // 20% Rabatt
    } else if (customerAge < 12) {
        discount = 0.15 // 15% Rabatt
    }

    return discount
}

// Aufgabe 3
fun checkDiscountDays(dayOfWeek: String) : Boolean {
    when (dayOfWeek) {
        "Montag", "Mittwoch", "Freitag" -> {
            println("Es gibt Rabatte heute.")
            return true
        }
        "Dienstag", "Donnerstag", "Samstag" -> {
            println("Es gibt keine Rabatte heute.")
            return false
        }
        "Sonntag" -> {
            println("Der Laden hat geschlossen, folglich gibt es keine Rabatte.")
            return false
        }
        else -> {
            println("Ungültiger Wochentag.")
            return false
        }
    }
}

// Aufgabe 4
fun buy(budget: Double, price: Double) {
    println("Kundenbudget: $budget Euro")
    println("Preis des Produkts: $price Euro")

    if (budget >= price) {
        val remainingBudget = budget - price
        println("Das Produkt wurde gekauft. Noch $remainingBudget Euro übrig.")
    } else {
        val missingAmount = price - budget
        println("Das Produkt ist zu teuer. Es fehlen $missingAmount Euro.")
    }
}
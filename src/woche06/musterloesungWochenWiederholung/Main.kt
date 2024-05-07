package woche06.musterloesungWochenWiederholung

fun main() {
    //TODO Aufgabe 1: Variablen und Datentypen
    displayStore()

    // Aufgabe 2: Listen, Maps und Sets
    // Erstelle eine Variable namens inventar in der du 5 Produkte mit ihren Preisen anlegst.
    val inventar = mutableMapOf(
        "Apfel" to 1.0,
        "Banane" to 0.5,
        "Orange" to 0.75,
        "Erdbeere" to 2.0,
        "Kiwi" to 1.25
    )

    // Füge jetzt manuell, das heißt mit der richtigen Funktion/Syntax und nicht einfach, indem du die originale Map bearbeitest, folgendes hinzu:
    addProduct(inventar,"iPhone",9999.99)
    addProduct(inventar,"Kaugummi",2.49)
    addProduct(inventar,"Smoothie",4.99)

    // verringere den Preis von 3 Produkten deiner Wahl um 1.50 Euro
    updatePrice(inventar,"Erdbeere")


    // Entferne das teuerste Produkt (du musst das Programm nicht rausfinden lassen, welches das teuerste ist, sondern kannst es selbst identifizieren)
    removeProduct(inventar,"iPhone")


    //5. Prüfe, ob das Produkt "Kaugummi" noch in der Map existiert und printe eine entsprechende Nachricht in die Konsole aus. Dafür brauchst du if else.
    doesProductExist(inventar,"Kaugummi")

    //6. Prüfe, ob es ein Produkt mit dem Preis 1.49 in der Map gibt und drucke eine entsprechende Nachricht in der Konsole aus.
    doesPriceExist(inventar,1.49)

//    7. Listen anlegen: Lege jetzt jeweils eine Liste an mit
//       - allen Produkten
//       - allen Preisen

    val products = inventar.keys.toList()
    val prices = inventar.values.toList()

    println("Produkte: $products")
    println("Preise: $prices")


    // 8. Was ist eigentlich nochmal ein Set im Unterschied zu einer Liste/Map?
    // --> Set enthält keine Doppelungen, keine Indizes, wie eine Liste wo alle doppelten Werte rausgefiltert werden





}


package woche03.Tag04Dokumentation


/**
 * Gibt den String, der als Parameter uebergeben wurde, komplett in Kleinbuchstaben zurueck.
 * @param inputString String, der in Kleinbuchstaben konvertiert werden soll
 * @return inputString komplett in Kleinbuchstaben
 */
fun toLowerCase(inputString: String): String { //"HARRY" -> "harry"
    return inputString.lowercase()
}


/**
 * Gibt den String, der als Parameter uebergeben wurde, rueckwaerts aus.
 * @param inputString String, der rueckwaerts ausgegeben werden soll
 * @return inputString komplett umgedreht
 */
fun reverseString(inputString: String): String {
    return inputString.reversed()
}

/**
 * Ersetzt im inputString den target-String mit einem replacement-String
 * @param inputString der String, in dem was ersetzt werden soll
 * @param target der Teil des inputString, der ersetzt werden soll
 * @param replacement das, was stattdessen in den target-String geschrieben werden soll
 * @return inputString mit den ersetzten Buchstaben
 */
fun replaceSubstring(inputString: String, target: String, replacement: String): String {
    return inputString.replace(target, replacement)// replaceSubstring("Harry","y","i") --> "Harri"
}

fun main() {
    var newString: String = replaceSubstring("Harry","y","i") // --> "Harri"
    println(newString)
}


package woche03.Tag04Dokumentation

/**
 * Berechnet die Länge eines gegebenen Strings.
 *
 * @param inputString Der zu untersuchende String.
 * @return Die Länge des Strings.
 */

fun calculateLength(inputString: String): Int {
    val length: Int = inputString.length
    return length
    // kurze Variante: return inputString.length
}



/**
 * Vergleicht zwei Strings auf Gleichheit.
 *
 * @param str1 Der erste zu vergleichende String.
 * @param str2 Der zweite zu vergleichende String.
 * @return True, wenn die Strings identisch sind, ansonsten False.
 */
fun compareStrings(str1: String, str2: String): Boolean {
    return str1 == str2
    // return str1.equals(str2)
}


/**
 * Überprüft, ob ein gegebener Substring in einem anderen String enthalten ist.
 *
 * @param inputString Der zu durchsuchende String.
 * @param subString Der zu suchende Substring.
 * @return True, wenn der Substring gefunden wurde, ansonsten False.
 */
fun subStringExists(inputString: String,subString: String): Boolean {
    return inputString.contains(subString)
}

/**
 * Extrahiert einen Teil eines Strings, beginnend an einer bestimmten Position bis zu einer anderen Position.
 *
 * @param inputString Der Eingabestring.
 * @param startIndex Der Startindex des zu extrahierenden Substrings.
 * @param endIndex Der Endindex des zu extrahierenden Substrings.
 * @return Der extrahierte Substring.
 */

fun extractSubString(inputString: String,startIndex: Int, endIndex: Int): String {
    return inputString.substring(startIndex,endIndex)
}

/**
 * Teilt einen String anhand eines bestimmten Trennzeichens in Teile auf und gibt diese Teile in einer Liste zurück.
 *
 * @param inputString Der zu teilende String.
 * @param delimiter Das Trennzeichnen, das zum Aufteilen des Strings verwendet wird.
 * @return Ein Array, das die aufgeteilten Teile des Strings enthält.
 * @throws IllegalArgumentException Wenn der Eingabestring leer ist oder das Trennzeichnen leer ist.
 */
fun splitString(inputString: String,delimiter: String): List<String> {
    if (inputString != "" && delimiter.isNotEmpty()){
        return inputString.split(delimiter)
    } else {
        throw IllegalArgumentException()
    }
}

/**
 * Wandelt einen gegebenen String in Großbuchstaben um.
 *
 * @param inputString Der zu konvertierende String.
 * @return Der String in Großbuchstaben.
 */

fun convertStringToUppercase(inputString: String): String {
    return inputString.uppercase()
}

/**
 * Druckt einen String in Grossbuchstaben aus.
 *
 * @param inputString Der zu konvertierende String.
 *
 */
fun printStringToUppercase(inputString: String) {
    println(inputString.uppercase())
}

fun main() {

}




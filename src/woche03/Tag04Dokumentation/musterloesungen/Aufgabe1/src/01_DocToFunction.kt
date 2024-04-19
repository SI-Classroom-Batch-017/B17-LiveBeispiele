
/**
 * Berechnet das Quadrat einer gegebenen Zahl.
 *
 * @param x Die Zahl, deren Quadrat berechnet werden soll.
 * @return Das Quadrat der Zahl.
 */
fun calculateSquare(x: Int): Int {
    return x * x
}

/**
 * Berechnet den Kubik einer gegebenen Zahl.
 *
 * @param x Die Zahl, deren Kubik berechnet werden soll.
 * @return Der Kubik der Zahl.
 */

fun calculateCube(x: Double): Double {
    return x * x * x
}

/**
 * Zählt, wie oft ein bestimmter Buchstabe in einem String vorkommt.
 *
 * @param input Der Eingabestring, in dem die Buchstaben gezählt werden sollen.
 * @param letter Der Buchstabe, dessen Vorkommen gezählt werden soll.
 * @return Die Anzahl der Vorkommen des Buchstabens im String.
 */
fun countLetterOccurrences(input: String, letter: Char): Int {

    return input.length - input.replace(letter.toString(), "").length
}

/**
 * Gibt einen Substrings aus einem Eingabestring aus.
 * Der Substring beginnt an einer Anfangsposition im Eingabestring und geht bis zu einer Endposition.
 *
 * @param inputString Der Eingabestring, aus dem der Substring extrahiert werden soll.
 * @param startIndex Die Anfangsposition des Substrings.
 * @param endIndex Die Endposition des Substrings.
 * @return Der extrahierte Substring.
 */
fun extractSubstring(inputString: String, startIndex: Int, endIndex: Int): String {

    return inputString.substring(startIndex, endIndex)
}

/**
 * Ersetzt Umlaute in einem String durch ihre Nicht-Umlaut-Formen.
 *
 * @param input Der Eingabestring, in dem die Umlaute ersetzt werden sollen.
 * @return Der String mit ersetzen Umlauten.
 */

fun replaceUmlauts(input: String): String {

    return input
        .replace("ä", "ae")
        .replace("ö", "oe")
        .replace("ü", "ue")
        .replace("Ä", "Ae")
        .replace("Ö", "Oe")
        .replace("Ü", "Ue")

}

/**
 * Überprüft, ob die Länge eines gegebenen Strings > 10 ist und gibt eine entsprechende Nachricht zurück.
 *
 * @param inputString Der zu überprüfende String.
 * @return Eine Nachricht, die die Länge des Strings beschreibt.
 */
fun checkStringLength(inputString: String): String {
    return when {
        inputString.length < 5 -> "Kurzer String"
        else -> "Langer String"
    }
}

/**
 * Berechnet den Durchschnitt von drei gegebenen Zahlen.
 *
 * @param num1 Die erste Zahl.
 * @param num2 Die zweite Zahl.
 * @param num3 Die dritte Zahl.
 * @return Der Durchschnitt der Zahlen.
 * @throws IllegalArgumentException Wenn eine der Zahlen negativ ist.
 */
fun calcAverage(num1: Int, num2: Int, num3: Int): Double {
    if (num1 < 0 || num2 < 0 || num3 < 0) {
        throw IllegalArgumentException("Negative Zahlen sind nicht erlaubt.")
    }
    return (num1 + num2 + num3) / 3.0
}

/**
 * Überprüft, ob ein gegebener String ein Palindrom ist.
 * Ein Palindrom ist ein String, der vorwärts und rückwärts gelesen identisch ist.
 *
 * @param inputString Der zu überprüfende String.
 * @return True, wenn der String ein Palindrom ist, ansonsten False.
 */
fun isPalindrome(inputString: String): Boolean {
    val reversedString = inputString.reversed()
    return inputString == reversedString
}



fun main() {

}
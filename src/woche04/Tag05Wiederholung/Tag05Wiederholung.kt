package woche04.Tag05Wiederholung

// Globale Variable
val gradeMap = mapOf(
    "Max" to 85,
    "Anna" to 90,
    "Erik" to 75,
    "Sophie" to 95,
    "Jonas" to 80,
    "Mia" to 40,
    "Marlon" to 30,
    "Annegret" to 20,
    "Erika" to 22,
    "Sophia" to 85,
    "Johannes" to 100,
    "Mario" to 40,
)

fun main() {

    // Doppelte Keys beim Initialisieren: der letztere wird behalten, da der ältere von diesem überschrieben wird
    println(getGrade("Sophie")) // 95
    println(getAverageGrade()) // 58.5
    println(getBestGrade()) // 95
    println(getWorstGrade()) // 20
    println(needsRetest("Erika")) // true
    println(needsRetest("Max")) // false

}

/**
 * Gibt die Note des als Parameter übergebenen Schülers zurück
 * @param student der Schüler, dessen Note wir herausfinden wollen
 * @return die Note (Int)
 */
fun getGrade(student: String): Int? {
    return gradeMap[student]
}

/**
 * Gibt die Durschnittsnote der Klasse zurück
 * @return Durchschnittsnote (Double)
 */

fun getAverageGrade(): Double {
    // 3 Varationen
        // 1. Längste Variation
        val grades: List<Int> = gradeMap.values.toList()
        val average: Double = grades.average()
        return average
        // 2. Mittel lange Variation
        return grades.average()

        // 3. Kürzeste Version
        return gradeMap.values.toList().average()

    // Alternative:
    return gradeMap.values.sum().toDouble() / gradeMap.size
}


/**
 * Gibt die beste Note der Klasse zurück
 * @return die höchste Punktzahl
 */
fun getBestGrade(): Int {
    return gradeMap.values.max()
}


/**
 * Gibt die tiefste Note der Klasse zurück
 * @return die tiefste Punktzahl
 */
fun getWorstGrade(): Int {
    return gradeMap.values.min()
}



/**
 * Prüft, ob ein Schüler in die Nachprüfung muss (unter 40 Punkte hat)
 * @param name des Schülers (String)
 * @return true, wenn ein Schüler unter 40 Punkte hat
 *
 */

fun needsRetest(student: String): Boolean {
    if (getGrade(student)!! <= 40) {
        println("$student muss leider in die Nachprüfung...")
        return true
    } else {
        println("Glück gehabt! $student hat mit ${getGrade(student)} Punkten bestanden!")
        return false
    }
}


/**
 * Prüft, ob und wer 100 Punkte erreicht hat
 * @returns den Namen der Person, die 100 Punkte erreicht hat
 */

fun whoHas100Points(): String {

    // if (getBestGrade() == 100)
    // if (100 in gradeMap.values)
    if (gradeMap.values.contains(100)){

        val notenListe: List<Int> = gradeMap.values.toList()
        val studentListe: List<String> = gradeMap.keys.toList()

        val indexOf100: Int = notenListe.indexOf(100)
        val studentWith100: String = studentListe[indexOf100]
        return studentWith100
    }
    else {
        return "Niemand hat 100 Punkte erreicht..."
    }
}





package vorlesungen.Woche05.Tag25

fun main() {
    val lyrics: String = "Every night, I live and die \n" +
            "Feel the party to my bones \n" +
            "Watch the wasters blow the speakers \n" +
            "Spill my guts beneath the outdoor light \n" +
            "It's just another graceless night \n" +
            "I hate the headlines and the weather \n" +
            "I'm nineteen and I'm on fire \n" +
            "But when we're dancing, I'm alright \n" +
            "It's just another graceless night \n" +
            "\n" +
            "Are you lost enough? \n" +
            "Have another drink, get lost in us \n" +
            "This is how we get notorious, oh \n" +
            "'Cause I don't know \n" +
            "If they keep tellin' me where to go \n" +
            "I'll blow my brains out to the radio, oh-oh-oh (Tch-tch) \n" +
            "\n" +
            "All of the things we're taking \n" +
            "'Cause we are young and we're ashamed \n" +
            "Send us to perfect places \n" +
            "All of our heroes fading \n" +
            "Now I can't stand to be alone \n" +
            "Let's go to perfect places \n".lowercase()


    // TODO vorkommen des buchstabens 'a' zählen

//    val aVorkommen: Int = findChar(lyrics, 'a')
//    val bVorkommen: Int = findChar(lyrics, 'b')


    // vorkommen aller buchstaben zählen

    //countAllLetters(lyrics)

    // alle Zeichen im String zählen:
    var allChars: Int = lyrics.length


    // TODO Anzahl aller Buchstaben ohne Leerzeichen, ohne Sonderzeichen

        // 1. Ansatz mit split: gibt uns liste an worten zurueck
        var allLetters: List<String> = lyrics.split(" ","'",",")
        // Länge jedes Wortes in dieser Liste an Worten zum Counter addieren
        var counter = 0
        for (word in allLetters){
            counter += word.length
        }
        println("Alle Buchstaben ohne Sonderzeichen: $counter")

        // 2. Ansatz: mit replace alle Sonderzeichen / Leerzeichen ersetzen mit "", dann länge zählen
        var words = lyrics.replace(" ","").replace("'","").replace(",","")
        println(words.length)



    //println(allLetters)
    var allLettersString: String = allLetters.toString()
   // println(allLettersString)


    // TODO längstes wort im text finden

    // TODO mehrere längste worte im text finden, wenn welche gleich lang sind


}

fun countAllLetters(lyrics: String) {
    var counter = 0

    for (letter in 'a'..'z') {
        counter = 0
        for (char in lyrics) {
            if (letter == char) {
                counter++
            }
        }
        println("Vorkommen Buchstabe $letter: $counter")
    }
}

fun findChar(lyrics: String, searchedChar: Char): Int {
    var counter: Int = 0

    for (char in lyrics) {
        if (char == searchedChar) {
            counter++
        }
    }
    println("Der Buchstabe $searchedChar kommt $counter x vor.")

    return counter

    return lyrics.count { it == searchedChar }

}




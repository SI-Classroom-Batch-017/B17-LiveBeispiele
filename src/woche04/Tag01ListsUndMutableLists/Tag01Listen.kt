package woche04.Tag01ListsUndMutableLists

fun main() {
    // einfache variable anlegen
    var string: String = "Hallo Welt"

    // listenvariable anlegen
    val stringListe: List<String> = listOf("Hallo", "Hi", "Moin", "Hey")


    println("Unsere Liste an Strings:")
    println(stringListe) // [Hallo, Hi, Moin, Hey]

    println("Unsere Liste an Integers:")
    val intList: List<Int> = listOf(1,2,3,4,5)
    println(intList)

    println("Leere String-Liste:")
    val emptyList = listOf<String>(           )
    println(emptyList)


    // Zugriff auf 1. Element
    val firstGreeting: String = stringListe[0] // 1. Element Hallo
    println(firstGreeting)
    val erstesElement: String = stringListe.first()
    val lastElement: String = stringListe.last()

    // deprecated (= veraltete) Funktionen: durchgestrichen, dokumentation sagt uns, was wir stattdessen benutzen sollen
    "x".lowercase()
    "x".toLowerCase()



    println(stringListe[3]) // 4. Element Hey

    val index: Int = 2
    println(stringListe[index]) // 3. Element Moin
    println(stringListe[readln().toInt()])
    var randomInt: Int = getRandomInt()
    println(stringListe[10])
    // letztes Element aus Liste holen, dynamisch programmiert:
    val last: String = stringListe[stringListe.size-1] // oder: einfach .last()
    println(last) // "Hallo"

    // Listenoperationen
    // .size: gibt uns die Länge der Liste zurueck
    val stringListSize: Int = stringListe.size // 4
    println("Länge der stringListe ($stringListe): $stringListSize")
    try {
        // IndexOutOfBoundsException: Index 10 out of bounds for length 4
        println(stringListe[10])
    } catch (e: IndexOutOfBoundsException){
        println("FEHLER!! $e Index geht nur bis ${stringListe.size-1}")
    }



    // isEmpty: gibt true zurück, wenn die Liste leer ist.
    var isListEmpty: Boolean = stringListe.isEmpty() // false
    println("Die Liste $stringListe ist ${if (isListEmpty) "" else "nicht"} leer.")

    // Gegenteil: isNotEmpty: gibt true zurück, wenn die Liste NICHT leer ist
    var isNotEmpty: Boolean = emptyList.isNotEmpty() // false
    println("Die Liste $emptyList ist ${if (isNotEmpty) "nicht" else ""} leer.")

    val nameList: List<String> = listOf("Harry", "Ron", "Luna", "Hermine")

    // get: Alternative zum Index
    println(nameList.get(0)) // 1. Element, analog zu nameList[0] oder nameList.first()
    println(nameList.get(nameList.size-1)) // letztes Element, analog zu nameList.last() oder nameList[nameList.size-1]
    println(nameList.size) // 4

    // contains: true, wenn das exakt gleiche (also auch gleich geschriebene) Element vorhanden ist
    println(nameList.contains("Ron")) // true
    println(nameList.contains("ron")) // false

    var harry = nameList.first().lowercase()
    harry.equals("harry")


    // sublist: gibt uns eine Liste mit Elementen von fromIndex bis AUSschliesslich dem toIndex zurück.

    var subNameList: List<String> = nameList.subList(0,4) // 4 ist EXklusive, nicht enthalten
    println(subNameList)


    // reversed: gibt uns eine Kopie der Liste in umgekehrter Reihenfolge zurück
    var reversedNameList: List<String> = nameList.reversed()
    println(reversedNameList)

    // sorted: gibt uns eine Kopie der Liste in sortierter Reihenfolge zurück
    var sortedNameList: List<String> = nameList.sorted()
    println(sortedNameList)

}

fun getRandomInt(): Int {
    return (0..3).random()
}
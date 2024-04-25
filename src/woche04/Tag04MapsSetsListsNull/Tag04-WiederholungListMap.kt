package vorlesungen.Woche02

fun main() {
    // Variable
    val number: Int = 1
    // Liste anlegen
    val list: List<Int> = listOf(
        1,
        2,
        3,
        4,
        5
    )

    // Map anlegen
    val map: Map<String, Int> = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3,
        "d" to 4
    )

    // komplexere Map anlegen: Ein String (Album Name) ist auf eine weiter Map gemappt, in dieser Map finden wir Track Nr zu Song Namen gemappt
    val complexMap: Map<String,Map<Int,String>> = mapOf(
        "Midnights" to mapOf(
            1 to "Lavender Haze",
            2 to "Maroon",
            3 to "blabla"
        ),
        "1989" to mapOf(
            1 to "Welcome to New York",
            2 to "Blank Space"
        )
    )

    // komplexere Map: Int Patienten ID ist auf Liste an Strings mit Patienten Fragen gemappt
    val patientMap: Map<Int, List<String>> = mapOf(
        899 to listOf("Max Mustermann", "Am Gleis 2", "98335", "max.muster@mail.com"),
        900 to listOf("Marianne Mustermann", "Am Gleis 2", "98335", "marianne.muster@mail.com")
    )

    // kann ich Maps als Listeneinträge machen?
    val mapList: List<Map<String,Int>> = listOf(
        map,
        mapOf(
            "eins" to 1,
            "zwei" to 2,
            "drei" to 3
        )

    )

    val theorieKonstrukt: Map<Map<Map<String,List<Int>>,Double>,List<Int>> = mapOf(
        // aufdroeseln, was da reinkommt
    )

    val languageMap: Map<String,Map<String,String>> = mapOf(
        "hello" to mapOf(
            "fr" to "bonjour",
            "de" to "hallo",
            "es" to "hola"
        ),
        "goodbye" to mapOf(
            "fr" to "au revoir",
            "de" to "tschau",
            "es" to "adios"
        )
    )

    val settingsMap: Map<String,Boolean> = mapOf(
        "Kamerazugriff" to true,
        "ab18" to false,
        "dark mode" to true
    )


    // Zugriff auf Listenelement:
    val firstListElement: Int = list[0]

    // Zugriff auf Map-Value:
    // umgang mit map value, der immer nullable ist:
    val two: Int? = map["banane"]
    println(two)
    val one: Int = map["orange"]?:0
    println(one)

    val three: Int = map["c"]!!
    println(three)

    val four: Int? = map.get("d")


    val mutableMap = map.toMutableMap()
    println(mutableMap)
    // Element neu hinzufügen
    mutableMap.put("e",5)
    println(mutableMap)

    // ODER: fügt was neues hinzu, wenn der key noch nicht existiert.
    mutableMap["f"] = 6
    println(mutableMap)

    // a existiert bereits, wird jetzt mit der 11 überschrieben
    mutableMap["a"] = 11

    println(mutableMap)

    mutableMap.set("g",7)
    println(mutableMap)

    // put gibt uns null zurueck, wenn der key nicht vorher existiert hat.
    // wenn es den key vorher gab, gibt uns put zurueck, was der value war, bevor er ersetzt wurde
    val oldValue: Int? = mutableMap.put("b",12)
    println(oldValue)

    // mehrere Elemente gleichzeitig hinzufügen: putAll erwartet eine map
    mutableMap.putAll(
        mapOf(
            "h" to 8,
            "i" to 9,
            "j" to 10
        )
    )

    println(mutableMap)


    // Rechnen mit Map Keys:
    var result: Int = mutableMap["i"]!! +  mutableMap["j"]!!

    // ODER:
    var safeResult: Int? = mutableMap["i"]?.plus(mutableMap["j"]!!)

}
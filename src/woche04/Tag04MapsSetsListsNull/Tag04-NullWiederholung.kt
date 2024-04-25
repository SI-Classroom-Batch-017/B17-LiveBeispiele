package vorlesungen.Woche02

fun main() {
    // WIEDERHOLUNG: NULL

    // nullable Variable (nullable bedeutet: kann null enthalten. Das ? macht's hinterm Datentyp möglich)
    var nr: Int? = null
    // 100 Zeilen code, in denen irgendwas passiert
    nr = 13
    // noch mehr Code, in dem was anderes passiert
    nr = null

    // mit einer nullable Variable weiterarbeiten: wir brauchen einen SAFE CALL (?) oder einen NON NULL ASSERTED CALL (!!) oder den ELVIS Operator


        // Non Null Asserted Call: wir garantierem dem Compiler, dass hier nicht null drin steht. Ist die Variable dann doch null, stürzt das Programm ab.
        // println(nr!!.toDouble()) // Programm stuürzt ab



        // Safe Call: falls in nullableNumber null steht, wird einfach null statt dem gewollten Double zurück gegeben und das Programm läuft weiter
        println(nr?.toDouble()) // null wird ausgedruckt, wenn null drin steht

        // Elvis Operator: extrem verkürztes if else
        println(nr?: 10.toDouble())
        println(nr?: readln().toDouble()) // brauchen nicht readln().toInt().toDouble(), weil durch .toDouble() eh eine Zahl aus der Eingabe wird
        println(nr?: getRandomInt().toDouble())


    // Null in Listen. geht auch mit mutable Listen
    var listWithNull: List<Int?> = listOf(1,4,5,null,7,6,null,10)
    var nullableList: List<Int>? = null
    nullableList = listOf(1,2,3)
    nullableList = null

    var mutableNullList: MutableList<Int?> = listWithNull.toMutableList()

    callNullableListFunction(mutableNullList)
    callNullableListFunction(mutableNullList)
    callNullableListFunction(mutableNullList)

}

fun callNullableListFunction(mutableNullList: MutableList<Int?>) {
    println("Bitte eine Zahl zwischen 0 und ${mutableNullList.size - 1} eingeben...")
    doubleNullableListEntry(mutableNullList, readln().toInt())
    println(mutableNullList)
}

fun getRandomInt(): Int {
    return (1..10).random()
}


// Funktion, die eine MutableListe an nullable Ints als Paramter bekommt, den nutzer nach einem Index fragt, und nur, wenn die Zahl an dem Index NICHT null ist, die Zahl verdoppelt

fun doubleNullableListEntry(list: MutableList<Int?>, index: Int) : Int? {

    if (index !in 0..list.size-1){ // if (index < 0 || index > list.size-1){
        println("Dein eingegebener Index ist zu gross! ($index) Wir geben einfach null zurueck...")
        return null
    }

    if (list[index] != null){
        println("An Index $index Steht die Zahl  ${list[index]}")
        list[index] = list[index]?.times(2)
        println("Die $index. Stelle in der Liste wurde verdoppelt: ${list[index]}")
        return list[index]
    }
    else {
        println("Der $index. Eintrag in der Liste war null! (${list[index]})")
        return null
    }

}

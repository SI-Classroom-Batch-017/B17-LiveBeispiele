package woche03.Tag03Parameter


fun multWithReturn2(nr1: Int, nr2: Int) : Int {
    val result: Int = nr1*nr2
    println("Ergebnis der Multiplikation von $nr1 und $nr2 = $result")
    return result
}

fun main() {

//    println(multWithReturn2(1,9))
//    val result2 = multWithReturn2(19,222)
//    println(result2)
//    var result3 = multWithReturn2(readln().toInt(),8)
//    var x= 10
//    var result4 = multWithReturn2(2,x)
//    var result5 = multWithReturn2(22,9)
//    printSum(multWithReturn2(readln().toInt(),x),8)
//    printSum(0,35)
//    printSum(18,9)

    greetWithName()
    greetWithName("Maria")

}

fun printSum(nr1: Int, nr2: Int){
    println(nr1+nr2)
}

// Default Parameter: mit name : Datentyp = Default-Inhalt, auf den zurueckgefallen werden soll, falls nichts eingegeben wird
fun greetWithName(name: String = "Anonym"){
    println("Hallo, $name!")
}
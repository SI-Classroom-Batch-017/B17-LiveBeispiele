package woche03.Tag02ReturnFunktionen

fun main() {
//    val ergebnis: Double = multWithReturn()
//
//    val rechnung: Double = ergebnis + multWithReturn() + 10.0
//
//    println("Ergebnis aus multWithReturn(), von der main aus abgerufen:")
//    println(ergebnis)
//
//
//
//    //var name: String = getName()
//    var fullName: String = getFullName()
//
    var isSunny: Boolean = sunnyOrNot()
    println("Die Sonne scheint ${if (!isSunny) "nicht" else ""}")

    var result = multWithReturn()

}

fun sunnyOrNot(): Boolean {
    println("Scheint gerade die Sonne? (true/false)")
    var isSunny: Boolean = readln().toBoolean()
    if (isSunny){
        return true
    } else {
        return false
    }

    //return readln().toBoolean()
}

fun getName(): String {
    println("Bitte gib deinen Namen ein...")
    var name: String = readln()
    return name
    // oder: direkt return readln(), ohne name-Variable anzulegen
}
fun multWithReturn() : Double {
    println("Bitte 2 Zahlen eingeben...")
    var nr1: Double = readln().toDouble()
    var nr2: Double = readln().toDouble()
    var result: Double = nr1*nr2
    println("Ergebnis der Multiplikation von $nr1 und $nr2 = $result")
    return result
}
fun getFullName(): String {
    val firstName: String = getName()
    val lastName: String = getName()
    val fullName: String = "$firstName $lastName"
    return fullName
}

fun getFullNameShort(): String {
    return "Dein voller Name ist: ${getName()} ${getName()}"
}

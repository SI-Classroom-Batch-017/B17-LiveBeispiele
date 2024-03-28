package woche01

fun main() {

    // globale Variable aus Tag04WiederholungTag03 nutzen:
    println(BEISPIEL_GLOBAL)


    var double: Double = 1.123456789
    var double2: Double = 1.123456789
    println(double)

    // kuerzen mit Hilfe von String.format: 2f steht für 2 Nachkommastellen, der Rest wird abgeschnitten
    var roundedString: String = "%.2f".format(double)

    println(roundedString)

    // Vorsicht! Das ist kein Double mehr, also nicht mehr rechenbar, und das Komma ist von einem . zu einem , geworden:
    println(roundedString+22) // 1,1222

    roundedString = roundedString.replace(",",".")

    double = roundedString.toDouble()

    println(double+100)

    var shortDouble: Double = "%.2f".format(double2).replace(",",".").toDouble()





}
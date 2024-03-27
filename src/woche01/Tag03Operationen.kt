package woche01

fun main() {

    // +, -, * , /

    // Plus +, Addition, Ergebnis nennt sich Summe
    val sum: Int = 10 + 40
    val nr1: Int = 20
    val nr2: Int = 100
    // Variablen koennen ineinander gespeicher/geschachtelt werden, wie Lego Steine zusammen gesetzt werden
    val sum2: Int = nr1 + nr2

    println(sum)
    println(sum2)

    // Dividieren von Ints: wenn Kommazahl rauskommt, wird die Nachkommastelle einfach "abgeschnitten"
    val intDivision: Int = 50/6
    println(intDivision) // hier kommt 8 raus, obwohl das Ergebnis eigentlich 8.3333333

    // Ergebnis einer Rechnung mit Double und Integer ist immer ein Double
    val doubleDivision: Double = 50/6.0
    println(doubleDivision)

    // Integer und String zusammen"rechnen": geht nicht, + mit Strings ist immer Konkatenation (Verkettung)
    var intStringCalc: String = "3" + 3
    println(intStringCalc)

    // Minus (Subtraktion) mit Doubles, Ergebnis nennt sich Differenz, deshalb doubleDiff
    val doubeDiff: Double = 100.0-50.0 // Ergebnis: 50.0


    // Mal (Multiplikation)
    val mult: Double = sum * doubeDiff
    println("$mult ist das Ergebnis on $sum * $doubeDiff")

    val divident: Double = 15.0/3.0 // Ergebnis: 5.0

    // Ergebnis von Int und Double ist immer Double
    val divideDoubleByInt: Double = 20.0/4
    println("Double durch ein Int teilen: $divideDoubleByInt")

    val multIntWithDouble: Double = 9 * 10.0
    println(multIntWithDouble)

    // Rechnung mit Klammer: Klammerinhalt wird zuerst berechnet
    var result = 16/(2*2) // quasi 16 geteilt durch 4, ergibt 4
    println("Punkt vor Strich: $result")

    // weiteres Beispiel: Punkt vor Strich ohne Klammer
    var resultWoBracket = 20/2+2 // quasi: 10+2, Ergebnis: 12
    println("Result2 = $resultWoBracket")

    var resultWithBracket = 20/(2+2) // Ergebnis: 5
    println("Result Mit Klammern = $resultWithBracket")


    // MODULO %: Rest einer Division
    val rest: Int = 100%10
    println(rest) // Ergebnis: 0
    val rest1: Int = 101%10
    println(rest1) // Ergebnis: 1
    val rest2: Int = 102%10
    println(rest2) // Ergebnis: 2
    val rest3: Int = 103%10
    println(rest3)
    val rest4: Int = 104%10
    println(rest4)
    val rest5: Int = 105%10
    println(rest5)
    val rest10: Int = 110%10
    println(rest10)

    // Modulo mit Kommazahl
    val restMitKomma: Double = 101.5%10.0
    println(restMitKomma) // Ergebnis: 1.5

    // mehrere Reste zusammen ausdrucken:
    println("$rest\n$rest1\n$rest2\n$rest3\n$rest4\n$rest5")



}
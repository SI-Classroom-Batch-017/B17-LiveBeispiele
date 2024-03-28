package woche01




// importiert uns die Funktion sqrt aus dem Kotlin.Math package, in dem mathematische Funktionen drin sind.
import kotlin.math.sqrt
import kotlin.math.* // * = alle funktionen werden importiert


fun main() {

    // Wurzel ziehen: 7*7 ist 49, deshalb ist die Wurzel von 49 = 7
    // sqrt verlangt ein Double und gibt ein Double zurueck
    var wurzel: Double = sqrt(49.0)
    println("Die Wurzel von 49 ist $wurzel")

    // pow: Potenz (auf englisch: power of) zB 3*3 = 9 , das heißt 3^2 = 9, 3^3 = 27
    // vordere zahl: basis, muss ein Double sein. zahl in den klammern: Potenz. darf Double oder Int sein
    var potenz: Double = 3.0.pow(2) // inhalt der klammer darf double oder int sein
    println("3 hoch 2, also 3*3 = $potenz")


    // min
    var x: Int = 99 // hier könnte ein funktionsaufruf stehen, bei dem ich vorher keine ahnung hab, was rauskommt
    var y: Int = 19
    var minNr: Int = min(x,y)
    println("Die kleinere Zahl ist $minNr")

    // max
    var maxNr: Int = max(x,y)
    println("Die groessere Zahl ist $maxNr")

    // Modulo: der Rest, der übrig bleibt, wenn man 2 zahlen teilt. zB:
    var mod: Double = 10.0%9.0 // Rest: 1.0
    var mod2: Int = 5%3 // Rest: 2
}
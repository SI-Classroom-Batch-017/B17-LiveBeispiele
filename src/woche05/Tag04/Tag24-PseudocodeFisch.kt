package VORLESUNG.Woche05.Tag24

fun main() {
    val fischSorten: List<String> = listOf("giftiger Kugelfisch", "Hering", "Barsch", "Lachs", "Dose")

    // Fisch Aufgabe mit do while
    fishDoWhile(fischSorten)

    println("---")

    // Fisch aufgabe mit for
    fishFor(fischSorten)

}

fun fishFor(fischSorten: List<String>) {
    val gefangeneFische: MutableList<String> = mutableListOf()
    for (i in 0 until 20){
        println("Es wird geangelt...")
        var nächsterFisch: String = fischSorten.random()
        println("Oha! Es ist ein $nächsterFisch an der Angel!")
        if (nächsterFisch == "giftiger Kugelfisch") {
            println("$nächsterFisch ist giftig, den werfen wir zurück in den See...")
            continue // aktuelle Iteration wird abgebrochen, Schleife geht mit der nächsten Iteration weiter
        } else if (nächsterFisch == "Dose") {
            println("Pfui wir haben eine $nächsterFisch am Haken! Hier angeln wir nicht weiter.")
            break // ganze Schleife wird komplett abgebrochen
        }
        gefangeneFische.add(nächsterFisch)
    }

    println("Angeln abgebrochen, es war eine Dose im See. Igitt.")
    println("Ausbeute: $gefangeneFische")

}

fun fishDoWhile(fischSorten: List<String>) {
    val gefangeneFische: MutableList<String> = mutableListOf()

    do {
        println("Es wird geangelt...")
        var nächsterFisch: String = fischSorten.random()
        println("Oha! Es ist ein $nächsterFisch an der Angel!")
        if (nächsterFisch == "giftiger Kugelfisch") {
            println("$nächsterFisch ist giftig, den werfen wir zurück in den See...")
            continue
        }
        gefangeneFische.add(nächsterFisch)
    } while (nächsterFisch != "Dose")

    println("Angeln abgebrochen, es war eine Dose im See. Igitt.")
    println("Ausbeute: $gefangeneFische")

}


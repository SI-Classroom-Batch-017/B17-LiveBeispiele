fun main() {
    val flugPlaetze : Int = 130
    val anzahlFamilien : Int = (flugPlaetze / 4)
    println("Anzahl an Familien: $anzahlFamilien")

    var freiePlaetze : Int = flugPlaetze - 25 * 4
    println("Freie Sitzplaetze: $freiePlaetze")

    var flugKostenProKM : Int = 16
    val anzahlKM : Double = 1034.93
    val flugTicket : Int = 125

    val einnahmen : Int = flugTicket * flugPlaetze
    val kosten : Double = flugKostenProKM * anzahlKM
    println("Einnahmen: $einnahmen")
    println("Kosten: $kosten")
    println("Gewinn: ${einnahmen-kosten}")


        var sitzplätze = 130
        var vierKöpfigeFamily = 4
        println("Wieviel 4-Köpfige Familien können mitfliegen: ${sitzplätze/vierKöpfigeFamily} ")

        var vierKöpfigeFamily2 = 25
        println("Wieviel Sitzplätze sind übrig? ${sitzplätze% (vierKöpfigeFamily*vierKöpfigeFamily2)}")

        var proKm = 16.0
        var flugStrecke = 1034.93
        var sum = proKm*flugStrecke

        println("Kosten für die Fluggesellschaft? ${proKm*flugStrecke}€")

        var einTicket = 125
        var passagiere = 130
        var sum1 = einTicket*passagiere

        println("Einnahmen: ${einTicket*passagiere}")

        println("Gewinn: ${sum-sum1}" )




}
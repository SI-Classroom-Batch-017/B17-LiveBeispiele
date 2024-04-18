package woche03.Tag03Parameter

fun makePancakes(eier: Int, mehlInGramm: String, milchInMl: Int, wasserInMl: Int, x: Double, y: Boolean) {
    println("Schritte:")
    println("$eier Eier und $mehlInGramm g Mehl mischen...")
    println("$milchInMl ml Milch und $wasserInMl ml Wasser dazu geben und umrühren...")
    println("Fertig!")
}

// abstraker Parameter, in den ich jeglichen Int Wert eingeben kann
fun makeSmarterPancakes(anzahlPersonen: Int){
    println("Schritte:")
    println("${2*anzahlPersonen} Eier und ${150*anzahlPersonen} g Mehl mischen...")
    println("${125*anzahlPersonen} ml Milch und ${90*anzahlPersonen} ml Wasser dazu geben und umrühren...")
    println("Fertig!")

}


fun main() {
    makePancakes(2,"125",190,250,10.0,false)
    println("-----------")
    makePancakes(4,"250",300,400,19.0,true)
    println("-----------")
    makePancakes(4,"50",6099,7,9.8,true)
    println("MakeSmarterPancakes:")
    makeSmarterPancakes(1) // quasi konkrete Parameter sind Argumente
    makeSmarterPancakes(2)
    println("Für wie viele Personen willst du Pfannkuchen backen?")
    makeSmarterPancakes(readln().toInt())
    var gaeste: Int = 10
    makeSmarterPancakes(gaeste)

}
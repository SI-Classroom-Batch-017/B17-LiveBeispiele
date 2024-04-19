package woche01

fun main() {
    // plus: Konkatenation (Verkettung)
    var string: String = "Hallo" + " " + "ich bin " + 18 + " Jahre alt"
    println(string)
    // Vorsicht: das + wird als mathematisches + gewertet, wenn das 1. Element ein Integer ist
    // var x = 18 + "hi " // wirf einen Fehler

    // $
    var age: Int = 18
    // ${} sorgt dafuer, dass der Inhalt der Klammern als berechenbare Code Logik erkannt wird.
    var stringInterpoliert: String = "Hallo ich bin ${age * 3} Jahre alt"
    // ansonsten wird nur die Variable direkt hinter dem $ erkannt.
    var stringInterpoliert2: String = "Hallo ich bin $age * 3 Jahre alt"
    println(stringInterpoliert)
    println(stringInterpoliert2)

    // length: Länge, also Anzahl der Zeichen in einem String
    var stringLength: Int = stringInterpoliert.length
    var harry: String = "Harry"
    var harryLength: Int = harry.length
    println("Länge von stringInterpoliert: $stringLength")
    println("Länge des Namen Harry: $harryLength")

    var gewollteLaenge: Int = 50
    // ist meine stringLength kleiner als die gewollteLaenge? --> das lernen wir nächste Woche, wird mit if else gemacht

    // equals: gibt an, ob ein String und ein weiterer String den gleichen Inhalt haben.
    var vergleich: Boolean = "Harry".equals(harry)
    println("Sind Harry und stringInterpoliert gleich? -> $vergleich")
    var vergleichHarry: Boolean = harry.equals("Harry")
    println("Sind Harry und $harry gleich? -> $vergleichHarry")
    var compare: Boolean = "Dieser String ist King".equals("dieser string ist king",true)

    // contains: gibt an, ob ein String einen anderen String enthält
    var containsHarry: Boolean = "Harry und Ron gehen in den verbotenen Wald".contains("Harry") // true
    println("Ist 'Harry' enthalten in stringInterpoliert ($stringInterpoliert)? -> $containsHarry")

    var sentence: String = "Harry und Ron gehen in den verbotenen Wald"
    var ron: String = "Ron"
    // ignoreCase: wenn auf true gesetzt wird die Gross- und Kleinschreibung ignoriert. ist, sofern nichts angegeben wird, automatisch auf false gesetzt
    var containsRon: Boolean = sentence.contains(ron,true)
    println("Ist $ron in sentence ($sentence) enthalten? -> $containsRon")
    var ronLength = ron.length



}
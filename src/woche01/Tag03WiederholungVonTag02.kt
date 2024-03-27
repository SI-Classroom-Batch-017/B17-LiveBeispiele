package woche01

fun main() {
    // Variable anlegen
    var number: Double = 13.3

    // 1000 Zeilen Code, Funktoinsaufrufe, etc. in denen irgendwas mit number gemacht wird und wir danach nicht wissen, was in number drin steht.....
    println(number)


    // Variable aktualisieren (geht nicht, wenn es eine Konstante (mit val angelegt) ist
    number = 30.3
    println(number)

    // Strings mit $
    println("Ich will eine Variable innerhalb dieses Strings ausdrucken: $number")
    println("Ich will eine Variable nach diesem String ausdrucken: " + number + " und hier ist ein weiterer String angehängt")

    var longString: String = "Ich will eine Variable nach diesem String ausdrucken: " + number + " und hier ist ein weiterer String angehängt"
    println(longString)

    var result: Double = 10.0 * 3.0

    // Strings koennen zahlen enthalten, dann kann damit aber nicht gerechnet werden
    // var string: String = "19" * 2




}
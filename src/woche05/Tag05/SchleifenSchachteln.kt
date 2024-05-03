package vorlesungen.woche05.Tag05

fun main() {
    // TODO Schachbrett Beispiel: geschachtelte Schleife

    var abc: CharRange = 'a'..'h'

    for (char in abc){
        for (i in 1..8){
            print("$char$i")
        }
        println()

    }

}
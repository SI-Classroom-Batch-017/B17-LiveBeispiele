package woche02.Tag04TryCatch

fun main() {

//    var result: Int = 0
//
//    try {
//        result = 10 / 0
//    } catch (e: Exception){
//        println("Fehler! $e")
//        // als default -1 in result schreiben, wenn was schief gelaufen ist
//        result = -1
//        println("In Result wurde der Standardwert -1 geschrieben, da die Rechnung nicht geklappt hat.")
//    }
//
//    println(result)

    tryThrow(-1)


}


fun tryThrow(x: Int){
    try {
        if (x < 0) {
            // throw: schmeiße absichtlich die Exception und stürz ab!
            throw Exception("X ist kleiner als 0 und ich will, dass das Programm deshalb abstuerzt!!!!!!")
        }
    } catch (e: Exception){
        println("Fehler aufgefangen! Wir wollen doch nicht abstuerzen. Das war die Fehlermeldung:")
        println(e)
    }

    println("Programm trotz Fehler erfolgreich weiter gelaufen...")
}
package woche02.Tag02Bedingungen

fun main() {

    // == Operator
    // die Ergebnisse der Vergleiche sind immer booleans: ob der Vergleich stimmt oder nicht. koennen deshalb also in if else sehr gut verwendet werden

    var nr1: Int = 10
    var nr2: Int = 20

    var nr1GleichNr2: Boolean = nr1 == nr2

    if (nr1GleichNr2){
        println("Die Zahlen $nr1 und $nr2 sind gleich")
    // < Operator
    } else if (nr1 < nr2) {
        println("$nr1 ist kleiner als $nr2")
    // else if: wir kommen nur rein, wenn Bedingung davor NICHT stimmt, ansonsten wird geskippt
    // > Operator
    } else if (nr1 > nr2){
        println("$nr1 ist groesser als $nr2")
    }

    if (nr1 != nr2) {
        println("Die Zahlen $nr1 und $nr2 sind NICHT gleich.")
    }


    // Programm, das Alter prueft
    println("Bitte gib dein Alter ein....")
    var alterInput: Int = readln().toInt()

    // >=: wenn alterInput entweder 18 oder groeßer als 18 ist
    // wenn wir nur > benutzen ist es nur dann true, wenn alterInput 19+ ist
    if (alterInput >= 18){
        println("Juhu du darfst in den Club, du bist Ü18.")
    } else {
        println("Du bist noch zu jung, geh nach Hause.")
    }

    // Programm, das prüft, ob eine Zahl gerade ist oder nicht
    println("Bitte gib eine Zahl ein... wir pruefen, ob sie gerade ist oder nicht.")
    var numberInput: Int = readln().toInt()
    var isEven: Boolean = numberInput % 2 == 0
    if (isEven){ // alternative: if(numberInput % 2 == 0), weitere alternative: if (readln().toInt() % 2 ==0){
        println("Zahl $numberInput ist gerade")
    } else {
        println("Zahl $numberInput ist nicht gerade")
    }



}
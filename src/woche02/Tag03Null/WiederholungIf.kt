package woche02.Tag03Null

/*
Schreibe ein Programm, das den Benutzer nach seiner Punktzahl in einem Test fragt und ihm dann mitteilt, ob er bestanden hat oder nicht. Um zu bestehen, muss die Punktzahl mindestens 60 betragen. Wenn die Punktzahl genau 100 beträgt, gib eine spezielle Nachricht aus.

 */


fun main() {
    // 1. Benutzer nach seiner Punktzahl in einem Test fragen
    println("Wie viele Punkte hast du erreicht?")
    // 2. Benutzer gibt Punkte an
    var notenInput: Int = readln().toInt()

    // 3. um zu bestehen, muss die Punktzahl mindestens 60 betragen
    if (notenInput >= 60){
        println("Du hast mit $notenInput Punkten bestanden!")
        // 4. Wenn die Punktzahl genau 100 beträgt, gib eine spezielle Nachricht aus.
        if (notenInput == 100){
            println("Wow! Volle Punktzahl!")
        } else {
            println("Nicht volle Punktzahl, trotzdem solide.")
        }
    } else {
        println("Leider mit $notenInput Punkten nicht bestanden...")
    }
}
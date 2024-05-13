package woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src

fun main() {

    val eagle = Eagle(4.534)
    val penguin = Penguin(17.532)

    println("Kann der Adler fliegen: ${eagle.canFly}")
    println("Kann der Pinguin fliegen: ${penguin.canFly}")

    eagle.makeNoise()
    penguin.makeNoise()

    eagle.fly()
    penguin.waddle()
}
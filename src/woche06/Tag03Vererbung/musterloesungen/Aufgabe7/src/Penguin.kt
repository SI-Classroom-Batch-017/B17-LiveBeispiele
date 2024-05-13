package woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src


class Penguin(
    weight: Double
): Bird(
    weight,
    false
) {

    fun waddle() {
        println("waddle waddle")
    }
}
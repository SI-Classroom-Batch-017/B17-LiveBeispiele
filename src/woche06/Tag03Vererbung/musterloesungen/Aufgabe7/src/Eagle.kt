package woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src


class Eagle(
    weight: Double,
): Bird(
    weight,
    true
) {

    fun fly() {
        println("flap flap")
    }
}
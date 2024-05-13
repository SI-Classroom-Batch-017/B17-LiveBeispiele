package woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src


open class Bird {

    var weight: Double
    var canFly: Boolean

    constructor(weight: Double, canFly: Boolean) {
        this.weight = weight
        this.canFly = canFly
    }

    fun makeNoise() {
        println("Animal noises.")
    }
}
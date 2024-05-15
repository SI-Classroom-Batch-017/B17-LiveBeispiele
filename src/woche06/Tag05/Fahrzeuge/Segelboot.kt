package woche06.Tag05.Fahrzeuge


class Segelboot(name: String, price: Double):Wasserfahrzeug(name,40,price) {

    constructor(name: String):this(name,49.99){}

    override fun toString(): String {
        return "Segelboot \n${super.toString()}"

    }

    fun entladen(){
        println("Das Segelboot ${this.name} wird entladen")
    }

}

fun main() {
    var boot = Segelboot("Destiny", 99.99)
}
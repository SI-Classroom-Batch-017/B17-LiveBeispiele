package Classes

class Player(
    val name: String,
    val position: String,
    val speed: Int,
    val offense: Int,
    val defense: Int) {

    val total_power: Int = (speed + offense + defense) / 3
    var injured: Boolean = false

}

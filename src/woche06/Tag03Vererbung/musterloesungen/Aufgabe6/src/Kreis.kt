import kotlin.math.pow

class Kreis(color: String, val a: Int) : Form(color) {

    fun flaeche(): Double {
        return a * Math.PI.pow(2)
    }

    fun umfang(): Double {
        return a * Math.PI * 2
    }
}
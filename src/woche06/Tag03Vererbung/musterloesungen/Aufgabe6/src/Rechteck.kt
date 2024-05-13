class Rechteck(color: String, val a: Int, val b: Int) : Form(color) {

    fun flaeche(): Int {
        return a * b
    }
    fun umfang(): Int {
        return (a + b) * 2
    }
}

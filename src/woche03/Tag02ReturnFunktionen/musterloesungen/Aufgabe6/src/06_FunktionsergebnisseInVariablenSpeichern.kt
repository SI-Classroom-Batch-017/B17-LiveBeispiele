
fun flaeche():Double{
    try {
        var r = readln().toDouble()
        return 3.14 * r*r
    }catch (e: Exception){
        println("Falsche Eingabe: $e")
        return 0.0
    }
}

fun main(){
    var radius = flaeche()
    println(radius)
}

fun tenTimes():Int{
    try {
        var eingabe = readln().toInt()
        return eingabe
    } catch (e: Exception){
        println(e)
        return 0
    }
}

fun dreifacherWert():Int{
    var zahl:Int = 12
    return zahl*3
}

fun main() {
    println(tenTimes())
    println(dreifacherWert())
}

//a)
fun addition():Int{
    return 3+6
}
//b)
fun converter():Double{
    try{
        println("Gib dein Betrag ein")
        var betrag = readln().toInt()
        return betrag * 1.08
    } catch (e: Exception){
        println("keine zahl, $e")
        return 0.0
    }
}
//c)
fun greetings(){
    println("Hello User")
}
//d
fun sunny():String{
    var weather = readln()
    if (weather == "sonne"){
        return "schönes Wetter heute!"
    }
    else{
        return "Schade heute scheint keine Sonne"
    }
}
//e
fun specificNumber(): Boolean {
    var zahl = 0
    when (zahl){
        1,3,7 -> return true
        else -> return false
    }
}
//f
fun printPrint(){
    println()
}
fun main() {

}
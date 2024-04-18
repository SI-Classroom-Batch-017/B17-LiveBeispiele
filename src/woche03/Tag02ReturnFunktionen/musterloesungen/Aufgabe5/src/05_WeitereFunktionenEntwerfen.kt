
//a
fun u30():String{
    println("Gib deinen Namen ein")
    var name = readln()
    println("Gib dein Alter ein")
    try {
        var alter = readln().toInt()
        if(alter > 30){
            return "$name Nachname $alter"
        }
        else{
            println("U30")
            return "$name $alter"
        }
    }catch (e: Exception){
        println("Keine Zahl: $e")
        return "Fehler"
    }
}

//b
fun dice():Int{
    return (1..6).random()
}

fun main() {
    u30()
    println(dice())
}
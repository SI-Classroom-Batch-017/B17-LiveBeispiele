package woche03.Tag01VoidFunktionen

fun printName(){
    println("Wie ist dein Name?")
    val name: String = readln()
    println("Bitte Tageszeit angeben (morgens/mittags/abends")
    var timeOfDay: String = readln()
    if (timeOfDay == "morgens"){
        println("Guten Morgen, $name!")
    } else if (timeOfDay == "mittags"){
        println("Guten Appetit in der Mittagspause, $name!")
    } else if (timeOfDay == "abends"){
        println("Guten Abend, $name")
    }
}
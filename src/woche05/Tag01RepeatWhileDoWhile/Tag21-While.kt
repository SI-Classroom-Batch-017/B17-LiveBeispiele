package VORLESUNG.Woche05.Tag21

fun main() {

    // simpleste While Schleife
    // Laufvariable anlegen, die wir bei jedem Durchlauf erhöhen wollen
    //simpleWhile()


    // simpleste rückwärts while Schleife
    //simpleWhileCountdown()


    val fruits = mutableListOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")
    // jede frucht einzeln ausdrucken
    var i = 0
    while(i < fruits.size){ // oder: i <= fruits.size-1
        println(fruits[i])
        i++
        Thread.sleep(1000)

    }
    println("Fruits List erfolgreich durchlaufen, ohne IndexOutOfBounds Ex zu kriegen.")


    // finde die Frucht namens "Mango" in der Frucht Liste, sag mir ihren Index
    // hier implementieren
    findFruit(fruits, "Mango")
    findFruit(fruits, "Apples")
    findFruit(fruits, "Orange")

}

fun findFruit(fruits: MutableList<String>, searchedFruit: String) {
    var j = 0
    var fruitFound: Boolean = false
    while (j < fruits.size) {
        if (fruits[j] == searchedFruit) {
            println("Hurra! $searchedFruit am Index $j gefunden!")
            fruitFound = true
            break // bricht Schleife ab
            // nicht hier j++, hier kommen wir ja nur rein, wenn die Mango gefunden wurde
        } else {
            println("Frucht ${fruits[j]} an Index $j gefunden... Keine $searchedFruit. Die Suche geht weiter...")
        }
        j++
    }
    if (fruitFound == false){
        println("$searchedFruit wurde nicht gefunden. Ist also nicht in dieser Liste enthalten...")
    }
}

fun simpleWhileCountdown() {
    var i = 10
    while (i >= 0) {
        println("Countdown: $i")
        i--
        // lässt das Programm 500 ms pausieren
        Thread.sleep(500)
    }
}

fun simpleWhile() {
    var i: Int = 0
    while (i <= 10) {
        println(i)
        i++ // ist das gleiche wie i = i + 1 oder i += 1
    }
}



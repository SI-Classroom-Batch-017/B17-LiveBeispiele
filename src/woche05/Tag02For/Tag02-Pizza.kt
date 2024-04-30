package VORLESUNG.Woche05.Tag22


val PIZZAS: List<String> = listOf("Salami", "Mozarella", "Hawaii", "Tonno")

fun main(){
    // Pizza Aufgabe: 100 verschiedene Pizza sorten ausdrucken. mit repeat, while und do while lösen

    // Pizza mit repeat
    pizzaRepeat()

    // Pizza mit while
    pizzaWhile()

    // Pizza mit do while
    pizzaDoWhile()

    // Pizza mit for Range
    pizzaFor()


}

fun pizzaFor() {
    val bestellung: MutableList<String> = mutableListOf()
    for (i in 1 .. 100){
        bestellung.add(PIZZAS.random())
    }
}

fun pizzaDoWhile() {
    val bestellung: MutableList<String> = mutableListOf()
    do {
        bestellung.add(PIZZAS.random())
    } while (bestellung.size < 100)
    println(bestellung)
}

fun pizzaWhile() {
    val bestellung: MutableList<String> = mutableListOf()
    while (bestellung.size <= 100){
        bestellung.add(PIZZAS.random())
    }
    println(bestellung)
}

private fun pizzaRepeat() {
    val bestellung: MutableList<String> = mutableListOf()

    repeat(100) {
        bestellung.add("${it+1}. Pizza: ${PIZZAS.random()}")
    }

    println(bestellung)
}
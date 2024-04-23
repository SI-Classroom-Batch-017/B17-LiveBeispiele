fun main() {
    var primeNumbers: List<Int> = listOf(2,3,5,7,11,13,17)
    calculate(primeNumbers)

}

fun calculate(liste: List<Int>){
    var result: Int = liste[0] + liste[1]
    println(result)
}
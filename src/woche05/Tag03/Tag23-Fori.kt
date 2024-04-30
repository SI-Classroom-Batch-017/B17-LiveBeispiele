package vorlesungen.woche05.Tag03

fun main() {
    // 1. simple for schleife mit absteigender range an chars

    for (buchstabe in 'z' downTo 'a' ){
        print("$buchstabe,")
    }
    println()


    val eisSorten: MutableList<String> = mutableListOf("Schoko","Vanille","Erdbeere")
    for (eis in eisSorten){
        println(eis)
    }

    for (eisIndex in eisSorten.indices){
        if (eisIndex == 0){

        } else {
            eisSorten[eisIndex] += " ist eine leckere Eissorte"
        }

    }
    for (eis in eisSorten){
        println(eis)
    }



    println()

    println("-----")

    // 2. simple for i schleife bei der wir über indices gehen und drucken
    for (i in eisSorten.indices){
        println(eisSorten[i]) // eisSorten.get(i)
    }

    println("----")



    println("-----")
    val movies = mutableListOf("Harry Potter", "Der Herr der Ringe", "The Hunger Games")

    // 3. strings modifizieren: an jeden Film eine 2 hängen
    for (i in movies.indices){
        movies[i] += " 2"
        println(movies[i])
    }



    println("-----")

    val nrList = mutableListOf(22,34,808,99,6,4,7)

    println(nrList)
    // 4. jede 2. Zahl in Liste um 2 verringern
    for (i in nrList.indices step 2){
        nrList[i] -= 2
    }

    println(nrList)
    println("----")

    nrList.clear()
    nrList.addAll(mutableListOf(99,56,44,33,22,11,77))
    println("UNgerade zahlen verdoppeln")

    // 5. jede Zahl, die UNgerade ist, verdoppeln

    println(nrList)
    for(i in nrList.indices){
        if (nrList[i] % 2 != 0) {
            nrList[i]*= 2
        }
    }

    println(nrList)
    println("--- Ende Verdoppelung---")


}
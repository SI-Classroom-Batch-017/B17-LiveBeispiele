package VORLESUNG.Woche05.Tag22


fun main() {
    // Animal beispiel: for in schleife
    var animalList = mutableListOf("Tiger", "Löwe", "Bär", "Maus", "Weisser Tiger","Hase","Flamingo")

    // Syntax: for listenElementName (an dieser stelle wird name der "Laufvariable" entschieden) in listenName
    forAnimals(animalList)


    // for mit einer Map
    var clothesMap: Map<String,Double> = mutableMapOf(
        "Jacke" to 29.99,
        "Hose" to 19.99,
        "Schal" to 9.99
    )

    // sobald ich for schreibe, entscheide ich, wie meine variablen heissen sollen
    for ((name,preis) in clothesMap){
        println("Artikel: $name, Preis: $preis")
    }

    for (keyValuePair in clothesMap){
        println("${keyValuePair.key}, ${keyValuePair.value}")
    }

    forTwoAnimals(animalList)

}

fun forAnimals(animalList: MutableList<String>) {
    for (animal in animalList){
        // animal += " ist ein Tier" -> nicht moeglich
        println(animal)
    }
}

fun forTwoAnimals(animalList: MutableList<String>){
    for (i in animalList.indices){
        if (i > 1){
            break
        }
        println(animalList[i])
    }
}

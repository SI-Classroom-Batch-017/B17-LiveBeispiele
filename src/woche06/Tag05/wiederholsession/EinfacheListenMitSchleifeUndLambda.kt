package woche06.Tag05.wiederholsession

fun main(){
    // Listen
    val nameList: MutableList<String> = mutableListOf("Mario", "Alan", "Gül", "Becky")

    // Liste mit Schleife durchgehen, jeden Namen einzeln ausdrucken

        // for in schleife, look but don't touch
        for (name in nameList){
            println("Schleifendurchlauf:")
            println(name)
            // name = "Anderer Name"
            println("Schleife durchgelaufen, nächstes Element")
        }

        // for i schleife: geht ueber den index, damit duerfen wir elemente bearbeiten
        for (i in nameList.indices){
            print("${i+1} ") // i+1 = wir fangen nicht bei 0, sondern bei 1 an zu zaehlen
            nameList[i] += " Meyer"
            println(nameList[i]) // element an stelle i aus namelist schaelen
        }

    println(nameList)

    nameList.add("Yolanda")
    nameList.add(0,"Joyce")
    nameList.remove("Alan")
    nameList.addAll(listOf("Johanna","Simon","Mert"))
    println(nameList.contains("Johanna")) // true
    println(nameList.contains("Joachim")) // false


    println("---Lambdas---")


    // Liste mit Lambda durchgehen
    nameList.forEach { println(it) } // it steht immer fuer das aktuelle Listenelement

    // nur namen unter 5 buchstaben speichern, den rest rausfiltern
    var namesUnderSixChars: List<String> = nameList.filter { it.length < 6 }

    // filter Lambda selber schreiben
    var sixNamesList: MutableList<String> = mutableListOf()
    for (name in nameList){
        if (name.length < 6){
            sixNamesList.add(name)
        }
    }

    println(namesUnderSixChars)
    println(sixNamesList)


}

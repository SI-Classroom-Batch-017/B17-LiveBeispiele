package vorlesungen.Woche02

fun main(){

// Set: unsortierte Kollektion einzigartiger Elemente. D.h. Doppelungen desselben Werts werden nicht geprinted oder gezählt

    var animalList: MutableList<String> = mutableListOf("Tiger","Igel","Rabe","Bär","Tiger", "Igel")
    println("AnimalList: $animalList")

    // set anlegen
    var animalSet: Set<String> = setOf("Tiger","Igel","Rabe","Bär", "Tiger", "Igel")
    println("AnimalSet: $animalSet")


    // mutable machen
    var mutableSet: MutableSet<String> = animalSet.toMutableSet()


    // mehr duplikate hinzufügen
    animalList.addAll(listOf("Tiger","Igel","Rabe","Bär","Tiger", "Igel", "Löwe", "Flamingo"))
    mutableSet.addAll(listOf("Tiger","Igel","Rabe","Bär","Tiger", "Igel", "Löwe", "Flamingo"))


    // nur nicht bereits vorhandene Elemente werden aufgenommen:
    println(animalList)
    println(mutableSet)




    // set zur mutable liste konvertieren



    // liste mit duplikaten zu set konvertieren: animalList zum Set machen




    // size: enthält bei set die duplikate nicht



    // Sinn von Sets
    // Daten aus verschiedenen Quellen, in denen Doppelungen vorkommen
    val source1 = listOf("A","B","C","D")
    val source2 = listOf("E","F","G","D")
    val source3 = listOf("B","H","I","A")
    val source4 = listOf("J","K","L","I")


    // Eine leere Menge (Set) erstellen, um eindeutige Datensätze zu speichern
    val uniqueData: MutableSet<String> = mutableSetOf()

    // liste an sources
    val srcList: List<List<String>> = listOf(source1,source2,source3,source4)

    val mutableSrcList: MutableList<List<String>> = srcList.toMutableList()
    mutableSrcList


    // nicht möglich: Liste an Listen mit addAll oder toSet zu nutzen, ist zu tief geschachtelt...
    //uniqueData.addAll(srcList)
     // val uniqueFromList: Set<String> = srcList.toSet()

    // Daten aus verschiedenen Quellen zusammenführen, Doppelungen werden nicht hinzugefügt
    uniqueData.addAll(source1)
    uniqueData.addAll(source2)
    uniqueData.addAll(source3)
    uniqueData.addAll(source4)


    // Eindeutige Datensätze anzeigen
    println(uniqueData)



    // auf Element im Set zugreifen, Sets haben keinen Index, deshalb geht [] nicht!
    //var firstAnimal = animalSet[0]
    var firstAnimal: String = animalSet.elementAt(0)


    // set reversen: gibt eine Kopie als Liste zurück
    var reverseSet: MutableList<String> = animalSet.reversed().toMutableList()



}

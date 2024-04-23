fun main() {
    var bondActors: List<String> = listOf(
        "Sean Connery",
        "George Lazenby",
        "Roger Moore",
        "Timothy Dalton",
        "Pierce Brosnan",
        "Daniel Craig"
    )
}

fun lastActor(liste: List<String>){
    var lastActor: String = liste[liste.size-1]
    println(lastActor)
}

package woche06.Tag03Vererbung.Animals


open class Animal(var name: String, var canFly: Boolean, var canSwim: Boolean) {

    init {
        println("TIER namens $name initialisiert!")
    }

    fun tierMethode(){
        println("Alle Tiere, die von Animal erben, koennen diese Methode aufrufen... Sie kommt aus Animal, der obersten Mutter. $name hat diese Methode erfolgreich aufgerufen.")
    }

    // OPEN: darf overridden (= überschrieben) werden durch die Kinder
    open fun essen(){
        println("Das TIER $name frisst... yummy.")
    }

    open fun fortBewegung(){
        println("Die Bewegung des TIERS $name am Boden beginnt...")
    }

    override fun toString(): String {
        // super.toString gibt uns die Adresse im Speicher
        return "Name: $name"
        // Adresse: ${super.toString()}
        // mit super schluesselwort rufe ich methode aus der mutter auf
    }
}

fun main() {
    var tiger: Animal = Animal("Tiger",false,true)
    tiger.essen()
    tiger.fortBewegung()
//
    var vogel: Vogel = Vogel("Birdie")
//
    vogel.essen()
    vogel.fortBewegung()

    println(vogel)

    println(tiger)


    var ara: Papagei = Papagei("Polly",true)
    ara.essen()
    ara.fortBewegung()
    ara.tierMethode()
    tiger.tierMethode()
    vogel.tierMethode()

    // alle Klassen, die von Animal erben, koennen in eine Liste an Animals geschrieben werden
    var animalList: List<Animal> = listOf(tiger,ara,vogel)
    println(animalList)


    // is Schlüsselwort: gibt true zurueck, wenn it der Klasse Vogel oder ihren Kindern angehört
    // Vogel und Papagei erben von Animal
    var vogelList: List<Animal> = animalList.filter { it is Vogel }
    println(vogelList)


}
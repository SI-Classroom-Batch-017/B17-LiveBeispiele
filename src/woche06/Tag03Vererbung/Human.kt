package vorlesungen.woche06.Tag03Vererbung

// default Parameter braun: muss beim Instanziieren nicht angegeben werden, ist dann automatisch braun. kann aber
class Human(var name: String, var age: Int, var eyeColor: String = "braun"){

    // init Block wird IMMER SOFORT beim Instanziieren aufgerufen
    init {
        println("Mit 1. Konstruktor: Instanz Human namens ${this.name} initialisiert")
        // Logik im init Block: Information über Volljährigkeit ausdrucken
        if (age >= 18){
            println("Human $name ist volljährig")
        } else {
            println("Human $name ist NICHT volljährig.")
        }
    }

    // sekundaerer Konstruktor zum Babys erzeugen
    constructor(name: String, gender: String, eyeColor: String = "blau") : this(name,0){
        // init Block vom 2. Konstruktor
        println("Mit 2. Konstruktor: Baby $name, Geschlecht $gender erstellt....")
    }


    override fun toString(): String {
        return """
            Human $name 
            Alter $age 
            Augenfarbe $eyeColor
            Speicheradresse: ${super.toString()}
        """.trimIndent()
    }

    fun changeName(name: String){
        this.name = name
    }


}

fun main() {
    var human1: Human = Human("Marcus",10,"blau")
    var human2: Human = Human("Simon",30,"grün")
    var human3: Human = Human("Pablo",20)

    println("----")
    // mit Hilfe von toString: das ganze Objekt ausdrucken, statt mühselig einzelne printlns zu schreiben
    println(human1)
    println("----")
    println(human2)
    println("----")
    println(human3)

    var baby1: Human = Human("Maya","weiblich")
    var baby2: Human = Human("Max","männlich","grün")
    println(baby2)
    baby2.changeName("Moritz")
    println(baby2)
    baby2.name = "Miriam"
    println(baby2)
}

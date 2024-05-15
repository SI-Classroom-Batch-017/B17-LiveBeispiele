package woche06.Tag05.wiederholsession


// Klasse

class Person(var name: String, var alter: Int, lieblingsWort: String = "Strand"){

    // Konstruktovariablen ohne val/var davor sind nur im init Block verfuegbar, danach werden sie vergessen
    init {
        // println("Person $name mit Alter $alter und LiebingsWort $lieblingsWort initialisiert!")
    }

    fun greeting(){
        println("Hi, ich bin $name und $alter Jahre alt!")
    }

    override fun toString(): String {
        return "$name, $alter"
    }
}

// Klasse in Klasse verschachteln
class Team(var teamName: String){
    var personenListe: MutableList<Person> = mutableListOf()


    fun printPersonen() {
        for (person in this.personenListe){
            println(person) // nur Speicheradresse
            println("${person.name}, ${person.alter}")
            person.greeting()
            println("-------")
        }
    }

    fun getPersonListAsString(): String {
        var personString: String = ""
        for (person in personenListe){
            personString += "${person.name}, "
        }
        return personString
    }

    override fun toString(): String {
        return """
            Team $teamName
            Personen:
            ${getPersonListAsString()}
            """.trimIndent()
    }
}

fun main() {


    var person1: Person = Person("Mario Meyer",20)
    var person2: Person = Person("Simon Sander",20)
    var person3: Person = Person("Tom Thomas",20)
    var person4: Person = Person("Moritz Meckler",20)
    var person5: Person = Person("Anna Arlund",20)

    println(person1) // Speicheradresse kommt raus, es sei denn, ich schreibe eine eigene toString() Methode
    println(person1.name)


    var team: Team = Team("Dream Team")

    team.personenListe.addAll(listOf(person4,person5,person3,person2,person1))

    team.printPersonen()

    println("println() team:") // haben jetzt ein schoenes toString geschrieben, was Team Name und Mitlglieder ausgibt, vorher kam lediglich die Speicheradresse raus
    println(team)

    println("println() team.personenListe:")
    println(team.personenListe) // hier muessten wir stattdessen unsere printPersonen() funktion aufrufen. oder die toString() methode in Person overriden



    // Liste an Klassen durchgehen

    var personList: MutableList<Person> = mutableListOf(person1,person2,person3,person4,person5)
    println("arbeiten mit PersonList in der main:")
    // mit Schleife
    for (person in personList){
        println(person) // das hier gibt nicht nur den speicher aus, weil wir toString() in person geschrieben
    }

    // mit Lambda
    // jeder Person einen zufälligen Nachnamen geben
    val lastNameList: List<String> = listOf("Meyer","Schmidt","Müller","Sanddorn","Olafsson","Smith","Maloney")

    // map bearbeitet direkt die liste, erstellt keine kopie!
    personList.map { it.name = it.name + "-" + lastNameList.random() } // it.name += "-${lastNameList.random()}"
    println(personList)

}
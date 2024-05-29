package woche08.VerschKlassen

    data class Human(val name: String, val birthday: String)

    class Bla(var name: String)

    fun main() {
        val human1 = Human("Betty","01.01.2000")
        // toString wird bei data classes in schöner, lesbarer mitgeliefert
        println(human1) // Human(name=Betty, birthday=01.01.2000)

        val bla1 = Bla("hallo")
        println(bla1)

    }

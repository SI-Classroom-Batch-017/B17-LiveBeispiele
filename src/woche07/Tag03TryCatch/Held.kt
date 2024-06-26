package woche07.Tag03TryCatch

import woche07.Tag02KlasseMitAttackeBeutelProzent.Helden.Pokemon

class Held(var name: String, var hp: Double) {
    var attackFaktor: Double = 1.0


    fun attacke1(gegner: Pokemon) {
        gegner.hp -= 45 * attackFaktor
        print("Feuerball wurde ausgeführt")
    }

    fun attacke2(gegner: Pokemon) {
        gegner.hp -= 50 * attackFaktor
        println("Elektroschock wurde ausgeführt")
    }
    //Beste Lösung
    fun chooseAction(gegner: Pokemon) {
        println("Welche Aktion soll ausgeführt werden")
        println("[1] -> Feuerball")
        println("[2] -> Elektroschock")
        val choice = readln()
        when(choice) {
            "1" -> attacke1(gegner)
            "2" -> attacke2(gegner)
            else -> {
                println("bitte Nummer 1 oder 2 eingeben")
                chooseAction(gegner)
            }
        }
    }

    //Dieses  Beispiel zeigt, dass es abstürzt, wenn ich einen Buchstaben eingebe
    fun chooseActionMitInt(gegner: Pokemon) {
        println("Welche Aktion soll ausgeführt werden")
        println("[1] -> Feuerball")
        println("[2] -> Elektroschock")
        val choice = readln().toInt()
        when(choice) {
            1 -> attacke1(gegner)
            2 -> attacke2(gegner)
            else -> {
                println("bitte Nummer 1 oder 2 eingeben")
                chooseAction(gegner)
            }
        }
    }
    // Dies kann dann, wenn man irgendwelche Buchstaben/Sonderzeichen eingibt, mit try catch behandelt werden
    fun chooseActionMitIntUndTryCatch(gegner: Pokemon) {
        println("Welche Aktion soll ausgeführt werden")
        println("[1] -> Feuerball")
        println("[2] -> Elektroschock")
        try {
            val choice = readln().toInt()
            when (choice) {
                1 -> attacke1(gegner)
                2 -> attacke2(gegner)
                else -> {
                    println("bitte Nummer 1 oder 2 eingeben")
                    chooseAction(gegner)
                }
            }
        } catch (e: Exception){
            println("Bitte eine gültige Nummer eingeben und nicht Buchstaben")
            chooseAction(gegner)
        }

    }

}


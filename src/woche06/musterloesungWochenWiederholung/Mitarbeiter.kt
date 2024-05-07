package woche06.musterloesungWochenWiederholung

import kotlin.random.Random
class Mitarbeiter(var name: String, var alter: Int) {

    init {
        alter = (16..71).random()
    }
}


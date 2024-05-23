package woche07.Tag02KlasseMitAttackeBeutelProzent

import woche07.Tag02KlasseMitAttackeBeutelProzent.Helden.Pokemon
import woche07.Tag03TryCatch.Held

class Beutel {


    //TODO unsere unterschiedlichen Tränke darstellen
    // als map?
    // als liste?
    // vllt einfach die anzahl jedes tranks speichern?

    var anzahlHeiltraenke: Int = 4
    var anzahlBooster: Int = 2


    //TODO Funktion pro Trank, um ihn zu benutzen

    fun useHeiltrank(pokemon: Pokemon) {
        // printlns, die bescheid sagen, was passiert
        // hp um 50% der gesamthp heilen
        if (anzahlHeiltraenke > 0) {
            pokemon.hp += (pokemon.ursprungsHP / 2)
            // anzahl der heiltraenke im beutel um 1 verringern
            anzahlHeiltraenke--
        } // else bescheid sagen, dass traenke leer sind
    }

    // alle angriffe sind ab jetzt 10% staerker
    fun useBooster(held: Held) {
        // printlns, die bescheid sagen, was passiert
        if (anzahlBooster > 0) {
            held.attackFaktor *= 1.1
            // anzahl der heiltraenke im beutel um 1 verringern
            anzahlBooster--
        } // else bescheid sagen, dass booster leer sind
    }

}


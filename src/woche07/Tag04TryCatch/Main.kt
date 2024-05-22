package woche07.Tag04TryCatch

import woche07.Tag02KlasseMitAttackeBeutelProzent.Held
import woche07.Tag02KlasseMitAttackeBeutelProzent.Helden.Pokemon

fun main() {

    val pokemon = Pokemon("Gegner", "Wasser")
    val held = Held("Held", 100.0)

    held.chooseAction(pokemon)

}
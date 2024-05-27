package woche07.Tag03TryCatch

import woche07.Tag02KlasseMitAttackeBeutelProzent.Helden.Pokemon

fun main() {

    val pokemon = Pokemon("Gegner", "Wasser")
    val held = Held("Held", 100.0)

    held.chooseAction(pokemon)
}
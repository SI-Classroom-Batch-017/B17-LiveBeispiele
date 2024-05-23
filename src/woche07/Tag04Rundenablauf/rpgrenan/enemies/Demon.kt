package woche07.Tag04Rundenablauf.rpgrenan.enemies

import woche07.Tag04Rundenablauf.rpgrenan.heroes.Hero
import kotlin.random.Random

class Demon(name: String, private val initialHp: Double) : Enemy(name, initialHp) {

    private val attack1 = 23
    private val attack2 = 30
    private val attack3 = 40
    private val attack4 = 50
    private val attack5 = 60

    fun hpIsMoreThanHalf(): Boolean = hp / initialHp >= 0.5

    private fun demonAttack1(held: Hero) {
        held.hp -= attack1
        println(
            "               >>> ${this.name} greift mit Energy Strike ${held.name} an! <<<\n" +
                    "${held.name} hat $attack1 Lebenspunkte schaden erlitten und hat noch ${held.hp} Lebenspunkte übrig.\n"
        )
    }

    private fun demonAttack2(held: Hero) {
        held.hp -= attack2
        println(
            "               >>> ${this.name} greift mit Energy Beam ${held.name} an! <<<\n" +
                    "${held.name} hat $attack1 Lebenspunkte schaden erlitten und hat noch ${held.hp} Lebenspunkte übrig.\n"
        )
    }

    private fun demonAttack3(held: Hero) {
        held.hp -= attack3
        println(
            "               >>> ${this.name} greift mit Melee ${held.name} an! <<<\n" +
                    "${held.name} hat $attack1 Lebenspunkte schaden erlitten und hat noch ${held.hp} Lebenspunkte übrig.\n"
        )
    }

    private fun demonAttack4(held: Hero) {
        held.hp -= attack4
        println(
            "               >>> ${this.name} greift mit Fire Stone ${held.name} an! <<<\n" +
                    "${held.name} hat $attack1 Lebenspunkte schaden erlitten und hat noch ${held.hp} Lebenspunkte übrig.\n"
        )
    }

    private fun demonAttack5(helden: List<Hero>) {
        helden.forEach {
            it.hp -= attack5
            println(
                "               >>> ${this.name} greift mit Great Fire Ball ${it.name} an! <<<\n" +
                        "${it.name} hat $attack5 Lebenspunkte schaden erlitten und hat noch ${it.hp} Lebenspunkte übrig.\n"
            )
        }

    }

    private fun demonAttack6(held: Hero) {

        //TODO
        //Verflucht logik
    }

    fun demonAttackenRandom(helden: List<Hero>) {
        val idx = Random.nextInt(6)
        println("IDX: $idx")
        when (idx) {

            0 -> demonAttack1(helden.random())

            1 -> demonAttack2(helden.random())

            2 -> demonAttack3(helden.random())

            3 -> demonAttack4(helden.random())

            4 -> demonAttack5(helden)

            //5 -> demonAttack6(helden.random())
        }
    }
}
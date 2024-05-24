package woche07.Tag04und05Rundenablauf.rpgrenan.enemies

import woche07.Tag04und05Rundenablauf.rpgrenan.heroes.Hero
import kotlin.random.Random

class Demon(name: String, private val initialHp: Double) : Enemy(name, initialHp) {

    private val attack1 = 23
    private val attack2 = 30
    private val attack3 = 40
    private val attack4 = 50

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

    private fun demonAttack4(helden: List<Hero>) {
        helden.forEach {
            it.hp -= attack4

            println(
                "               >>> ${this.name} greift mit Great Fire Ball ${it.name} an! <<<\n" +
                        "${it.name} hat $attack4 Lebenspunkte schaden erlitten und hat noch ${it.hp} Lebenspunkte übrig.\n"
            )
        }

    }

    private fun demonAttack5(held: Hero) {
        if (!held.isPoison && held.hp > (held.initialHP * 0.20)) {
            held.hp -= (held.hp * 0.10)
            held.isPoison = true
            println(
                "               >>> ${this.name} greift mit Poison ${held.name} an! <<<\n" +
                        "${held.name} hat 10% weniger Lebenspunkte  und hat noch ${held.hp} Lebenspunkte übrig.\n"
            )
        } else {
            println("Lebenspunkte weniger als 20%, darf nicht vergiftet werden")
        }
    }

    fun summonFireElemental(): FireElemental {
        val fireElemental = FireElemental("FireElemental", 100.0)
        return fireElemental
    }

    fun demonAttackenRandom(helden: List<Hero>) {
        val idx = Random.nextInt(5)
        println("IDX: $idx")
        when (idx) {

            0 -> demonAttack1(helden.random())

            1 -> demonAttack2(helden.random())

            2 -> demonAttack3(helden.random())

            3 -> demonAttack4(helden)

            4 -> demonAttack5(helden.random())

        }
    }
}
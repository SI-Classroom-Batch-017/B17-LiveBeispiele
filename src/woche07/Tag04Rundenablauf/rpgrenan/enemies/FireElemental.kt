package woche07.Tag04Rundenablauf.rpgrenan.enemies

import woche07.Tag04Rundenablauf.rpgrenan.heroes.Hero
import kotlin.random.Random

class FireElemental(name: String, private val initialHp: Double): Enemy(name, initialHp) {

    private val attack1 = 12
    private val attack2 = 13
    private val attack3 = 10

    fun hpIsMoreThanHalf() : Boolean = hp / initialHp >= 0.5

    private fun fireElementalAttack1(held: Hero){
        held.hp -= attack1
        println(
            "               >>> ${this.name} greift mit Fire-berserk ${held.name} an! <<<\n" +
                    "${held.name} hat $attack1 Lebenspunkte schaden erlitten und hat noch ${held.hp} Lebenspunkte übrig.\n"
        )
    }

    private fun fireElementalAttack2(held: Hero){
        held.hp -= attack2
        println(
            "               >>> ${this.name} greift mit Melee ${held.name} an! <<<\n" +
                    "${held.name} hat $attack1 Lebenspunkte schaden erlitten und hat noch ${held.hp} Lebenspunkte übrig.\n"
        )
    }

    private fun fireElementalAttack3(helden: List<Hero>){
        helden.forEach { it.hp -= attack3
            println(
                "                 >>> ${this.name} greift mit Fire Bomb an! <<<\n" +
                        "        ${it.name}  verlieren $attack3 Lebenspunkte\n" +
                        "er hat ${it.hp} Lebenspunkte"
            )
        }

    }

    fun fireElementalAttackenRandom(helden: List<Hero>) {
        val idx = Random.nextInt(3)
        println("IDX: $idx")
        when (idx) {

            0 -> fireElementalAttack1(helden.random())

            1 -> fireElementalAttack2(helden.random())

            2 -> fireElementalAttack3(helden)

        }
    }
}
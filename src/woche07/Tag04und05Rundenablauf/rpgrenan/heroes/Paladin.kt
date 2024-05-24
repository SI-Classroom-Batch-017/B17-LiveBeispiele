package woche07.Tag04und05Rundenablauf.rpgrenan.heroes

import woche07.Tag04und05Rundenablauf.rpgrenan.Bag
import woche07.Tag04und05Rundenablauf.rpgrenan.enemies.Enemy

class Paladin(name: String, hp: Double) : Hero(name, hp) {

    private val attack1 = 20
    private val attack2 = 30
    private val attack3 = 40
    private val attack4 = 50


    private fun paladinAttack1(enemy: Enemy) {
        enemy.hp -= attack1 * booster
        println(
            "               >>> ${this.name} greift mit Divine Caldera ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack1 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    private fun paladinAttack2(enemy: Enemy) {
        enemy.hp -= attack2 * booster
        println(
            "               >>> ${this.name} greift mit Divine Grenade ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack2 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    private fun paladinAttack3(enemy: Enemy) {
        enemy.hp -= attack3 * booster
        println(
            "               >>> ${this.name} greift mit Divine Missile ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack3 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    private fun paladinAttack4(enemy: Enemy) {
        enemy.hp -= attack4 * booster
        println(
            "               >>> ${this.name} greift mit Ethereal Spear ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack4 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }


    override fun getBattleMenu(enemy: Enemy, bag: Bag) {
        println("Der Paladin ist dran. Welcher Angriff soll ausgeführt werden?")
        println("1 = Divine Caldera || 2 = Divine Grenade || 3 = Divine Missile || 4 = Ethereal Spear || 5 = Bag")
        val input = readln()
        when (input) {
            "1" -> {
                paladinAttack1(enemy)
            }

            "2" -> {
                paladinAttack2(enemy)
            }

            "3" -> {
                paladinAttack3(enemy)
            }

            "4" -> {
                paladinAttack4(enemy)
            }

            "5" -> {
                bag.useBag(this)
            }

            else -> {
                println("Du hast falsch eingegeben , {$input} ist nicht gültig, bitte eine gültige Nummer eingeben")
                getBattleMenu(enemy, bag)
            }
        }
    }
}
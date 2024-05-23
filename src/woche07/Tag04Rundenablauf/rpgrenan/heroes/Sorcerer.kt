package woche07.Tag04Rundenablauf.rpgrenan.heroes

import woche07.Tag04Rundenablauf.rpgrenan.Bag
import woche07.Tag04Rundenablauf.rpgrenan.enemies.Enemy

class Sorcerer(name: String, hp: Double) : Hero(name, hp) {

    private val attack1 = 20
    private val attack2 = 30
    private val attack3 = 40
    private val attack4 = 50

    private fun sorcererAttack1(enemy: Enemy) {
        enemy.hp -= attack1
        println(
            "               >>> ${this.name} greift mit Flamme Strike ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack1 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    private fun sorcererAttack2(enemy: Enemy) {
        enemy.hp -= attack2
        println(
            "               >>> ${this.name} greift Energy Wave ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack2 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    private fun sorcererAttack3(enemy: Enemy) {
        enemy.hp -= attack3
        println(
            "               >>> ${this.name} greift mit Fire Wave ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack3 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    private fun sorcererAttack4(enemy: Enemy) {
        enemy.hp -= attack4
        println(
            "               >>> ${this.name} greift Greate Death Beam ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack4 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n" //+
        )
    }

    override fun getBattleMenu(enemy: Enemy, bag: Bag) {
        println("Der Sorcerer ist dran. Welcher Angriff soll ausgeführt werden?")
        println("1 = Flamme Strike || 2 = Energy Wave || 3 = Fire Wave || 4 = Greate Death Beam || 5 = Bag")
        val input = readln()
        when (input) {
            "1" -> {
                sorcererAttack1(enemy)
            }

            "2" -> {
                sorcererAttack2(enemy)
            }

            "3" -> {
                sorcererAttack3(enemy)
            }

            "4" -> {
                sorcererAttack4(enemy)
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
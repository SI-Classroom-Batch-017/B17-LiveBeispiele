package woche07.Tag04und05Rundenablauf.rpgrenan.heroes

import woche07.Tag04und05Rundenablauf.rpgrenan.Bag
import woche07.Tag04und05Rundenablauf.rpgrenan.enemies.Enemy

class Knight(name: String, hp: Double) : Hero(name, hp) {

    private val attack1 = 20
    private val attack2 = 30
    private val attack3 = 40
    private val attack4 = 50

    private fun knightAttack1(enemy: Enemy){
        enemy.hp -= attack1 * booster
        println(
            "               >>> ${this.name} greift mit Hammer ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack1 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n"
        )
    }
    private fun knightAttack2(enemy: Enemy){
        enemy.hp -= attack2 * booster
        println(
            "               >>> ${this.name} greift mit Axe ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack2 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n"
        )
    }
    private fun knightAttack3(enemy: Enemy){
        enemy.hp -= attack3 * booster
        println(
            "               >>> ${this.name} greift mit Schwert ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack3 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n"
        )
    }
    private fun knightAttack4(enemy: Enemy){
        enemy.hp -= attack4 * booster
        println(
            "               >>> ${this.name} greift mit Exori ${enemy.name} an! <<<\n" +
                    "${enemy.name} hat ${attack4 * booster} Lebenspunkte schaden erlitten und hat noch ${enemy.hp} Lebenspunkte übrig.\n"
        )
    }


    override fun getBattleMenu(enemy: Enemy, bag: Bag) {
        println("Der Knight ist dran. Welcher Angriff soll ausgeführt werden?")
        println("1 = HammerAttack || 2 = AxeAttack || 3 = SchwertAttack || 4 = Exori || 5 = Bag")
        val input = readln()
            when (input) {
                "1" -> {
                    knightAttack1(enemy)
                }

                "2" -> {
                    knightAttack2(enemy)
                }

                "3" -> {
                    knightAttack3(enemy)
                }

                "4" -> {
                    knightAttack4(enemy)
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


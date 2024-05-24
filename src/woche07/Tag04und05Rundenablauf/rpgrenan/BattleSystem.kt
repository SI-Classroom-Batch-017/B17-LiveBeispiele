package woche07.Tag04und05Rundenablauf.rpgrenan

import woche07.Tag04und05Rundenablauf.rpgrenan.enemies.Demon
import woche07.Tag04und05Rundenablauf.rpgrenan.enemies.Enemy
import woche07.Tag04und05Rundenablauf.rpgrenan.enemies.FireElemental
import woche07.Tag04und05Rundenablauf.rpgrenan.heroes.Knight
import woche07.Tag04und05Rundenablauf.rpgrenan.heroes.Paladin
import woche07.Tag04und05Rundenablauf.rpgrenan.heroes.Sorcerer


class BattleSystem() {
    private val knight = Knight("Knight", 100.0)
    private val sorcerer = Sorcerer("Sorcerer", 75.0)
    private val paladin = Paladin("Paladin", 85.0)
    private val demon = Demon("Demon", 200.0)

    private var herosList = listOf(knight, sorcerer, paladin)
    private val enemiesList = mutableListOf<Enemy>(demon)

    private var fireElemental: FireElemental? = null
    private val bag = Bag()



    fun playRound() {
        var rundeAnzahl = 1

        while (!endGameCheck()) {
            println("-----Kamprunde $rundeAnzahl------- \n")

            if (demon.hpIsMoreThanHalf()) {
                herosList.forEach { it.getBattleMenu(demon, bag) }
                removeDeadEnemy()
                println("Demon hat ${demon.hp} Lebenspunkte übrig")
                demon.demonAttackenRandom(herosList)
                removeDeadHero()
            } else if (!demon.hpIsMoreThanHalf()) {
                if (fireElemental == null) {
                    fireElemental = demon.summonFireElemental()
                }
                if (enemiesList.filterIsInstance<FireElemental>().isEmpty()) {
                    println("Fire Elemental wurde beschworen!")
                    enemiesList.add(fireElemental!!)
                }

                herosList.forEach{ it.getBattleMenu(enemiesList.random(), bag) }
                removeDeadEnemy()

                if (demon.hp > 0.0) {
                    demon.demonAttackenRandom(herosList)
                    removeDeadHero()
                }

                if (fireElemental!!.hp > 0.0) {
                    fireElemental!!.fireElementalAttackenRandom(herosList)
                    removeDeadHero()
                }
                println("Demon hat ${demon.hp} HP übrig")
                println("Fire Elemental hat ${fireElemental!!.hp} HP übrig")
            }
            rundeAnzahl++
            bag.resetUseBagRound()
        }
        println("Kampf beendet!")

    }


    fun removeDeadHero() {
        val liveHero = herosList.filter {
            if (it.hp > 0.0) {
                true
            } else {
                println("Held: ${it.name} ist besiegt und fällt raus")
                false
            }
        }
        herosList = liveHero
    }

    fun removeDeadEnemy() {
        val deadEnemies = enemiesList.filter { it.hp <= 0.0 }
        deadEnemies.forEach {
            enemiesList.remove(it)
            println("Gegner : ${it.name} ist besiegt und fällt raus ")
        }
    }


    fun endGameCheck(): Boolean {
        if (herosList.isEmpty() || enemiesList.isEmpty()) {
            return true
        }

        if (herosList.all { it.hp <= 0.0 } || enemiesList.all { it.hp <= 0.0 }) {
            return true
        }

        return false

    }
}

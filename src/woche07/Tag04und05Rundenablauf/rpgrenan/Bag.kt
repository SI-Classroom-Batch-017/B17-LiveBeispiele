package woche07.Tag04und05Rundenablauf.rpgrenan

import woche07.Tag04und05Rundenablauf.rpgrenan.heroes.Hero

class Bag {
    var healingPotion = 3
    var vitamin = 1
    private var usedThisRound = false

    private fun useHealingPotion(hero: Hero){
        if (usedThisRound) {
            println("Bag wurde schon in dieser Runde benutzt")
            return
        }

        if (healingPotion > 0) {
            println("{${hero.name}} hat ${hero.hp} Lebenspunkte und wird mit Trank geheilt")
            hero.hp += (hero.initialHP /2)
            println("${hero.name} hat jetzt ${hero.hp} Lebenspunkte")
            healingPotion--
            usedThisRound = true
        } else {
            println("Es sind keine Heiltränke mehr übrig")
        }
    }

    private fun useVitamin(hero: Hero){
        if (usedThisRound) {
            println("Bag wurde schon in dieser Runde benutzt")
            return
        }

        if (vitamin > 0) {
            println("{${hero.name}} seine Angriffe sind jetzt alle 10% stärke")
            hero.booster *= 1.1
            vitamin--
            usedThisRound = true
        } else {
            println("Es sind keine Vitamin mehr übrig")
        }
    }
    fun useBag(hero: Hero){
        println("Wähl bitte einen Gegenstand aus der Tasche aus")
        println("1 = Heiltrank || 2 = Vitamine")
        println("Es gibt $healingPotion Healing Potion und $vitamin Vitamin")
        if (healingPotion == 0 && vitamin ==0) {
            println("Es gibt keine Items mehr in der Tasche")
        } else {
            val input = readln()
            when(input){
                "1" -> useHealingPotion(hero)
                "2" -> useVitamin(hero)
            }
        }
    }

    fun resetUseBagRound(){
        usedThisRound = false
    }
}
package woche07.Tag04und05Rundenablauf.rpgrenan.heroes

import woche07.Tag04und05Rundenablauf.rpgrenan.Bag
import woche07.Tag04und05Rundenablauf.rpgrenan.enemies.Enemy

open class Hero(val name: String, var initialHP: Double) {

    var hp: Double = initialHP

    open var booster: Double = 1.0

    open var isPoison = false

    open fun getBattleMenu(enemy: Enemy, bag: Bag) {
    }
}
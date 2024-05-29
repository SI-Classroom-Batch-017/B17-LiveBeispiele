package woche08.VerschKlassen

// Abstrakte Klasse Character
    abstract class Character(val name: String, var hp: Double, var level: Int) {
        // 3 versch Attacken: MÜSSEN in Kindern overridden
        abstract fun attack(character: Character)
        abstract fun attack()
        abstract fun attack(characterList: List<Character>)

        // normale oder open funs dürfen overriden werden, müssen es aber nicht
        open fun printFunction(){
            println("Diese Funktion darf überschrieben werden, weil sie open ist")
        }

        fun bla(){
            println("kann nicht overriden werden und muss es auch nicht")
        }

    }

    // Hero Klasse erbt von Character
    class Hero(name: String, hp: Double, level: Int) : Character(name, hp, level) {
        override fun attack(character: Character) {
            // Angriffslogik
        }

        override fun attack() {
            // Angriffslogik
        }

        override fun attack(characterList: List<Character>) {
            // Angriffslogik
        }

        override fun printFunction(){

        }

    }

    // Enemy Klasse erbt von Character
    class Enemy(name: String, hp: Double, level: Int) : Character(name, hp, level) {
        override fun attack(character: Character) {
            // Angriffslogik
        }

        override fun attack() {
            // Angriffslogik
        }

        override fun attack(characterList: List<Character>) {
            // Angriffslogik
        }

    }

fun main() {
    var hero = Hero("x",10.0,3)
    // kann Funktionen aus der abstrakten Mutter aufrufen
    hero.printFunction()
}

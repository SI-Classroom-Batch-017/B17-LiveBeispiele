package woche07.Tag02KlasseMitAttackeBeutelProzent.Helden

import woche07.Tag02KlasseMitAttackeBeutelProzent.Beutel
import woche07.Tag02KlasseMitAttackeBeutelProzent.roundDouble


// Primärer Konstruktor: direkt beim Erstellen der Klasse
class Pokemon(var name: String, var type: String, var level: Int = 1) {


    var hp: Double // Health Points = Lebenspunkte
    var ursprungsHP: Double
    var ep: Double // Experience Points
    var ap: Double // Attack Points
    var isDead: Boolean = false
    // var istVerflucht: Boolean = false

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktoren, immer beim Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = 9.0
        this.ep = 0.0
        this.ap = level * 3.0
        this.ursprungsHP = hp

//        println("----Primärer Konstruktor Call im init-Block----")
//        println("Pokemon $name wurde auf Level $level initialisiert.")
//        //Thread.sleep(500)
//        println("$name hat $ap AP und folgende Attacken:")
//        // Thread.sleep(500)
//        println("Tackle (${level + ap} Schaden)")
//        // Thread.sleep(500)
//        println("--Primäre Konstruktion beendet--")

    }


    // sekundärer Konstruktor: Pokemon ist automatisch vom Typ Normal
    constructor(name: String) : this(name, "Normal") {
//        println("---Sekundärer Konstruktor Call---")
//        // Thread.sleep(500)
//        println("Ein Pokemon namens $name mit Default den Typ 'Normal' wurde angelegt.")
//        // Thread.sleep(500)
//        println("---Sekundäre Konstruktion beendet---")
    }

    // erste Funktion: Tackle

    fun tackle(gegner: Pokemon){
        println("$name verwendet Tackle mit einer Angriffskraft von $ap AP!")
        println("${gegner.name} hat vorher ${gegner.hp} HP...")
        println("$name's Angriff triggt ${gegner.name}!")
        gegner.hp -= this.ap // x.xxxxxx --> runden 33.39475657483736
        gegner.hp = roundDouble(gegner.hp) // 33.39
        println("${gegner.name} verliert $ap HP und hat noch ${gegner.hp} HP!")
        // Abfangen, dass Gegner direkt stirbt:
        if (gegner.hp <= 0){
            println("${gegner.name} ist besiegt!")
            gegner.isDead = true
            // kommen hier aber nicht an Gegner Liste ran
        }
    }




    override fun toString(): String{
        return """
            Pokemon: $name
            HP: $hp
        """.trimIndent()
    }

    //TODO useBeutel Pseudocode Fahrplan
    fun useBeutel(beutel: Beutel){

        // inhalt des beutels drucken, naemlich wie viel von jedem trank noch da ist
        println("Wir haben noch ${beutel.anzahlHeiltraenke} Heiltränke")
        // user gibt ueber readln seine auswahl ein
        // je nach auswahl:
            beutel.useHeiltrank(this) // hier muss der held uebergeben, der den beutel nutzt
           // beutel.useBooster(this)

    }

}

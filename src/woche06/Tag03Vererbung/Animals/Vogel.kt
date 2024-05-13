package woche06.Tag03Vererbung.Animals

open class Vogel(name: String, canFly: Boolean = true): Animal(name,canFly,false){

    init {
        println("VOGEL namens $name initialisiert!")
    }

    // OVERRIDE: überschreibt Methode aus der Mutter mit kind-spezifischer Logik.
    // automatisch open, also ebenfalls von etwaigen kindern ueberschreibbar
    override fun essen() {
        println("Der VOGEL $name frisst Körner...")
    }

    // final: darf nicht ueberschrieben werden
    final override fun fortBewegung(){
        println("Der VOGEL $name FLIEGT!")
    }

//    override fun toString(): String {
//        return """
//            --Vogel toString()--
//            Name: $name
//            Kann Fliegen: $canFly
//            Kann Schwimmen: $canSwim
//            Adresse: ${super.toString()}
//        """.trimIndent()
//    }

}
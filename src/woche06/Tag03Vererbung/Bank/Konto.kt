package woche06.Tag03Vererbung.Bank

class Konto(var name: String, var betrag: Double, var pin: String) {

    init {
        println("1.K: Konto von $name mit Betrag $betrag angelegt!")
    }

    constructor(name: String): this(name,0.0,"1111"){
        // init Logik:
        println("2.K: Default Konto für $name mit leerem Geldbetrag und Standard Pin 1111 angelegt!")
    }

    constructor(name:String, betrag: Double): this(name,betrag,"0000"){
        println("3.K: Konto von $name mit Betrag $betrag und Default Pin angelegt!")
    }

    fun pinAendern(){
        println("Sie wollen also die Pin aendern...")
        println("Alte Pin eingeben...")
        var pin = readln()
        if (pin == this.pin){
            println("Alte Pin korrekt eingegeben!")
            println("Neue Pin eingeben...")
            var newPin: String = readln()
            this.pin = newPin
            println("Pin erfolgreich aktualisiert!")
        } else {
            println("Falsche alte Pin! Vorgang abgebrochen...")
        }

    }

    override fun toString(): String {
        return """
            Inhaber: $name
            Betrag: $betrag
        """.trimIndent()
    }
}



package woche06.Tag03Vererbung.Animals

class Papagei(name: String, var canTalk: Boolean): Vogel(name){

    init {
        println("Papagei $name konstruiert!")
    }

    override fun essen() {
        println("Der Papagei $name pickt papageispezifisches essen...")
    }

    // override geht hier nicht, durch final in Mutter Vogel verboten
//    override fun fortBewegung() {
//        println("Papageienflug!!!!")
//    }

    fun talk(){
        if (canTalk){
            println("Der Papagei $name erzählt uns was...")
        } else println("$name bleibt stumm.")
    }

    override fun toString(): String {
        return "Papagei: $name"
    }

}
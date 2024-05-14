package woche06.Tag04Kapselung.Supermarkt


// Kinderklasse Fleisch, erbt von Lebensmittel

class Fleisch(name:String,preis:Double, val tierArt: String): Lebensmittel(name,preis,false){

    constructor(name: String,tierArt: String): this(name, 1.99, tierArt){
        //TODO Preis von Tierart abhängig machen?
    }

    // überschreibt die Mutter-printInfo()
    override fun printInfo() {
        println("--Fleisch Info--")
        println("Fleisch Name: $name")
        println("Fleisch Preis: $preis")
        printTierart()
    }

    protected fun printTierart(){
        println("Fleisch Tierart: $tierArt")
    }


    fun braten(){
        println("Fleisch $name wird angebraten... sizzle sizzle")
    }

}


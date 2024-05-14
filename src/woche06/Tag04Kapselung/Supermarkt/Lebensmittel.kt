package woche06.Tag04Kapselung.Supermarkt


open class Lebensmittel(val name: String, protected var preis: Double, open var isVegan: Boolean = true){

    init {
        printInternalInfo()
    }

    constructor(name: String, isVegan: Boolean = true):this(name,4.99){
        println("Lebensmittel $name mit dem 2.K. initialisiert!")
    }

    fun getPreiss(): Double {
        // printInternalInfo() kann private Methode überall aufrufen
        return this.preis
    }

    private fun printInternalInfo(){
        println("--Secret Info--")
        println("Einkaufspreis: ${this.preis*0.5}")
    }

    open fun printInfo(){
        println("--Open Info--")
        println("Lebensmittel Name: ${this.name}")
        println("Lebensmittel Preis: ${this.preis}")
    }

    override fun toString(): String {
        return "$name, $preis"
    }
}

fun main() {
    // primaere Konstr
    var yoghurt: Lebensmittel = Lebensmittel("Soja Yoghurt",1.99)
    // yoghurt.preis
    yoghurt.getPreiss()
    // yoghurt.printInternalInfo()
    // sek Konstr
    var milch: Lebensmittel = Lebensmittel("Milch",false)
    // primaerer Konstr
    var eier: Lebensmittel = Lebensmittel("Eier",2.99,false)

    var rind: Fleisch= Fleisch("Rind","Kuh")
    // rind.printInternalInfo() private Methoden werden NICHT vererbt!
    rind.printInfo()
    // rind.printTierart() protected Methoden sind NICHT von außen aufrufbar!
    rind.braten()

    var apfel: Obst = Obst("Apfel")
    // apfel.vitaminGehalt // geht nicht, protected, braucht getter
    apfel.getVitaminGehalte()
    // apfel.vitaminGehalt = "sehr hoch" geht nicht, protected, braucht setter
    apfel.setVitaminGehalte("sehr hoch")

    var tomate: Gemuese = Gemuese("Tomate")
    tomate.duensten()
    tomate.printInfo()

}



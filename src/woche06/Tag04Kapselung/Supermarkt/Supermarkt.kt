package woche06.Tag04Kapselung.Supermarkt

class Supermarkt(val lebensMittelList: MutableList<Lebensmittel> = mutableListOf()){

    var obstList: MutableList<Obst> = mutableListOf()

    init {
        println("---Init Block Supermarkt---")
        //TODO: LebensmittelListe mit Inhalt initialisieren
        lebensMittelList.addAll(
            listOf(
                Lebensmittel("Soja Yoghurt",1.99),
                Lebensmittel("Milch",false),
                Lebensmittel("Eier",2.99,false),
                Fleisch("Rind","Kuh"),
                Obst("Apfel"),
                Gemuese("Tomate"),
                Fleisch("Pute",2.99,"Geflügel"),
                Fleisch("Schwein",2.99,"Schwein"),
                Fleisch("Lamm",2.99,"Schaf"),
                Obst("Orange"),
                Obst("Melone"),
                Obst("Banane",0.89,"hoch"),
                Obst("Kirschen"),
                Gemuese("Tomate"),
                Gemuese("Aubergine"),
                Gemuese("Paprika"),
            )
        )
        println("Liste an Lebensmitteln erfolgreich initialisiert!")
        printLebensmittel()
        println("Obst Liste wird initialisiert...")
        makeObstList()
        obstList.forEach { println(it) }


    }

    fun printLebensmittel() {
        lebensMittelList.forEach { println(it.name) }
    }

    fun addLebensmittel(item: Lebensmittel){
        lebensMittelList.add(item)
    }

    fun addLebensMittelList(list: List<Lebensmittel>){
        lebensMittelList.addAll(list)
    }

    fun printFleisch(){
        // it is Fleisch == true
        lebensMittelList.forEach {
            if(it is Fleisch) {
                println(it)
            }
        }
    }

    fun makeObstList() {
        lebensMittelList.forEach {
            if (it is Obst) {
                obstList.add(it)
            }
        }
    }
}

fun main() {
    var supermarkt: Supermarkt = Supermarkt()

    println("Nur Fleisch Produkte:")
    supermarkt.printFleisch()

    var lamm : Fleisch = Fleisch("Lamm",2.99,"Schaf")
    var lammAsLebensmittel: Lebensmittel = lamm as Lebensmittel

    var joghurt: Lebensmittel = Lebensmittel("Soja Yoghurt",1.99)

    val jogurtAlsFleisch: Fleisch? = joghurt as? Fleisch
    println(jogurtAlsFleisch)

    val kalb: Lebensmittel = Fleisch("Kalb","Rind")


}





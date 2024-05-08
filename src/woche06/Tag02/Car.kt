package woche06.Tag02

// in die () kommt der primäre Konstruktor: alle Eigenschaften / Attribute / Variablen, die wir beim Initialisieren einer Instanz (= Erstellen einer Variable der Klasse Car) übergeben müssen
class Car(var brand: String, var year: Int){

    var istNeu: Boolean = false
    var speed: Double = 0.0
    var mileage: Double = 0.0
    var owner: String = "Unbekannt"


    // init Block: Wird bei der Instanziierung (= bei der Erstellung einer neuen Instanz IMMER automatisch sofort als erstes aufgerufen. Hier kann Initialisierungslogik rein!
    init {
        println("---Init Block---")
        if (year >= 2010){
            istNeu = true
        }
        println("Neues Auto $brand aus dem Jahr $year mit dem Primären Konstruktor initialisiert!")
        println("Dieses Auto ist ${if (istNeu) "neu." else "nicht neu."}")
        printInfo()
        println("---Ende Init Block---")

    }

    // SEKUNDÄRER KONSTRUKTOR: KÜRZERE VARIANTE MIT WENIGER ATTRIBUTEN, HAT EINEN INIT BLOCK DIREKT IN FOLGE
    constructor(brand: String) : this(brand,2020){
        println("SEKUNDAERER KONSTRUKTOR AUFGERUFEN! WIR HABEN NUR $brand ANGEGEBEN!")
        // auch hier kann initialisierungslogik rein


    }

    // SEKUNDÄRER KONSTRUKTOR: 3., LÄNGERE VARIANTE MIT MEHR ATTRIBUTEN
    constructor(brand: String, year: Int, speed: Double, milage: Double, owner: String): this(brand,year){
        println("INIT BLOCK DES insgesamt dritten, 2. SEKUNDAEREN KONSTRUKTORS WIRD AUFGERUFEN!")
        println("Die Attribute speed ($speed), mileage $milage und owner $owner sind dazu gekommen!")
        // auch hier kann initialisierungslogik rein
    }

    constructor(brand: String, year: Int, speed: Double): this(brand,year){
        println("INIT BLOCK DES 3. SEKUNDAEREN KONSTRUKTORS WIRD AUFGERUFEN!")
        println("Das Attribut speed ($speed) ist als einziges dazu gekommen... ")
        // auch hier kann initialisierungslogik rein
    }




    fun printInfo(){
        println("Auto der Marke $brand aus dem Jahr $year")
    }

}


fun main() {
//    var string: String = "String-Inhalt"
//    var car2: Car = Car("VW",1969)
//    var car3: Car = Car("Mercedes",2020)

    var car1: Car = Car("Toyota",1999)
    println("--- car With 1st Const---")
    var carWithSekConst: Car = Car("BMW")
    println("--- car With 2nd Const---")
    var car2WithSekConst: Car = Car("Bugatti")
    println("--- car With 3rd Const---")
    var carWithThirdConst: Car = Car("Ferrari",2023,240.0,0.0,"Mr Money")
    println("--- car With 4th Const---")
    var carWith4thConst: Car = Car("Peugeot",1990,100.0)

    // Punktnotation
   // println(car1.brand)
   // car1.printInfo()

   // var carList: MutableList<Car> = mutableListOf(car1,car2,car3)
//    carList.addAll(createCars())
//    carList.forEach { car -> println("Auto der Marke ${car.brand} aus dem Jahr ${car.year}") }
//    carList.forEach { println("Auto der Marke ${it.brand} aus dem Jahr ${it.year}") }
//    carList.forEach { it.printInfo() }

}

fun createCars():List<Car>{
    return listOf(
        Car("Toyota",1999),
        Car("VW",1999),
        Car("Golf",1999),
        Car("BMW",1999),
    )
}
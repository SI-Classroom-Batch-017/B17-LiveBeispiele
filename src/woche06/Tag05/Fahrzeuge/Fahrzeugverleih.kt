package woche06.Tag05.Fahrzeuge

class Fahrzeugverleih(var name: String){

    private var alleFahrzeuge: MutableList<Fahrzeug> = mutableListOf()
    private var alleLandFahrzeuge: MutableList<Landfahrzeug> = mutableListOf()
    private var alleWasserFahrzeuge: MutableList<Wasserfahrzeug> = mutableListOf()

    init {
        // initialisierungslogik: beim erstellen einer Verleih instanz werden alle Listen befuellt

        // alle fahrzeuge:
        alleFahrzeuge.addAll(
            mutableListOf(
                Fahrzeug("BMW"),
                Wasserfahrzeug("Schiff",90,800.0),
                Wasserfahrzeug("Kreuzfahrtschiff",200,9999.99),
                Landfahrzeug("Buggy"),
                Landfahrzeug("Bus"),
                Motorrad("Roller"),
                Motorrad("Dukati"),
                Motorrad("Yamaha"),
                Landfahrzeug("Dreirad",3),
                PKW("Familienwagen",100.0),
                PKW("Toyota Auto",40.0),
                PKW("Smart",20.0),
                Yacht("Spirit of the Sun"),
                Yacht("Sea Lion",99,450.0),
                Segelboot("Sailor's Dream"),
                Segelboot("Ship's Fate")
            )
        )

        // alle Landfahrzeuge rausfiltern und in alleLandfahrzeuge speichern:
        // filterIsInstance<Datentyp>: filtert alle Objekte des Datentyps in die Variable (hier alleLandFahrzeuge)
        alleLandFahrzeuge = alleFahrzeuge.filterIsInstance<Landfahrzeug>().toMutableList()

        // alle Wasserfahrzeuge rausfiltern: mit for Schleife
        for (fahrzeug in alleFahrzeuge) {
            if (fahrzeug is Wasserfahrzeug) {
                alleWasserFahrzeuge.add(fahrzeug)
            }
        }

    }

    fun getWasserFahrzeuge(): MutableList<Wasserfahrzeug> {
        println(alleWasserFahrzeuge)
        return alleWasserFahrzeuge
    }

    fun getFahrzeuge(): MutableList<Fahrzeug> {
        println(alleFahrzeuge)
        return alleFahrzeuge
    }

    fun getLandFahrzeuge(): MutableList<Landfahrzeug> {
        println(alleLandFahrzeuge)
        return alleLandFahrzeuge
    }

    fun addFahrzeug(fahrzeug: Fahrzeug){
        alleFahrzeuge.add(fahrzeug)
        // wenn das Fahrzeug Wasser ist -> in alleWasserfahrzeuge,
        // wenn Landfahrzeug -> in alleLandfahrzeuge
        if (fahrzeug is Landfahrzeug){
            alleLandFahrzeuge.add(fahrzeug)
        } else if (fahrzeug is Wasserfahrzeug){
            alleWasserFahrzeuge.add(fahrzeug)
        }
    }

    fun removeFahrzeug(fahrzeug: Fahrzeug){
        //TODO besser machen
        // man koennte zB nur den Namen als String uebergeben, dann listen durchgehen, ob der gleiche name existiert, und nur dann loeschen
        alleFahrzeuge.remove(fahrzeug)
        if (fahrzeug is Landfahrzeug){
            alleLandFahrzeuge.remove(fahrzeug)
        } else if (fahrzeug is Wasserfahrzeug){
            alleWasserFahrzeuge.remove(fahrzeug)
        }
    }

    fun vermieten(fahrzeug: Fahrzeug){
        println("Das Fahrzeug ${fahrzeug.bezeichner} wird vermietet...")
        fahrzeug.istVermietet = true
    }

    fun zurueckGeben(fahrzeug: Fahrzeug){
        println("Das Fahrzeug ${fahrzeug.bezeichner} wird zurueck gegeben...")
        fahrzeug.istVermietet = false
    }

    fun getVermieteteFahrzeuge(): MutableList<Fahrzeug> {
        // Schleife
        var vermietet: MutableList<Fahrzeug> = mutableListOf()
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug.istVermietet == true){
                vermietet.add(fahrzeug)
            }
        }
        return vermietet
    }

    fun getVeruegbareFahrzeuge(): MutableList<Fahrzeug> {
        return alleFahrzeuge.filter { !it.istVermietet }.toMutableList()
    }


}

fun main() {
    val verleih: Fahrzeugverleih = Fahrzeugverleih("1000 Fahrzeuge!")
    verleih.getWasserFahrzeuge()
    verleih.getFahrzeuge()
    verleih.getLandFahrzeuge()

    var yacht = Yacht("Sea Spirit II") // Speicheradresse 1
    verleih.addFahrzeug(yacht)
    verleih.getWasserFahrzeuge()

    // VORSICHT: das klappt nicht.
    // brand neue Yacht Sea Spirit II wird erstellt und nicht als die gleiche, die schon drin ist, erkannt
    verleih.removeFahrzeug(Yacht("Sea Spirit II")) // Speicheradresse 2
    verleih.getWasserFahrzeuge()

    // das hier wuerde funktionieren
    verleih.removeFahrzeug(yacht)

    // sobald Object() mit Konstruktor aufgerufen wird, wird ein brand neues Objekt erstellt. Es ist also nicht ein bereits existierendes Objekt aus dem Verleih, sondern wirklich brand neu = wird nicht als bereits im Verleih vorhanden erkannt.
    verleih.addFahrzeug(Yacht("Sea Spirit II"))
    verleih.addFahrzeug(Yacht("Sea Spirit II"))
    verleih.addFahrzeug(Yacht("Sea Spirit II"))

    // auch das Set hilft uns nicht. wir haben hier nicht mehr primitive Strings sondern wirklich komplexe, individuelle Objekte die an verschiedenen Speicheradressen stehen.
    println(verleih.getWasserFahrzeuge().toSet())

    // Fahrzeug aus dem Verleih schälen, schauen, ob es vermietet ist oder nicht:
    println(verleih.getFahrzeuge()[0].istVermietet)

    // tatsaechlich bereits vorhandenes Objekt, das im Verleih existiert und in der Liste steht, in einer Variable speichern, um damit zu arbeiten
    var lastWasserFahrzeug: Wasserfahrzeug = verleih.getWasserFahrzeuge().last() // Sea Spirit II

    verleih.vermieten(lastWasserFahrzeug)
    println(lastWasserFahrzeug)

    verleih.vermieten(verleih.getFahrzeuge().first())


    println(verleih.getVermieteteFahrzeuge())

    verleih.removeFahrzeug(lastWasserFahrzeug) // das letzte Sea Spirit wird entfernt
    verleih.zurueckGeben(lastWasserFahrzeug)
    println(lastWasserFahrzeug)
}





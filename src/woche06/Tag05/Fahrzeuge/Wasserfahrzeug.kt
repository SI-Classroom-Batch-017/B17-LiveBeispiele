package woche06.Tag05.Fahrzeuge

// die Attribute muessen nicht zwingend gleich wie bei ihren Eltern heissen. name steht fuer das Attribut, was ueberall sonst bezeichner heisst. sind beides Strings, ist ok. ist dann aber eine "neue" variable und braucht ein var davor, sonst gilt es als temporäre konstruktorvariable. kann aber trotzdem an der stelle von bezeichner hochgereicht werden, solange der datentyp uebereinstimmt (hier String)
open class Wasserfahrzeug(var name: String, maxKmh: Int, price: Double): Fahrzeug(name,maxKmh,price,0){

    override fun toString(): String {
        return "Wasserfahrzeug \n${super.toString()}"
    }

    override fun getMaxKmhh(): Int {
        println("Maximalgeschwindigkeit in Knoten: $maxKmh")
        return super.getMaxKmhh()
    }

    constructor(name: String): this(name,30,70.99)



}
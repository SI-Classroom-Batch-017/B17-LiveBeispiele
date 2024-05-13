package woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src

import Form
import Kreis
import Rechteck

fun main(){
    val form = Form("blau")
    form.info()

    val kreis = Kreis("gruen", 1)
    println(kreis.umfang())
    println(kreis.flaeche())

    val rechteck = Rechteck("schwarz", 2, 4)
    println(rechteck.umfang())
    println(rechteck.flaeche())
}
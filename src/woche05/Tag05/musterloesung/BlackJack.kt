package woche05.Tag05.musterloesung

import java.lang.Exception



fun main(){

    /* Die Variable meinDeck ist euer Deck mit den ihr arbeiten koennt.
    Mit der Funktion mischen() könnt ihr das Deck mische
    Mit der Funktion eineKarteZiehen() könnt ihr aus eurem Deck die oberste Karte bekommen,
    beachtet das die Funktion die Karte auch aus eurem Deck entfernt.
    Mit der Funktion kartenWert() bekommst du den Wert der Karte als Int zurück.
    Unter dem Kommentar siehst du wie du die Funktionen benutzen kannst.
     */
    var konto: Double = 100.0

    //var handSpieler = mutableListOf<String>()
    //var pcSpieler = mutableListOf<String>()

    //mischen(meinDeck)


    //var karte = eineKarteZiehen(meinDeck)
    //var beispielwert = kartenWert(karte)
    //println(beispielwert)
    do {
        var handSpieler = mutableListOf<String>()
        var pcSpieler = mutableListOf<String>()
        var meinDeck = kartendeck.toMutableList()
        spielrundeStarten(handSpieler, pcSpieler, meinDeck)
        println("Wie viel Geld möchtest du setzen? ")
        var geld: Double = 0.0
        while(true){      // Hier bisschen unsauber codiert, geht in dem Fall aber nur darum, dass die Schleife ausgeführt wird.
            try {
                geld = readln().toDouble()
                if (geld > konto) {
                    println("Sie können nicht so viel Geld setzen, da sie nur noch $konto im Konto sind.")
                } else {
                    println("Sie haben $geld € gesetzt")
                    break;
                }
            } catch (e: Exception) {
                println("Sie haben keine Zahl eingegeben! ")
            }
        }
        hitAndStand(handSpieler, meinDeck)
        if(kartenAufHand(handSpieler) <= 21){
            println("Nun zieht der Dealer!")
            dealerZieht(pcSpieler, meinDeck)
        }
        if(kartenAufHand(handSpieler) > 21) {
            konto -= geld
        }
        else if (kartenAufHand(pcSpieler) > 21) {
            konto += geld
        }
        when(gewinner(handSpieler, pcSpieler)){
            0 -> konto -= geld
            1 -> println("Du bekommst deinen Einsatz zurück!")
            2 -> konto += geld
        }
        println("Du hast noch $konto € auf dem Konto.")
        println("Möchten Sie weiter Spielen? (J/N)")
        var tmp = readln().uppercase()
    }while (konto>0 && tmp == "J")

    println("Das Spiel ist nun zu Ende!")
}



fun kartenAufHand(hand: MutableList<String>): Int{
    var erg = 0;
    for(i in hand){
        erg += kartenWert(i);
    }
    return erg
}

fun spielrundeStarten(handSpieler: MutableList<String>, handPC: MutableList<String>, deck: MutableList<String>){
    mischen(deck)

    handSpieler.add(eineKarteZiehen(deck))
    handSpieler.add(eineKarteZiehen(deck))
    handPC.add(eineKarteZiehen(deck))
    handPC.add(eineKarteZiehen(deck))

    println("Deine Hand sieht wie folgt aus: ${handSpieler[0]} + ${handSpieler[1]}")
    if(kartenWert(handPC[0]) < kartenWert(handPC[1])){
        println("Die erste Karte vom Dealer ist ${handPC[1]}")
    }
    else {
        println("Die erste Karte vom Dealer ist ${handPC[0]}")
    }
}

fun zuHohePunkte(hand: MutableList<String>):Boolean{
    return kartenAufHand(hand) > 21
}

fun hitAndStand(hand: MutableList<String>, deck: MutableList<String>){
    var gameNotEnde: Boolean = true;
    do {
        println("Möchten Sie noch eine Karte ziehen oder passen? (hit/stand)")
        var tmp = readln()
        if(tmp == "hit"){
            hand.add(eineKarteZiehen(deck))
            println("Deine Hand sieht nun wie folgt aus: $hand")
            if(zuHohePunkte(hand)){
                println("Der Spieler hat die Punktzahl überschritten")
                break;
            }
        }
        else if(tmp == "stand"){
            //Stand
            gameNotEnde = false;
        }
    }while (gameNotEnde)
}

fun dealerZieht(hand: MutableList<String>, deck: MutableList<String>){
    do {
        if(kartenAufHand(hand) < 17) {
            hand.add(eineKarteZiehen(deck))
            if (zuHohePunkte(hand)) {
                println("Der Dealer hat die Punktzahl überschritten")
                break;
            }
        }
    }while (kartenAufHand(hand) < 17)
    println("Die Hand vom Dealer: $hand")
}

fun gewinner(handSpieler: MutableList<String>, handPC: MutableList<String>): Int{
    if(kartenAufHand(handSpieler) < kartenAufHand(handPC) && kartenAufHand(handPC) <= 21){
        println("Der Pc gewinnt das Spiel!")
        return 0
    }
    else if(kartenAufHand(handSpieler) == kartenAufHand(handPC) && kartenAufHand(handSpieler) <= 21){
        println("Unentschieden!")
        return 1
    }
    if(kartenAufHand(handSpieler) > kartenAufHand(handPC) && kartenAufHand(handSpieler) <= 21){
        println("Der Spieler gewinnt das Spiel!")
        return 2
    }
    return -1
}
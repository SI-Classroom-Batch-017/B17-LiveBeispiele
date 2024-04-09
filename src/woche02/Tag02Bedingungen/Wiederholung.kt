package woche02.Tag02Bedingungen


fun main() {


    // if else
    println("Bitte gib true oder false ein")
    var hasUserPostedStory: Boolean = true
    var isUserOver18: Boolean = false
    var isFemale: Boolean = false

    // Nutzer muss nicht true eingeben, sondern darf ja eingeben
    // equals ist eine Funktion, die true oder false zurueckgibt, je nachdem, ob im aus readln() ja rauskommt
    // var hasUserPostedStory: Boolean = readln().equals("ja",true)


    // wenn/falls in hasUserPostedStory true drin steht
    if (hasUserPostedStory == true){
        println("Regenbogen ums Profilbild anzeigen.")
        println("Es wurde true eingegeben")
        // zB generiereRegenbogen(), eine komplexe Funktion, die einen Regenbogen animiert
    } else /* if (hasUserPostedStory == false) */ {
        println("Keinen Regenbogen ums Profilbild machen.")
        println("Es wurde false eingegeben")
    }


// if else, else if
    if (hasUserPostedStory){ // ist das gleiche wie hasUserPostedStory == true
        println("Regenbogen zeigen")
        // ins else if kommen wir nur rein, wenn die 1. Bedingung NICHT gestimmt hat
    } else if (isUserOver18){
        println("Kein Regenbogen")
        println("Nutzer ist unter 18, jugendfreies Menü anzeigen")
        // nur, wenn User keine Story geposted hat, unter 18 ist, wird isFemale geprueft:
    } else if (isFemale) {
        // nur wenn isFemale true ist, wird Kinder Werbung angezeigt
        println("Zeige Werbung für weibliche Jugendliche Zielgruppe im Feed (nicht in den Stories, da dort nich geposted wird)")
    }

    var z : Int = 9

    // in: schaut, ob z in der Range 1 bis 9 enthalten ist, true wenn ja, false wenn nicht
    if (z in 1..9){
        println("Die Zahl ist im 0er bereich")
    } else if (z in 10..19){
        println("Die Zahl ist im 10er")
    } else if(z in 20..29){
        println("Die Zahl ist im 20er bereich")
    }

    var string: String = "Moin"

    // CONTAINS UND IN: MACHEN DAS GLEICHE: GEBEN TRUE ODER FALSE ZURUECK je nachdem ob x beinhaltet ist
    if (string.contains("M",true)){
        println("Der String enthält den Buchstaben 'M'")
    }

    if ("M" in string){
        println("Der String enthält den Buchstaben 'M'")
    }


// when

    var integerNumber: Int = 3 // oder: readln().toInt()

    when(integerNumber){
        1 -> println("Die Nummer ist 1")
        2 -> println("Die Nummer ist 2")
        // "Wenn integerNumber in der Range zwischen 3 und 10 ist"
        in 3..9 -> println("Die Nummer liegt zwischen 3 und 9")
        // "Wenn integerNumber in der Range zwischen 11 und 19 ist"
        in 11..19 -> println("Die Nummer ist im 10er bereich")
        100 -> println("100!!!!!")
    }

    var string2: String = "Montag" // oder: readln()
    when (string2){
        "Montag" -> println("Es ist Montag")
        "Dienstag" -> println("Es ist Dienstag")
    }

    // man kann das Ergebnis von when auch in eine Variable speichern:
    var weekEnd: String = when(string2){
        "Freitag","Samstag","Sonntag" -> "Es ist Wochenende!"
        else -> "Es ist kein Wochenende"
    }

    var isWeekEnd: Boolean = when(string2){
        "Freitag","Samstag","Sonntag" -> true
        else -> false
    }

    println(weekEnd)
    println("Ist es Wochenende? -> $isWeekEnd")


    // Eine Int Range beinhaltet alle Zahlen von der 1. bis zur 2.
    var numbers1to100: IntRange = 1..100

}

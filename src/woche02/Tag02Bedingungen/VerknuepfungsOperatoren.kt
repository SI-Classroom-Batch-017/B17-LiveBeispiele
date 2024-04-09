package woche02.Tag02Bedingungen

fun main() {
    var isSunShining: Boolean = false
    // ! : kehr ins gegenteil um, true wird zu false, false wird zu true.
    var isRaining: Boolean = !isSunShining
    var isItWindy: Boolean = true

    // &&: beide Operanden (Seiten) muessen true sein, damit das Ergebnis true ist
    var isRainHeavy: Boolean = isRaining && isItWindy

    // || dass einer von beiden Operanden true ist, reicht aus, damit das Ergebnis true ist
    var badWeather: Boolean = isRaining || isItWindy


    var temperature: Double = 30.0

    // wenn die Sonne scheint und die Temperatur über/gleich 30 Grad ist, wollen wir Sonnencreme empfehlen
    if (isSunShining && (temperature >= 30.0)){
        println("Es ist heiss und die Sonne scheint --> Sonnencreme einpacken!")
    }

    println("Willkommen beim Türsteher. Bitte gib dein Alter ein...")
    var age: Int = readln().toInt()

    var darfRein: Boolean = false

    // nur wenn wir über 18 sind
    if (age >= 18){
        println("Lass uns pruefen, wie betrunken du bist...")
        println("Wie viele Bier hast du schon getrunken?")
        var beers: Int = readln().toInt()
        println("Immerhin bist du über 18...")
        // wenn 0 bier: nüchtern
        // wenn 1-3 bier: angetrunken
        // wenn 3-5: betrunken
        // wenn mehr als 5: zu betrunken um reinzukommen
        when(beers){
            0 -> {
                println("Du bist nüchtern")
                darfRein = true
            }
            in 1..3 -> {
                println("Du bist angetrunken")
                darfRein = true
            }
            in 4..5 -> {
                println("Du bist betrunken")
                darfRein = true
            }
            else -> {
                println("Du bist zu betrunken...")
                darfRein = false
            }
        }
    }

    if (darfRein){
        println("Du hast Eintritt erhalten")
    } else {
        println("Du hast keinen Eintritt erhalten...")
    }

    println("Du hast ${if (!darfRein) "keinen " else ""}Eintritt erhalten")




}
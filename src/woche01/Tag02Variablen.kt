package woche01

fun main() {
    // Variable anlegen (initialisieren: neu erstellen und mit Wert befuellen)
    // Syntax: Schluesselwort var - variablenName - : Datentyp - = - inhalt
    var firstName: String = "Harry"
    var lastName: String = "Potter"
    // kein $ (Interpolation): Variable wird nicht als solche erkannt
    println("In der Variable firstName steht: firstName")
    println("In der Variable firstName steht: $firstName, in lastName steht: $lastName")

    // Variable aktualisieren: Sybtax name - = - neuer Inhalt
    firstName = "Ron"
    println("In der Variable firstName steht jetzt: $firstName")

    println("Bitte gib deinen Vornamen ein...")
    firstName = readln()
    println("In der Variable firstName steht jetzt: $firstName")

    lastName = "Granger"
    println("In der Variable firstName steht: $firstName, in lastName steht: $lastName")

    // eine Variable in eine andere Variable reinschreiben
    // firstName = lastName

    // Variablen können sich aus anderen Variablen zusammensetzen:
    var fullName: String = firstName + " " + lastName // zB Hermine Granger

    println("Bitte gib einen Vornamen ein!")
    var combinedVariable: String = readln() + " " + lastName
    println("In combinedVariable steht: $combinedVariable") // zB Simone Granger

    println("Die Variable fullName beinhaltet: $fullName")
    println(fullName)

    // CamelCase: jedes Einzelwort gross schreiben fuer die Leserlichkeit
    val langerVariablenName = 0
    val langervariablenname = 1



    // Konstante: statt var val, darf danach nicht mehr verändert werden
    val birthDate: String = "01.01.2001"
    // birthDate: String = "01.01.2010" // nicht erlaubt, darf nicht aktualisiert werden
    val birthPlace: String = "London"
    // birthPlace: String = "Berlin"


    // Variable deklarieren: ohne Inhalt anlegen
    var favoriteFood: String = "Pizza*&@#%%@@^%^   $firstName blabla +-+"
    var favoriteDrink: String // ich darf leere Variablen anlegen, NUR solange ich ihren Datentypen dazu schreibe

    // 100 Zeilen Code spaeter....

    favoriteDrink = "Tee"


    var beispielString: String = "Hi, hier kommt ein Zeilenumbruch:\nMia sagt: \"Ich liebe programmieren!\" "
    println(beispielString)

    var beispielStringBlock: String = """

         hi
        es gab einen zeilenumbruch
        dieser string ist ein grosser text block...

    """.trimIndent()
    println(beispielStringBlock)



    // INTEGER: Int, ganze Zahlen
    var number1: Int = 5
    println("Inhalt von nr1: $number1")
    println(number1)
    var number2: Int = 10
    println("Inhalt von nr2: $number2")
    println(number2)

    var result: Int = number1 + number2 + 10 - 1
    println("Ergebnis der Rechnung: $result")
    // geschweifte Klammern { } bedeuten: Ausführbarer Code/Logik
    println("Rechnen innerhalb eines Strings: (3+10)*3 = ${(3+10)*3}")
    println("Rechnen innerhalb eines Strings: $number1 + $number1 * $result = ${number1+number2*result
    }")

    // DOUBLE

    // Datentyp Double: Zahl mit Komma, man darf mit ihnen *, /, +, -, etc rechnen
    var doubleNr1: Double = 10.5
    println(doubleNr1)
    var doubleNr2: Double = 100.5
    println(doubleNr2)
    var doubleResult: Double = doubleNr1 * doubleNr2
    println("$doubleNr1 * $doubleNr2 = $doubleResult")
    println(doubleNr2*doubleNr1)

    // Doubles und Ints koennen gemeinsam mit rechnen benutzt werden, das Ergebnis ist dann ein Double
    var calc: Double = doubleNr1 * number1
    println(calc)
    println(doubleNr1*2)


    // BOOLEAN
    var isUserVerified: Boolean = true // blauer Haken wird nicht angezeigt
    println("Es ist $isUserVerified, dass der User verifiziert ist.")
    isUserVerified = false // blauer Haken wird angezeigt
    println("Es ist jetzt $isUserVerified, dass der User verifiziert ist.")

    var isUserLoggedIn: Boolean = false
    println("Es ist $isUserLoggedIn, dass der User eingeloggt ist.")
    isUserLoggedIn = true
    println("Es ist jetzt $isUserLoggedIn, dass der User eingeloggt ist.")

}

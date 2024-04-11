package woche02.Tag04TryCatch

// Auto auswählen, das bestimmte Eigenschaften hat

fun main() {
    var marke: String = "Toyota"
    var farbe: String = "rot"
    var preis: Double = 999.99
    var isAutomatic: Boolean = true



    if (marke == "Toyota" && farbe == "blau" && preis <= 999.99 && isAutomatic){
        println("Das ist 100% mein Traumauto mit Marke $marke, Farbe $farbe, preis $preis und ${if (isAutomatic) "automatisch" else "manuell"} schaltbar.")
    } else if (marke == "Toyota" && farbe != "blau" && preis <= 999.99 && isAutomatic){
        println("Das ist zu 75% mein Traumauto, nur die Farbe ist $farbe")
    }

    if (marke == "Toyota"){
        if (farbe == "blau"){
            if (preis <= 999.99){
                if (isAutomatic){
                    println("Das ist 100% mein Traumauto mit Marke $marke, Farbe $farbe, preis $preis und ${if (isAutomatic) "automatisch" else "manuell"} schaltbar.")
                }
            }
        }
    }

    var nullableString: String? = null

    // Safe Call
    println(nullableString?.length) // null

    // Non Null Asserted Call
    //println(nullableString!!.length) // Programm stürzt ab, NullPointerException

    // Elvis Operator
    println(nullableString?:"Kotlin".length)


    // in Schluesselwort
    var x: String = "blabla"
    if ("a" in x){
        println("'a' ist enthalten")
    }
    if (x.contains("A",true)){ // ignoreCase: "ignoriere Gross- und Kleinschreibung)
        println("'a' ist enthalten")
    } else {
        println("A ist nicht enthalten")
    }

}
package woche06.musterloesungWochenWiederholung

// Liste von Mitarbeitern
val mitarbeiterListe: List<String> = listOf(
    "Alice",
    "Bob",
    "Charlie",
    "David",
    "Eva",
    "Frank",
    "Simon",
    "Marcus",
    "Lisa",
    "Paula",
    "Martin",
    "Joana",
    "Anita"
)

// Map von Produktkategorien und Produktnamen
val produktMap: Map<String,List<String>> = mapOf(
    "Elektronik" to listOf("Smartphone", "Laptop", "Tablet"),
    "Kleidung" to listOf("Hose", "Jacke", "Kleid"),
    "Nahrung" to listOf("Apfel", "Brot", "Milch"),
    "Bücher" to listOf("Romane", "Sachbücher", "Krimis", "Fantasy", "Biografien"),
    "Haushalt" to listOf("Staubsauger", "Kaffeemaschine", "Töpfe", "Messer", "Waschmaschine")
)

val cMitarbeiterListe = mitarbeiterListe.toMutableList()

val cProductMap: MutableMap<String,List<String>> = mutableMapOf(
    "Elektronik" to mutableListOf("Smartphone", "Laptop", "Tablet"),
    "Kleidung" to mutableListOf("Hose", "Jacke", "Kleid"),
    "Nahrung" to mutableListOf("Apfel", "Brot", "Milch"),
    "Bücher" to mutableListOf("Romane", "Sachbücher", "Krimis", "Fantasy", "Biografien"),
    "Haushalt" to mutableListOf("Staubsauger", "Kaffeemaschine", "Töpfe", "Messer", "Waschmaschine")
)
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Funktionen und Parameter</h3>
<br>

### Beschreibung
Paramter sind wichtige Komponenten von Funktionen, weil man der Funktion beim Aufruf Informationen mitgeben kann, die sie braucht.
Die Dateien für die Aufgaben findest du im Projekt in Module eingeteilt.

> #### Hinweise zur Bearbeitung
> - Achte darauf, dass dein Quellcode sauber ist. Besonders die Einrückungen sind wichtig!
> - Verwende Dokumentationskommentare, um deinen Code zu erklären und zu dokumentieren.
> - Teste deinen Code. Er sollte nicht nur kompilieren und ausführbar sein, sondern auch das gewünschte Ergebnis liefern.
> - `Commit & Push` dein Ergebnis am Ende des Tages
    <br>

<details>
<summary> <b> Aufgabe 1 Name für Funktion + Parameter entwerfen </b> </summary>

**Datei für die Aufgabe: 1_Aufgabe.kt**

Aufgabe:

- Schreibe eine Funktion `yourName()`, die einen Namen als Parameter übergeben bekommt.
- Überprüfe, ob der Name nicht leer ist. Falls der Name leer ist, gib aus: "Du hast keinen Namen eingegeben."
- Ansonsten gib aus: Dein Name ist:`(Name)`.
- Rufe die Funktion in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main-Funktion mit einem Beispielnamen auf.

</details>

---

<details>
<summary> <b> Aufgabe 2 Funktion + Parameter entwerfen</b> </summary>

**Datei für die Aufgabe: 2_Aufgabe.kt**

- Erstelle eine Funktion performCalculation, die einen Parameter vom Typ Int akzeptiert.
- Überprüfe, ob die übergebene Zahl größer als 0 ist.
- Falls ja, verrechne die Zahl mit einer vorgegebenen Variable deiner Wahl und gib das Ergebnis aus.
- Falls die Zahl nicht größer als 0 ist, gib aus: "Bitte gib eine positive Zahl ein."
- Rufe die Funktion in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main-Funktion mit einer negativen Zahl auf.

</details>

---

<details>
<summary> <b> Aufgabe 3 Textabgabe I</b> </summary>

**Datei für die Aufgabe: 3_Aufgabe.kt**

Schau dir den nachfolgenden Code an und überlege, ob ein if-else Statement notwendig ist.
Falls ja, implementiere es entsprechend und beschreibe kurz in eigenen Worten,
was passiert und schlussendlich auf der Konsole ausgegeben wird.

Schreibe deine Antwort in die Datei `3_Aufgabe.kt`.
```kotlin
fun subtract(firstNumber: Int) {
    var secondNumber: Int = 10
    println(secondNumber - firstNumber)
}

fun woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main() {
    subtract(5)
}
```

</details>

---

<details>
<summary> <b> Aufgabe 4 Textabgabe II</b> </summary>

**Datei für die Aufgabe: 4_Aufgabe.kt**

Schau dir den nachfolgenden Code an und beschreibe kurz in eigenen Worten,
was hier passiert und schlussendlich auf der Konsole ausgegeben wird.

Schreibe deine Antwort in die Datei `4_Aufgabe`.
```kotlin
fun hello(name: String) {
    println("Hallo! Wie geht es dir $name?")
}

fun woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main() {
    hello("Peter")
}
```

</details>

---

<details>
<summary> <b> Aufgabe 5 Textabgabe III</b> </summary>

**Datei für die Aufgabe: 5_Aufgabe.kt**

Schau dir den nachfolgenden Code an und beschreibe kurz in eigenen Worten,
was hier passiert und schlussendlich auf der Konsole ausgegeben wird.

Schreibe deine Antwort in die Datei `5_Aufgabe`.

```kotlin
fun multiplikation(firstNumber: Int, secondNumber: Int) {
    println(firstNumber * secondNumber)
}
fun woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main() {
    multiplikation(5, 23)
}
```

</details>

---

<details>
<summary> <b> Aufgabe 6 Textabgabe IV</b> </summary>

**Datei für die Aufgabe: 6_Aufgabe.kt**

Schau dir den nachfolgenden Code an und beschreibe kurz in eigenen Worten,
was hier passiert und schlussendlich auf der Konsole ausgegeben wird.

Schreibe deine Antwort in die Datei `6_Aufgabe`.

```kotlin
fun printMovie(movieTitle: String?) {
    if (!movieTitle.isNullOrEmpty()){

        val output = when (movieTitle) {
            "Batman" -> println("1")
            "Oldboy" -> println("2")
            "ES" -> println("3")
            "Harry Potter" -> println("4")
            "Pulp Fiction" -> println("5")
            null -> println("null existiert nicht.")
            else ->  println("Ungültiger Film-Titel. Bitte gib einen gültigen Titel ein.")

        }
    }
}

fun woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main() {
    printMovie("e")
}

```

</details>

---

<details>
<summary> <b>Aufgabe 7 Lösung für Compilerfehler finden </b> </summary>

**Datei für die Aufgabe: 7_Aufgabe.kt**

Schaue dir den Code an, überlege was hier nicht stimmt und korrigiere dann den Fehler, indem du die fehlende Zahl als Parameter übergibst.
Danach soll beim Kompilieren des Programms kein Fehler mehr ausgegeben werden.

</details>

---

<details>
<summary> <b> Aufgabe 8 Funktion + Parameter entwerfen</b> </summary>

**Datei für die Aufgabe: 8_Aufgabe.kt**

Hier sollst du nun deine eigene Funktion selbst entwerfen!

- Die Funktion soll einen Double als Parameter bekommen und am Ende eine Ausgabe ausdrucken, die die Größe einer Person,
- wie im Folgenden Beispielsatz, ausgibt: "Du bist 1.83 Meter groß!"
- Dabei soll der übergebene Parameter die Größe der Person sein, die im Beispielsatz ausgegeben wird.
- Vergiss nicht, die Funktion dann auch in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main Funktion aufzurufen!

</details>

---

<details>
<summary> <b> Aufgabe 9 Funktion + Parameter entwerfen</b> </summary>

**Datei für die Aufgabe: 9_Aufgabe.kt**

Hier sollst du nun deine eigene Funktion entwerfen!

- Denke dir zunächst einen Namen für deine Funktion aus
- Die Funktion soll zwei Parameter übergeben bekommen: ein Land `country: String` und seine Hauptstadt `capitalCity: String`
- Die Funktion fügt Land und Stadt zu 1 String zusammen, zB `Lissabon ist die Hauptstadt von Portugal` und gibt diesen zurück.


</details>

---

<details>
<summary> <b> Aufgabe 10 - Euro berechnen </b></summary>

**Datei für die Aufgabe: 10_Aufgabe.kt**

- Schreibe eine Funktion, die eine Umrechnung von Dollar in Euro ermöglicht.
- Dabei soll der Funktion der EuroBetrag, der umzurechnen ist, als Parameter übergeben werden
- Die Funktion soll das Ergebnis zurückgeben
#### Hinweis: 1 Dollar entspricht 0.94 Euro

</details>

--- 
<details>
<summary> <b> Aufgabe 11 - BMI berechnen </b></summary>

**Datei für die Aufgabe: 11_Aufgabe.kt**

Schreibe eine Funktion namens calculateBmi(), die den BMI einer Person basierend auf ihrem Gewicht in Kilogramm und ihrer Größe in Metern berechnet. Verwende dabei die Formel: BMI = Gewicht / (Größe * Größe).
Gewicht und Größe sollen dabei Parameter sein. Der BMI soll zurück gegeben werden.


</details>

--- 
<details>
<summary> <b> Aufgabe 12 - Temperatur Umwandlung </b></summary>

**Datei für die Aufgabe: Temperatur.kt**

Schreibe eine Funktion namens `convertTemperature()`, die eine Temperatur von Celsius in Fahrenheit umwandelt.
Die Funktion sollte einen Parameter für die Celsius-Temperatur haben und die entsprechende Temperatur in Fahrenheit als Double zurückgeben.


</details>

--- 
<details>
<summary> <b> Aufgabe 13 - Email Validierung </b></summary>

**Datei für die Aufgabe: Email.kt**

Schreibe eine Funktion namens `validateEmail()`, die überprüft, ob eine als Parameter gegebene E-Mail-Adresse gültig ist.
Die Adresse ist gültig, wenn das @-Symbol in der Adresse vorkommt.

Welche String-Operation braucht es nochmal hierfür?

Die Funktion soll `true` zurückgeben, wenn die Adresse gültig ist, und `false`, wenn nicht.


</details>

--- 
<details>
<summary> <b> Aufgabe 14 - Durchschnitt von 3 Zahlen </b></summary>

**Datei für die Aufgabe: Durchschnitt.kt**

Schreibe eine Funktion namens `average()`, die 3 Integers als Parameter übergeben bekommt und den Durchschnitt dieser 3 Zahlen als Double zurück gibt.

</details>

--- 



<details>
<summary> <b> Bonus </b> </summary>

**Datei für die Aufgabe: Bonus.kt**

Programmiere einen Geometrie Rechner.

- Schreibe eine Funktion, welche mir den Flächeninhalt und den Umfang eines Quadrates ausgibt.
- Die Seitenlänge `a` soll dabei als Parameter übergeben werden

Flächeninhalt: A = a<sup>2</sup>

Umfang: U = 4 * a

- Schreibe eine Funktion, welche mir den Flächeninhalt und den Umfang eines Rechtecks ausgibt.
- Die Seitenlängen `a` und `b` sollen dabei als Parameter übergeben werden

Flächeninhalt: A = a * b

Umfang: U = 2 * a + 2 * b

- Schreibe eine Funktion, welche mir den Flächeninhalt und den Umfang eines Kreises ausgibt.
- Der Radius ``r`` soll dabei als Parameter übergeben werden

Flächeninhalt: A = π * r<sup>2</sup>

Umfang: U = 2 * r * π


Rufe die Funktionen in der woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()-Funktion auf um deine Ergebnisse zu überprüfen.

### **Hinweis: Alle Funktionen müssen mit beliebigen Größen aufrufbar sein.**

</details>

---


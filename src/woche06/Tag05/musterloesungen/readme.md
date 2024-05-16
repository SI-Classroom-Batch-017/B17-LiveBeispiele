<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Objektorientierte Programmierung</h3>
<br>

<p align="center">
  <img width="500" height="370" src="img/img_1.png" />
</p>

### Beschreibung
Heute gründen wir unseren eigenen kleinen Streichelzoo, mit lauter spannenden Tieren und auch lauter spannenden Aufgaben, die es zu erledigen gilt.

> #### Hinweise zur Bearbeitung
> - Achte darauf, dass dein Quellcode sauber ist. Besonders die Einrückungen sind wichtig!
> - Verwende Dokumentationskommentare, um deinen Code zu erklären und zu dokumentieren.
> - Teste deinen Code. Er sollte nicht nur kompilieren und ausführbar sein, sondern auch das gewünschte Ergebnis liefern.
> - `Commit & Push` dein Ergebnis am Ende des Tages
    <br>

Erstelle deine Klassen nach dem folgendem Klassendiagramm:

![img.png](img/class_diagram.png)

**Beachte außerdem Folgendes:**
- Für weitere Informationen zu den einzelnen Klassen findest du unten die Reiter zu den einzelnen Klassen
- Jede Klasse soll in eine eigene Datei.
- Anleitung zum Erstellen einer neuen Datei
    - Rechtsklick auf den `kotlin` Ordner in eurem Projekt und dann auf "New".
    - Nun "Kotlin Class/File" auswählen und einen passenden Namen finden.
    - Als Letztes darunter **"File"** auswählen und mit "Enter"-Taste bestätigen.


---

<details>
<summary> <b> Besucher </b> </summary>

- Erstelle eine neue Datei, in der du die Klasse `Besucher` schreibst
- Die Klasse soll folgende **Attribute** besitzen:
    - Das Alter
    - Der Name
- Ausserdem soll sie eine **Methode** besitzen, die den Namen des Besuchers zusammen mit einer Begrüßung auf der Konsole ausgibt
    - Die Ausgabe kann z.B. wie folgt aussehen: `Hallo, mein Name ist Jack Black!`

**TEST:**
Erstelle zum Testen der Klasse eine Instanz der Klasse in der Datei `Main.kt` und rufe ihre Methode auf


</details>

---

<details>
<summary><b>Tier</b></summary>

- Erstelle eine neue Datei, in der du die Klasse `Tier` schreibst
- Die Klasse soll folgende **Attribute** besitzen:
    - Name
    - Gewicht
    - Alter
    - Geschlecht
- Und folgende **Methoden**:
    - bewegung(): Ein Tier kann sich bewegen. Dabei wird in der Konsole ausgegeben, dass sich das Tier bewegt hat.
    - geraeuscheMachen(): Ein Tier kann Geräusche machen. Dabei wird in der Konsole ausgegeben, dass das Tier Geräusche gemacht hat. Die Methode hierfür ist überschreibbar.
    - streicheln(): Ein Tier kann gestreichelt werden. Die Methode hierfür erhält als Parameter einen Besucher. In der Konsole wird dann ausgegeben, welches Tier von welchem Besucher gestreichelt wurde.
    - fuettern(): Ein Tier kann von einem Besucher gefüttert werden. Die Methode hierfür erhält als Parameter einen Besucher. In der Konsole wird dann ausgegeben, welches Tier von welchem Besucher gefüttert wurde. Zusätzlich erhöht sich das Gewicht des Tieres um 2%.


**TEST:**
Erstelle zum Testen der Klasse eine Instanz dieser in der Datei `Main.kt` und rufe ihre Methoden auf

</details>

---

<details>
<summary><b>Schaf</b></summary>

- Erstelle eine neue Datei, in der du die Klasse schreibst
- Die Klasse `Schaf` erbt von der Klasse `Tier`
- Die Klasse soll folgende **Attribute** besitzen:
    - Name
    - Gewicht
    - Alter
    - Geschlecht
    - WolleSauber
- Und folgende **Methoden**:
    - Die Klasse soll die Funktion, geraeuscheMachen() der Mutterklasse überschreiben und "määäh" auf der Konsole ausgeben
    - baden(): Diese Funktion soll die Wolle des Schafes sauber machen
    - fuettern()
    - streicheln()
    - bewegung()

**TEST:**
Erstelle zum Testen der Klasse eine Instanz dieser in der Datei `Main.kt` und rufe ihre Methoden auf

<details>
<summary>Hinweis</summary>

Achte darauf, welche Attribute bereits von der Mutterklasse an die Kindklasse vererbt werden

</details>


</details>


---

<details>
<summary><b>Kuh</b></summary>

- Erstelle eine neue Datei, in der du die Klasse schreibst
- Die Klasse `Kuh` erbt von der Klasse `Tier`
- Die Klasse soll folgende **Attribute** besitzen:
    - Name
    - Gewicht
    - Alter
    - Geschlecht
    - gibtMilch: Kuh gibt Milch, wenn sie min. 3 Jahre alt und weiblich ist
      -> schreibe für diese eine **sekundären Konstruktor**
- Und folgende **Methoden**:
    - Die Klasse soll die Funktion, geraeuscheMachen() der Mutterklasse überschreiben und "Muuuuhh" auf der Konsole ausgibt
    - Eine Funktion melken(), bekommt einen Besucher übergeben und gibt auf der Konsole aus, ob die Kuh Milch gibt oder nicht
    - fuettern()
    - streicheln()
    - bewegung()

**TEST:**
Erstelle zum Testen der Klasse eine Instanz dieser in der Datei `Main.kt` und rufe alle ihre Methoden auf



<details>
<summary>Hinweis</summary>

- Achte darauf, welche Methoden und Attribute bereits von der Mutterklasse an die Kindklasse vererbt werden

</details>


</details>

---

<details>
<summary><b>Huhn</b></summary>

- Erstelle eine neue Datei, in der du die Klasse schreibst
- Die Klasse `Huhn` erbt von der Klasse `Tier`
- Die Klasse soll folgende **Attribute** besitzen:
    - Name
    - Gewicht
    - Alter
    - Geschlecht
    - AnzahlEierProTag: dieses Attribut soll nur bei Bedarf initialisiert werden und soll ansonsten aals Variable mit 0 intialisiert werden.
      Falls das Huhn männlich ist, soll die AnzahlEierProTag immer 0 sein.
- Und folgende **Methoden**:
    - Die Klasse soll die Funktion, geraeuscheMachen() der Mutterklasse überschreiben und "ga-gack" auf der Konsole ausgeben
    - fuettern()
    - streicheln()
    - bewegung()

**TEST:**
Erstelle zum Testen der Klasse eine Instanz dieser in der Datei `Main.kt` und rufe alle ihre Methoden und gebe auch die
Anzahl der Eier pro Tag aus


<details>
<summary>Hinweis</summary>

- Achte darauf, welche Methoden und Attribute bereits von der Mutterklasse an die Kindklasse vererbt werden.
- **Nutze für AnzahlEierProTag den sekundären Konstruktor!**

</details>

</details>


---

<details>
<summary><b>Pony</b></summary>

- Erstelle eine neue Datei, in der du die Klasse schreibst
- Die Klasse `Pony` erbt von der Klasse `Tier`
- Die Klasse soll folgende **Attribute** besitzen:
    - Name
    - Gewicht
    - Alter
    - Geschlecht
    - geschwindigkeit
- Und folgende **Methoden**:
    - Die Klasse soll die Funktion, geraeuscheMachen() der Mutterklasse überschreiben und "Wiehhiehie" auf der Konsole ausgibt
    - fuettern() soll überschrieben werden. Sodass, das Pony sich entscheiden kann, ob es lieber Zucker oder eine Karotte will.
      Diese Entscheidung soll random sein und es soll auf der Konsole ausgegeben werden, welcher Besucher das Pony womit gefüttert hat.
    - streicheln()
    - bewegung()
    - Die Funktion reiten() soll einem Besucher erlauben auf dem Pony zu reiten, wenn das Pony älter als 1 Jahr ist und der Besucher min. 6 Jahre alt ist.
      In jedem Fall soll die Funktion eine passende Meldung mit der geschwindigkeit ausgeben.


**TEST:**
Erstelle zum Testen der Klasse eine Instanz dieser in der Datei `Main.kt` und rufe alle ihre Methoden auf


<details>
<summary>Hinweis</summary>

Achte darauf, welche Methoden und Attribute bereits von der Mutterklasse an die Kindklasse vererbt werden!


</details>


</details>

---

<details>
<summary><b>Streichelzoo</b></summary>



Jetzt erstellen wir unseren Streichelzoo. Dazu erstellst du eine Klasse mit dem Namen **Streichelzoo**.

Die Klasse hat eine Eigenschaft, eine List vom Typ Tier. In dieser Liste werden alle Tiere aufbewahrt.
Die Liste wird in der Klasse initialisiert mit min. folgenden Tieren:
- 2 Schafe
- 2 Hühner
- 1 Kuh
- 2 Ponys

Außerdem hat der Streichelzoo eine MutableList, die die Besucher im Streichelzoo darstellt.
Es können nur maximal 5 Besucher gleichzeitig im Streichelzoo sein und diese ist bei der Initialisierung immer leer.

folgende Methoden werden für das Besuchermanagement benötigt:
- neuerBesucher(): der Besucher stellt sich innerhalb dieser Methode vor und wird eingelassen, falls weniger als 5 Besucher bisher
  im Streichelzoo sind. Die Funktion gibt eine passende Nachricht auf der Konsole aus
- exit(): Der Besucher will denn Streichelzoo verlassen, wodurch ein neuer Platz in diesem frei wird.

Der Streichelzoo bietet verschiedene Interaktionen an.

-  tiereUndIhreGeräusche(): Die Tiere freuen sich immer, wenn ein Besucher den Streichelzoo betritt. Dann machen alle Tiere Geräusche.
   Verwende eine Schleife, um alle Tiergeräusche auszugeben und rufe sie an passender Stelle in der Datei auf,
   sodass die Tiere immer Geräusche machen, wenn ein neuer Besucher eintritt. Diese Methode soll nicht von außerhalb aufgerufen werden können.
-  rennen(): Der Zoo bietet ein Rennen zwischen zwei Ponys an. Schreibe eine Methode, bei der zwei Ponys als Parameter übergeben werden
   und das schnellere der zwei in der Konsole als Gewinner ausgegeben wird.


**TEST:**
Erstelle zum Testen der Klasse eine Instanz dieser in der Datei `Main.kt` und rufe alle ihre Methoden auf


</details>

---

<details>
<summary><b>Ein Tag im Streichelzoo</b></summary>

Erstellt eine Datei Tag.kt mit einer woche06.Tag05.musterloesungen.main()-Funktion. Erstelle zusätzlich min. 6 Besucher


Lass die Besucher den Tagesablauf durchführen und benutze, wenn immer möglich, eine Schleife:

1. Jeder der Besucher versucht in den Streichelzoo zu gehen.
4. Alle Besucher wollen zuerst auf einem der Ponys reiten.
5. Ein Besucher füttert das Schaf.
5. Eines der Hühner läuft durchs Gehege.
6. Ein paar Besucher streicheln die Kuh
7. 2 Besucher verlassend den Streichelzoo
9. Ein Besucher versucht die Kuh zu melken.
11. Fütterungszeit. Ein Besucher füttert alle Tiere
13. Ein Zoowärter kontrolliert alle Schafe, ob sie sauber sind. Wäscht die dreckigen.
14. Zuletzt haben die beiden Ponys ein Rennen.
15.  Die restlichen Besucher verlassen den Zoo

</details>

---

<details>
<summary><b>Bonusaufgabe</b></summary>

Unser heutiges Projekt sollte euch als Inspiration dienen, selbstständig weiteren Code zum Üben zu programmieren.

Statt weiteren Bonusaufgaben gibt es also Vorschläge für weitere Features, die ihr freiwillig noch im Projekt einbauen könnt.

Sie sind offen geschrieben, es gibt also viele Lösungsmöglichkeiten. Versuche sie so gut wie möglich umzusetzen.

1. **Futterbeutel**

- Um Tiere zu füttern, brauchen wir natürlich Futter. Erstelle einen Futterbeutel. Der Beutel enthält Futter, angegeben in Gramm. Jeder Besucher hat einen Futterbeutel. Der Besucher kann jetzt das Futter zum Füttern verwenden. Dabei steigt das Gewicht des Tieres, je nachdem wie viel Futter verfüttert wurde. Das verfütterte Futter verschwindet natürlich aus dem Futterbeutel.

- Der Besucher kann den Futterbeutel an einer Kasse wieder auffüllen. Dafür muss der Besucher Geld bezahlen. Erweitere die Besucher-Klasse, sodass ein Besucher nun auch Geld mit sich trägt. Das Startgeld kann zu Beginn zufällig zugewiesen werden.

2. **Fütterung**

- Jedes Tier mag anderes Futter. Erstelle verschiedene Sorten an Futter. Bei der Kasse kann der Besucher sie zu unterschiedlichen Preisen kaufen und im Futterbeutel aufbewahrt werden.

- Die Kasse hat auch ein Infoblatt. In dem Infoblatt steht, welches Tier welches Futter mag. Die Tiere sind jetzt auch wählerisch und fressen kein Futter, das sie nicht mögen.

3. **Patenschaft**

- An der Kasse gibt es die Möglichkeit, eine Patenschaft mit einem Tier einzugehen.

Im Infoblatt ist aufgelistet, welches Tier wie viel kostet.

Zusätzlich wird an der Kasse aufgelistet, welches Tier welche Besucher als Paten hat.

</details>

---

# Grundlagen der Programmierung

## Break und Continue

### Beschreibung:
In den folgenden Aufgaben wird das Wissen über Schleifen vertieft.
Zudem werden die Schlüsselwörter `break` und `continue` verwendet.  
`break` dient dazu, Schleifen frühzeitig abzubrechen, man "bricht" aus ihnen heraus.  
`continue` dient dazu, einen Schleifendurchlauf überspringen zu können.

### Hinweise zur Bearbeitung:
- Lies erst die ganze Aufgabenstellung, bevor du die Aufgabe bearbeitest.
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Nutze den Debugger, wenn du nicht mehr weiter weißt.
- Achte darauf deinen Code sinnvoll zu kommentieren.

---

### Aufgabe 1 - Break

<details>

> In dieser Aufgabe ist die Konstante `numbers` vorgegeben, diese muss nicht angepasst werden.

Schreibe eine Schleife, welche jedes Element der Liste auf der Konsole ausgibt.
Wenn das Element `42` ist, soll auf der Konsole zusätzlich `Zahl gefunden` ausgegeben werden.
Breche daraufhin die Schleife ab.

Am Ende sollte auf der Konsole also folgendes stehen:
```
62  
34  
364  
235  
57  
68  
2  
325  
6
42
Zahl gefunden
```

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *Break.kt*

</details>

---

### Aufgabe 2 - Continue

<details>

> In dieser Aufgabe ist die Konstante `numbers` vorgegeben, diese muss nicht angepasst werden.

Schreibe eine Schleife, welche jedes Element der Liste auf der Konsole ausgibt.
Sollte das Element jedoch `42` sein, so soll das Element **nicht** auf der Konsole ausgegeben werden.
Nutze hierfür das Schlüsselwort `continue`.

Am Ende sollte auf der Konsole also folgendes stehen:
```
34  
235  
24  
7346  
34
```

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *Continue.kt*


</details>

---

### Aufgabe 3 - While-Schleife

<details>

Erstelle eine Funktion, welche als Parameter eine Liste und eine Zahl übergeben bekommt.
Die Funktion soll mittels *While-Schleife* die Werte in der Liste mit der gegebenen Zahl multiplizieren.
Am Ende soll die Funktion die multiplizierte Liste wieder zurückgegeben.

> In der `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` ist schon eine Liste namens `numbers` gegeben, diese kannst du verwenden, um deine Funktion zu testen.

Sollte man die Liste `numbers` und `3` in die Funktion geben, so sollte auf der Konsole folgendes stehen.
(Der print Befehl sollte in der `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` stehen)

```
[75.0, 99.9, 150.0, 300.0]
```

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *WhileSchleife.kt*

</details>

---

### Aufgabe 4 - Waschtag

<details>

Wir haben einen Haufen an T-Shirts, die wir waschen wollen.
Dazu müssen wir die T-Shirts erstmal nach Farbe sortieren.
Die zu waschenden T-Shirts sind in der Liste `shirts` gespeichert.

Schreibe eine Schleife deiner Wahl, die die Liste an T-Shirts durchgeht.  
Wenn die Farbe Rot ist, füge das T-Shirt der Liste redShirts hinzu.
Wenn die Farbe Blau ist, füge das T-Shirt der Liste blueShirts hinzu.  
Wie viele T-Shirts jeder Farbe gibt es?

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *Waschtag.kt*

</details>

---

### Aufgabe 5 - Summe

<details>

Wir kriegen von unserem Chef eine Liste mit Gebühren, die zu bezahlen sind.  
Er möchte wissen, wie viel er insgesamt zahlen muss.

Schreibe eine Funktion, die eine Liste mit Zahlen als Parameter bekommt,  
die Zahlen zusammen addiert und das Ergebnis wieder zurückgibt.

- Du darfst für deine Lösung nicht die `sum()` Funktion verwenden.
- Löse das Problem mit einer Schleife.

Deine Funktion stimmt, wenn du in etwa `5366.78` heraus bekommst,
solltest du deine Funktion auf die gegebene Liste `fees` anwenden.  
(Das Ergebnis kann sich von Computer zu Computer ein ganz kleines bisschen unterscheiden).

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *Gebuehren.kt*

</details>

---

### Aufgabe 6 - Das kleinste Element einer Liste

<details>

Schreibe eine Funktion, die eine Liste mit Zahlen als Parameter bekommt.  
Schreibe in der Funktion eine Schleife deiner Wahl, die über die Liste läuft
und die kleinste Zahl herausfindet.  
Anschließend soll die Funktion die kleinste Zahl zurückgeben und in der Konsole ausgeben.

- Du darfst für deine Lösung nicht die `min()` Funktion verwenden.
- Löse das Problem mit einer Schleife.

Wenn du deine Funktion auf die gegebene Liste `numbers`anwendest,
funktioniert sie, wenn du `24` heraus bekommst.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *KleinsteElement.kt*

</details>

---

### Aufgabe 7: Jahreszeiten

<details>

> In dieser Aufgabe ist eine Liste `monate` mit allen 12 Monaten gegeben, welche nicht angepasst werden soll.

**A)**  
Schreibe eine Funktion, welche einen Monat als Parameter erhält und die Jahreszeit für den Monat zurückgibt.

Die Monate sind dabei so auf die Jahreszeiten verteilt:

- Winter:
    - Dezember, Januar, Februar
- Frühling:
    - März, April, Mai
- Sommer:
    - Juni, Juli, August
- Herbst:
    - September, Oktober, November

D.h. wenn die Funktion den Monat "April" als Parameter bekommt,  
soll die Funktion die Jahreszeit "Frühling" zurückgeben.

---

**B)**

Schreibe in der `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` eine Schleife,
die alle Monate mit ihrer Jahreszeit in der Konsole ausgibt.

In der Konsole sollte dann folgendes ausgegeben werden:

```
Der Januar ist im Winter
Der Februar ist im Winter
Der März ist im Frühling
...
Der Dezember ist im Winter
```

---

**C)**

Schreibe eine Schleife deiner Wahl, die nur die Sommermonate in der Konsole ausgibt.

---

**D)**

Schreibe eine Schleife deiner Wahl, die alle Monate außer den Juni und den September ausgibt.

---

**E)**

Schreibe eine Schleife deiner Wahl, die ab dem März jeden zweiten Monat ausgibt.

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *Jahreszeiten.kt*

</details>

---

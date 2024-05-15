package woche03.Tag01VoidFunktionen


/*

## Aufgabe 1: Begrüßungsfunktion
Erstelle eine Funktion namens `greet()`, die eine einfache Begrüßungsnachricht auf der Konsole ausgibt. Rufe diese Funktion in der `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` auf.

## Aufgabe 2: Tag und Nacht
Implementiere eine Funktion `dayOrNight()`, die abhängig von der aktuellen Uhrzeit entweder "Guten Morgen!", "Guten Tag!" oder "Gute Nacht!" ausgibt. Entscheide hier selbst, ob `if-else` oder `when` am Besten geeignet ist.  Rufe diese Funktion in der `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` auf.

**Tipp:** Die aktuelle, auf die Stunde genaue Uhrzeit kannst du mit dem Befehl `java.time.LocalTime.now().hour` als `Int` in eine Variable speichern und zum Bedingungen prüfen nutzen.


## Aufgabe 3: Ein einfacher Taschenrechner
Erstelle mit Hilfe von `when` eine Funktion namens `performCalculation()`, die je nach Nutzereingabe zwei von dir festgelegte Zahlen addiert, subtrahiert, multipliziert oder dividiert.
Gib das Ergebnis und welche Operation gewählt wurde auf der Konsole aus.  Rufe diese Funktion in der `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` auf.

## Aufgabe 4: Temperaturumrechnung
Schreibe eine Funktion `convertTemperature()`, die eine von dir angelegte Temperatur von Celsius in Fahrenheit umrechnet und das Ergebnis ausgibt und rufe sie in `woche06.Tag03Vererbung.musterloesungen.Aufgabe5.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe6.src.woche06.Tag03Vererbung.musterloesungen.Aufgabe7.src.woche04.Tag05Wiederholung.musterloesungen.woche03.Tag04Dokumentation.musterloesungen.Aufgabe3.src.main()` auf. Recherchiere selbst, wie die Formel zur Umrechnung lautet

## Aufgabe 5: Wochenende oder nicht?
Implementiere eine Funktion `isWeekend()`, die anhand des aktuellen Wochentags (Montag, Dienstag, etc.) ausgibt, ob Wochenende ist oder nicht. Verwende dazu eine `when`-Anweisung.

**Tipp:** mit `LocalDate.now().dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault())` kannst du den aktuellen Wochentag (Vorsicht: auf englisch! Beachte das in deinem Code) in einen `String` speichern.



## Aufgabe 6: Sternchen drucken
Erstelle eine Funktion `printStars()`, die mit Hilfe der `repeat()`-Funktion 13 Sternchen (*)
- a) in einer Zeile
- b) in 13 Zeilen

ausgibt.

Ob eine oder mehrere Zeilen gedruckt werden, soll der User per Input entscheiden können.

 */
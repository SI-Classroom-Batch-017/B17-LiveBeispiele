package woche07.Tag04und05Rundenablauf

class PseudocodeBattleSystem {


    /*
        // Helden Initialisieren
        knight = Knight("Knight", 100.0),
        sorcerer
        paladin
        //EndGegner Initialisieren
        demon

        // Listen von Helden und Feinden
        heldenListe = Liste von (knight, sorcerer, paladin)
        feindListe = mutableListe von Feind(demon) erstmal nur Demon hinzufügen

        fireElemental(UnterBoss) deklarieren aber nicht initialisieren, z.B mit private lateinit var.
        beutel initialisieren

        //FUNKTION playRound
        playRound() {
            rundenAnzahl = 1

            Solange das Spiel nicht zu Ende ist {
                println("Kampfrunde $rundenAnzahl")

                Wenn Demon mehr als die Hälfte der HP hat {

                    für jeden held in heldenListe {
                        Helden greifen Demon an
                    }
                    removeDeadEnemy()
                    println("Demon hat X HP übrig...")
                    // Demon greift heldenListe zufällig an
                    removeDeadHero()

                    // Wenn Dämon weniger als die Hälfte der HP hat
                       fireElemental beschwören, wenn noch nicht vorhanden (keine Instance von Fire Elemental existiert) {
                        fireElemental initialisieren
                        add fireElemental in der feindListe
                        println("FireElemental wurde beschworen!")
                    }


                    für jeden held in heldenListe {
                       Helden greifen zufälligen Feind an // Demon oder FireElemental
                    }
                    removeDeadEnemy()


                    // Demon greift an, wenn noch am Leben HP > 0.0 {
                         Demon greift heldenListe zufällig an
                        removeDeadHero()
                    }


                    // FireElemental greift an, wenn noch am Leben HP > 0.0 {
                        Fire Elemental greift heldenListe zufällig an
                        removeDeadHero()
                    }
                    println("Demon hat Y HP übrig")
                    println("Fire Elemental hat Y} HP übrig")
                }
                rundenAnzahl++
                beutel.resetBeutelRunde()
            }
            println("Kampf beendet!")
        }

        // Tote Helden entfernen
      FUNKTION removeDeadHero() {

    Für jeden Helden in der Liste der Helden
    für jeden Held in heldenListe {
         Überprüfe, ob der Held noch lebt (basierend auf seiner HP <= 0.0)
        wenn (Held noch lebt) {
            Füge den lebenden Held zur Liste der lebenden Helden hinzu
        } sonst {
             Gib eine Meldung aus, dass der Held tot ist
            drucke("Held: {Name des Helden} ist jetzt tot!!!")
        }
    }

     Aktualisiere die Liste der Helden mit den lebenden Helden
    aktualisiere heldenListe mit lebendeHelden
}





        // Tote Feinde entfernen
        FUNKTION removeDeadEnemy() {
     Finde alle Feinde mit HP kleiner oder gleich 0
    toteFeinde = feindListe mit Feinden deren HP <= 0.0 ist

     Für jeden toten Feind in der Liste
    für jeden Feind in toteFeinde {
        Entferne den Feind aus der Feindliste
        entferne Feind von feindListe
         Gib eine Nachricht aus, dass der Feind tot ist
        drucke("Feind: {Name des Feindes} ist jetzt tot!!!")
    }
}





        // Spielende Überprüfung
        FUNKTION endGameCheck(): Boolean {

             Wenn keine Helden oder Feinde mehr in der Liste da sind {
                return true
            }

        Wenn alle Helden oder alle Feinde tot sind Lebenspunkte <= 0.0 {
                return true
            }

            return false
        }
 */
}
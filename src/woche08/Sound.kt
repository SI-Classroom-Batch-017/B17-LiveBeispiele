package woche08

import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl


fun main() {

    // pfad zu den sound dateien in string speichern
    val intro: String = "src/woche08/audio/intro.wav"
    val magic: String = "src/woche08/audio/magic.wav"
    val kentaur: String = "src/woche08/audio/kentaurSound.wav"
    val sword: String = "src/woche08/audio/sword.wav"

    playSound(magic)
    Thread.sleep(3000)
    playSound(kentaur) // wird sofort nach der Zeile davor also fast gleichzeitig abgespielt
    Thread.sleep(4000)
    playSound(sword)
    // Sound bricht sofort ab, da Programm in der nächsten Zeile schon beendet ist, brauchen heir Thread.sleep. Braucht ihr in eurem spiel nicht, da es ja ziemlich lange weiterläuft
    Thread.sleep(20000)
}


fun playSound(audioPath: String) {
    // Erstelle eine Datei (File) aus dem angegebenen Dateipfad
    val audio: File = File(audioPath)

    // Hier wird die audio in das Audiosystem gepackt
    val audioInput: AudioInputStream = AudioSystem.getAudioInputStream(audio)


    // es wird ein Clip-Objekt erstellt um den Sound abzuspielen
    val clip: Clip = AudioSystem.getClip()

    // clip öffnen, audio laden
    clip.open(audioInput)


    // Starte die Wiedergabe des Sounds
    clip.start()

    // Volume Control:
    // FloatControl steuert Audios (zB Lautstärke)
    // MASTER_GAIN ist eine spezielle Art von FloatControl, die die Lautstärke eines Audio-Clips regelt
    if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)){
        val lautstärke: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl
        // weiterer Code zur Steuerund der Lautstärke
        // 0.99f = fast das maximum, 1.0f wäre das maximum, 0.0f wäre das minimum also kein ton
        lautstärke.value = lautstärke.minimum+(0.99f*(lautstärke.maximum-lautstärke.minimum))
    } else {
        println("Master gain control wird nicht unterstuetzt, wir konnten die Lautstärke so nicht beeinflussen...")
    }

}
fun main() {
    println("---Kundenlogin---")
    val username = "Reisender13"
    val correctPassword = 7777

    println("Bitte gib deinen Benutzernamen ein:")
    val inputUsername = readln()

    if (inputUsername == username) {
        println("Bitte gib dein Passwort ein (4-stellige PIN):")
        val inputPassword = readln()

        try {
            val password = inputPassword.toInt()
            if (password == correctPassword) {
                println("Erfolgreich eingeloggt! Willkommen im Reisebüro.")
            } else {
                println("Richtiger Benutzername, falsches Passwort. Probiere es erneut.")
            }
        } catch (e: NumberFormatException) {
            println("Das Passwort muss eine 4-stellige PIN bestehend aus nur Zahlen sein. Probiere es erneut.")
        }
    } else {
        println("Benutzername falsch. Probiere es erneut.")
    }
}
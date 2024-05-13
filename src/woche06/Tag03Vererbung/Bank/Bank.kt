package woche06.Tag03Vererbung.Bank

class Bank(var jahresZins: Double) {

    var register: MutableMap<Int,Konto> = mutableMapOf(
        0 to Konto("Dagobert Duck", 99999.99,"9999"),
        1 to Konto("Donald Duck"),
        2 to Konto("Daisy Duck",200.00),
        3 to Konto ("Tick Duck"),
        4 to Konto ("Trick Duck"),
        5 to Konto ("Track Duck")
    )

    fun kontoEroeffnen(name: String){
        register.put(6,Konto(name))
    }


}

fun main() {
    var konto1: Konto = Konto("Dagobert Duck", 99999.99,"9999")
    println("----")
    var konto2: Konto = Konto("Donald Duck")
    println("----")
    var konto3: Konto = Konto("Daisy Duck",200.00)
    println("----")

    println(konto3.pin)
    konto3.pinAendern()
    println(konto3.pin)

    var bank: Bank = Bank(3.0)
    bank.register.put(0, konto1)
    bank.register[1] = konto2
    bank.register.put(2,konto3)

    println(bank.register)
    bank.kontoEroeffnen("Gluck Gans")
    println(bank.register)





}
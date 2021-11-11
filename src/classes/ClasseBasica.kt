package classes

class Cliente {
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "João"

    println("O cliente é ${cliente.nome}")

}
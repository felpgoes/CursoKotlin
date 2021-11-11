package classes
var desconto: Double = 0.0
class ItemDePedido(val nome: String, val preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        // @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV 50", 2890.90)
    val item2 = ItemDePedido("Liquidificador", 200.0)
    desconto = 0.10

    println("Com desconto - Item1: ${item1.precoComDesconto()}, Item2: ${item2.precoComDesconto()}")
}
package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Caderno", 21.90),
    Produto("Lápis", 11.90),
    Produto("Borracha", 0.70),
    Produto("Apontado", 1.80)
)

fun main() {
    val totalizar = {total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é ${precoTotal / materialEscolar.size}")
}
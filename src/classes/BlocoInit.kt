package classes

class Filme3 (nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.genero = genero
        this.anoLancamento = anoLancamento
    }
}

fun main() {
    val filme = Filme3("Os Incriveis", 2004, "Ação")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}
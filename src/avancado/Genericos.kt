package avancado

class Caixa <T>(val objeto: T) {
    private val objetos = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjecto: T){
        objetos.add(novoObjecto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar = Caixa("Caneta")

    materialEscolar.adicionar("Lapis")
    materialEscolar.adicionar("Borracha")
    println(materialEscolar)

    val numeros = Caixa(1)
    numeros.adicionar(3)
    println(numeros)
}
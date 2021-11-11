package funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>() // Iniciar array vazio

    for(e in lista) if (filtro(e)) listaFiltrada.add(e)

    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main() {
    val nome = listOf("Felipe", "Ana", "Lia", "Joao")
    println(filtrar(nome, ::comTresLetras))
}
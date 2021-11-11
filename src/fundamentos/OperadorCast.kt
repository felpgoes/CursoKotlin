package fundamentos

fun imprimirConceito(nota: Any) {
    when (nota as? Int) { // casting seguro com a ? no as
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Invalido")
    }
}

fun main() {
    val notas = arrayListOf(9.6, 1.2, 4.5, 8.7, 6.0)
    for (nota in notas) imprimirConceito(nota.toInt())
}






package fundamentos.controle

fun main() {
    val nota = 2

    when(nota) {
        10, 9 -> println("10, 9")
        8, 7 -> println("7, 8")
        6, 5, 4 -> println("4, 6")
        in 0..3 -> println("in 0 e 3")
        else -> println("invalido")
    }
}
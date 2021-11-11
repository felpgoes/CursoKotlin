package avancado

fun fatorial(num: Long): Long {

    val result = when(num) {
        in 0..1 -> 1
        in 2..Long.MAX_VALUE -> num * fatorial(num - 1)
        else -> throw IllegalArgumentException("Número negativo")
    }
    println("Para $num - resultado: $result")
    return result
}


fun main() {
    println("Resultado: ${fatorial(60)}")
}

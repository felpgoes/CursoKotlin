package lambdas

fun main() {
    val soma = { x: Int, y: Int -> x + y }
    println(soma(4, 6))
}
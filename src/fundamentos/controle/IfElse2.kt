package fundamentos.controle

fun main() {
    val num1: Int = 7
    val num2: Int = 3

    // normal syntax
    val maiorValor = if (num1 > num2) {
        println("processando...")
        num1
    } else {
        println("processando...")
        num2
    }

    // short syntax
    val menorValor = if (num1 > num2) num2 else num1

    println("O maior valor é $maiorValor e o menor é $menorValor")
}
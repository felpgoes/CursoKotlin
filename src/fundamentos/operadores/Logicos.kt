package fundamentos.operadores

fun main() {
    val executouTrabalho1: Boolean = false
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println("comprouSorvete = $comprouSorvete")
    println("comprouTv50 = $comprouTv50")
    println("comprouTv32 = $comprouTv32")
}
package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no method $nomeFuncao")
    try {
        return funcao()
    } finally {
      println("Método $nomeFuncao finalizado")
    }
}

fun somar2(a: Int, b: Int): Int = a + b

fun main() {
    val resultado = executarComLog("somar") {
        somar2(4, 5)
    }

    println(resultado)
}
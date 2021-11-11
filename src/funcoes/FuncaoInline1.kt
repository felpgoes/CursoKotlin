package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}

fun main() {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
        println("Executando SQL 4...")
    }
}
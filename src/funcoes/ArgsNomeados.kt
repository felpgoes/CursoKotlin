package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe"
}

fun main() {
    println(relacaoDeTrabalho("Felipe", "Teste"))
    println(relacaoDeTrabalho(funcionario = "Teste", chefe = "Felipe"))
}
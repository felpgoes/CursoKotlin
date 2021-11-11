package fundamentos.controle

fun main() {
    val alunos = arrayListOf("Felipe1", "Felipe2", "Felipe3")

    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}
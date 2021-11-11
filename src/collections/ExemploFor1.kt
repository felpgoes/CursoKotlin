package collections

fun main() {
    val alunos = arrayListOf("Amanda", "André", "Bernado", "Carlos")
    for (aluno in alunos) println(aluno)

    for ((indice, aluno) in alunos.withIndex()) println("$indice - $aluno")
}
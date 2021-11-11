package lambdas

fun main() {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.uppercase() }.apply { println("this -> $this") }

    val result = alunos.map { it.uppercase() }
    println("result -> $result")
}
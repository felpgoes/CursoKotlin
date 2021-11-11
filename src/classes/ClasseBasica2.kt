package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) { // parametro que não faz parte da classe (não é acessivel)
    val nome: String = nomeInicial
}

fun main() {
    val p1 = Pessoa1("João")
    p1.nome = "Felipe"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3("Pedro")
    println("${p2.nome} e ${p3.nome} são legais!")
}
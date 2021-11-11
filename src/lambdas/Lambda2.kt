package lambdas

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicacao: Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main() {
    val calculadora = Calculadora()
    val res1 = calculadora.calcular(3, 4)
    val res2 = calculadora.calcular(3, 4, Multiplicacao())

    val subtracao = {a: Int, b: Int -> a - b}
    val res3 = calculadora.calcular(3, 4,subtracao)

    println("res1: $res1, res2: $res2, res3: $res3")
}
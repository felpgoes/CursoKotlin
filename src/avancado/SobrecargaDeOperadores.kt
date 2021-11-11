package avancado

data class Ponto(val x: Int, val y: Int) {
    operator fun plus(other: Ponto): Ponto = Ponto(x + other.x, y + other.y)
    operator fun unaryMinus(): Ponto = Ponto(-x, -y)
}

fun main() {
    val p1 = Ponto(10, 20)
    val p2 = Ponto(10, 20)

    println(-p1)
    println(p1 + p2)
}
package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main() {
    val p1 = Produto("Ipod", 2349.00)
    val p2 = Produto("Iphone", 9999.99)
    println(p1 maisCaroQue p2)
    println(p2.maisCaroQue(p1))
}
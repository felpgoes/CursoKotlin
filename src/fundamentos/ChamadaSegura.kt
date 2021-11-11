package fundamentos

fun main() {
    val a: Int? = null // ? no tipo é o safe call operator
    println(a?.dec())
}
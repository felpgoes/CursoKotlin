package fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc())

    println("Momento do erro...")
    println(a!!.inc()) // forçando a chamada de um method que pode ser null
}
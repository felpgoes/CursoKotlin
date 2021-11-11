package fundamentos.controle

fun main() {
    val nota: Double = 1.3

    // range operator
    if (nota in 9.0..10.0){
        println("entre 9 e 10")
    } else if (nota in 7.0..8.9) {
        println("entre 7 e 8")
    } else if (nota in 4.0..6.9) {
        println("entre 4 e 6")
    } else if (nota in 0.0..3.9) {
        println("entre 0 e 3")
    } else {
        println("Invalido")
    }

    println(5 in 7..4)
    println(5 in 4..7)
}
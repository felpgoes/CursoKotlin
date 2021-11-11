package fundamentos

fun main() {
    val valor: Any = 1

    if(valor is String)
        println(valor)
    else if (valor !is String) // ! antes de is
        println("Não é String")
}
package collections

fun main() {
    val numeros = Array<Int>(10) {i -> i * 10}

    for (num in numeros) println(num)

    println(numeros.get(1))
    println(numeros.size)
    numeros.set(1, 1234)
    println(numeros[1])
    numeros[1] = 2345
    println(numeros[1])

}

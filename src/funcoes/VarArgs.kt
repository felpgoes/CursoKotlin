package funcoes

fun ordernar(vararg numeros: Int, a: Int): IntArray {
    println("A = $a")
    return numeros.sortedArray()
}

fun main() {
    for(n in ordernar(321,3,12,9,123,12,1,1235,2,54, a = 9999)) print("$n ")
}
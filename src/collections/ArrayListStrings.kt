package collections

fun main() {
    var strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for (item in strings) {
        println(item.uppercase())
    }
}
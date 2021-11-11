package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("Marca = $marca e Modelo = $modelo")

//    val (tipo, nome) = listOf("Caminhão", "Scania")
//    println("Caminhão = $tipo e Scania = $nome")
//
//    val (_, _, terceiroLugar) = listOf("Hamilton", "Massa", "Alonso")
//    println("Terceiro = $terceiroLugar")
}
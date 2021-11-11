package fundamentos.controle

fun main() {
    var opcao: Int = 0

    while (opcao != -1) {
        val line = readLine()
        opcao = line?.toIntOrNull() ?: 0

        println("Vc escolheu a opcao $opcao")
    }
    println("flw")
}
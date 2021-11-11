package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nasc: Data = Data(4 ,2, 2000)
    println("${nasc.dia}/${nasc.mes}/${nasc.ano}")
    with(nasc){ println("$dia/$mes/$ano")}

    nasc.mes = 10
    println(nasc.formatar())
}
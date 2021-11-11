package fundamentos

fun main() {
    // Tipos Númericos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_901_312_123_123_123 // Long.MAX_VALUE

    // Tipos Númericos Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    // Tipos de Caractere
    val char: Char = '?'

    // Tipo Booleano
    val boolean: Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(12312312312 is Long)
    println(1.0 is Double)

    // Tudo é Objeto
    println(10.dec())

}
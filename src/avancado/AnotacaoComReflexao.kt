package avancado

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String) {
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String = nome
}

// Reflection...
fun getValor(obj: Any, nomeDoAtributo: String): Any {
    val atributo = obj.javaClass.getDeclaredField((nomeDoAtributo))
    val estaAcessivel = atributo.canAccess(obj)

    atributo.isAccessible = true
    val valor = atributo.get(obj)
    atributo.isAccessible = estaAcessivel

    return valor
}

fun validar(obj: Any): List<String> {
    val msgs = ArrayList<String>()
    obj::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val valor = getValor(obj, member.name)
            when (annotation) {
                is Positivo ->
                    if (valor !is Int || valor <= 0) msgs.add("O valor '$valor' não é um número positivo!")
                is NaoVazio ->
                    if (valor !is String || valor.trim().isEmpty()) msgs.add("O valor '$valor' não é um string válida!")
            }
        }
    }

    return msgs
}

fun main() {
    val obj1 = Pessoa(1, "Chico")
    println(validar(obj1))

    val obj2 = Pessoa(-1, "     ")
    println(validar(obj2))
}
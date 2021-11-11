package collections

fun main() {
    val map = HashMap<Long, String>()

    map.put(12312312310, "João")
    map.put(12312312320, "Maria")
    map.put(12312312330, "Pedro")

    map.put(12312312330, "Pedro Filho")

    for (par in map) println(par)

    for (par in map.values) println(par)
    for (par in map.keys) println(par)

    for ((cpf, nome) in map) println("$nome - CPF: $cpf")

    map.size.print()
    map.get(12312312310)?.print()
    map[12312312310]?.print()
    map.contains(12312312310).print()
    map.remove(12312312310)?.print()
    map.clear()
    map.isEmpty().print()
}
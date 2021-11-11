package collections

fun main() {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(3) não aceita outro tipo

    println("--- Sem ordem ---")
    aprovados.forEach { it.print() }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\n--- Linked ---")
    aprovadosNaOrdem1.forEach { it.print() }

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\n--- Sorted ---")
    aprovadosNaOrdem2.forEach { it.print() }

    println("\n--- Ordem manual ---")
    val aprovadosNaOrdem3 = aprovados.sortedBy { it.substring(1) }
    aprovadosNaOrdem3.forEach { it.print() }
}
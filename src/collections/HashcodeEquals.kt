package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Objeto) nome.equals(other.nome, ignoreCase = true) else false
    }
}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."),
        Objeto("Mesa", "..."),
        Objeto("Faca", "..."),
        Objeto("Copo", "...")
    )

    conjunto.contains(Objeto("faca", "???")).print()
}
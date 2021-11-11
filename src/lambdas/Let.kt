package lambdas

fun main() {
    val listaWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)
    for (item in listaWithNulls) item?.let { println(it)}
}
package fundamentos.controle

fun main() {
    extern@for(i in 1..15) {
        for (j in 1..15) {
            println("i = $i e j = $j")
            if (i == 2 && j == 9) break@extern
        }
    }
    println("Fim!")
}
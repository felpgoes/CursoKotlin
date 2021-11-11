package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    var local = "Fulado!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        var local: Int = 7
        if (local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}
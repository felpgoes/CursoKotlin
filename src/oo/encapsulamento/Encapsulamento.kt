package oo.encapsulamento

import collections.print

private val destroDoArquivo = 1
//protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
val publico = 1

private fun destroDoArquivo() = 1
//protected fun protegidoNaoSuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
fun publico() = 1

open class Capsula {
    private val dentroDoObj = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProject = 1
    val publico = 1

    private fun dentroDoObj() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProject() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula() {
    fun verificaAcesso() {
        println(Capsula().dentroDoProject())
//        println(Capsula().vaiPorHeranca)
        println(vaiPorHeranca)
        println(dentroDoProject)
        println(publico)
    }
}

fun verificarAcesso() {
//    println(Capsula().vaiPorHeranca)
//    println(vaiPorHeranca)
//    println(dentroDoProject)
    println(Capsula().dentroDoProject)
    println(publico)
}
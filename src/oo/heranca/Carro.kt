package oo.heranca

open class Carro(val velMax: Int = 200, var velAtual: Int = 0) {
    protected fun alterarVelocidadeEm(velocidade: Int){
        val novaVel = velAtual + velocidade
        velAtual = when(novaVel){
            in 0..velMax -> novaVel
            in velMax + 1..Int.MAX_VALUE ->velMax
            else -> 0
        }
    }

    open fun acelerar(){
        alterarVelocidadeEm(5)
    }

    open fun frear(){
        alterarVelocidadeEm(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é $velAtual Km/h."
    }
}
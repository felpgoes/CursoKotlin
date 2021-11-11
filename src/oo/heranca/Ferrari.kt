package oo.heranca

class Ferrari: Carro(velMax = 350), Esportivo {
    override var turbo: Boolean = false

    override fun acelerar() {
        alterarVelocidadeEm(if(turbo) 50 else 25)
    }

    override fun frear() {
        alterarVelocidadeEm(-25)
    }
}
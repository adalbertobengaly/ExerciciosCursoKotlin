package oo.heranca

open class Carro (val velocidadeMedia: Int = 200, var velocidadeAtual: Int = 0) {
    protected fun alterarVelocidadeEm(velocidade: Int) {
        val novaVelocidade = velocidadeAtual + velocidade
        velocidadeAtual = when(novaVelocidade) {
            in 0..velocidadeMedia -> novaVelocidade
            in velocidadeMedia + 1..Int.MAX_VALUE -> velocidadeMedia
            else -> 0
        }
    }

    open fun acelerar() {
        alterarVelocidadeEm(5)
    }

    open fun frear() {
        alterarVelocidadeEm(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é $velocidadeAtual Km/h."
    }
}
package oo.heranca

interface Esportivo { // Interface serve para definir métodos mesmo que não tenha implementação
    // fun teste(): Int // Quem for herdar a classe será obrigado a definir uma função de mesmo nome e retorno
    var turbo: Boolean

    fun ligarTurbo() {
        turbo = true
    }

    fun desligarTurbo() {
        turbo = false
    }
}
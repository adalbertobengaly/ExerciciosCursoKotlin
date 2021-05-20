package classes

class Calculadora {
    private var resultado: Int = 0 // private torna a variável privada, ou seja, pertencente apenas a classe

    fun somar(vararg valores: Int): Calculadora { // "vararg" permite que receba vários parâmetros
        valores.forEach { resultado += it }
        return this // retorna o valor do objeto
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main() {
    val calculadora = Calculadora() // quando instânciamos um objeto em Kotlin não precisamos utilizar a palavra "new"
    calculadora.somar(1, 2, 3).multiplicar(3).print()
    calculadora.somar(7, 10).print().limpar()

    println(calculadora.obterResultado())
}
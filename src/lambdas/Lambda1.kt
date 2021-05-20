package lambdas

// Lambdas são funções anônimas nativas da linguagem

fun main() {
    val soma = { x: Int, y: Int ->
        x + y
        "texto" // é retornado o que está na última linha
    }
    println(soma( 4, 6))
}
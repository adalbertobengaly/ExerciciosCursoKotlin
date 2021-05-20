package fundamentos.operadores

fun main() {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete = executouTrabalho1 || executouTrabalho2
    val comprouTv50 = executouTrabalho1 && executouTrabalho2
    val comprouTv32 = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    // Operador Unário
    if(!comprouSorvete) {
        println("A saúde agradece!")
    }
}

// Pag 54 da apostila
package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando trasação...")
    }
}

fun main() {
    transacao {
        println("Executando SQL1...")
        println("Executando SQL2...")
        println("Executando SQL3...")
    }
}
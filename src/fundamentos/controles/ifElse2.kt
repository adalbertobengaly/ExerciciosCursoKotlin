package fundamentos.controles

fun main() {
    val num1: Int = 7
    val num2: Int = 3

    // val maiorValor = if (num1 > num2) else num2
    val maiorValor = if (num1 > num2) {
        println("Processando if...")
        num1
    } else {
        println("Processando else...")
        num2
    }

    println("O maior valor é $maiorValor.")
}
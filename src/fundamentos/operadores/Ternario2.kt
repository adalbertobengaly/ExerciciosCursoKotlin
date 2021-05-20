package fundamentos.operadores

fun obterResultado (nota: Double): String = if(nota >= 7.0) "Passou" else "Reprovado"

fun main() {
    println(obterResultado(6.3))
}
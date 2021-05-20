package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Bernado", "William", "Andreia", "Caio")
    val ordenados = nomes.sortedBy{ it.reversed() }

    println(ordenados)
}
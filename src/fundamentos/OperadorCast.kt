package fundamentos

fun imprimirConceito(nota: Any) {
    when(nota as? Int) { // ? pode dar nulo
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota Inválida")
    }
}

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        imprimirConceito(nota.toInt())
    }
}
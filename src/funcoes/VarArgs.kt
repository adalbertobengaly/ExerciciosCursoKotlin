package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray { // vararg para quando tiver um argumento variável
    println(a)
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73, a = 1)) {
        print("$n ")
    }
}
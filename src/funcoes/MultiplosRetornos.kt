package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto: Int, val seg: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND)) // with é uma Função Inline
    }
}

fun main() {
    val (h, m, s) = agora() // Operador Destructuring
    println("$h:$m:$s")
}
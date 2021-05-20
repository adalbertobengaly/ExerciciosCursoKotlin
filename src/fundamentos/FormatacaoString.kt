package fundamentos

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val teste = 1.3 / 100
    val result = BigDecimal(teste).setScale(3, RoundingMode.HALF_EVEN)
    println(teste)
    println(result)
    println(String.format("%.3f", result))
    println(String.format("%.3f", result).replace(',', '.'))
    println("%.3f".format(teste))
}
package lambdas

data class Casa(var endereço: String = "", var num: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereço = "Rua ABC"
        num = 1544
    }

    println(casa)
}
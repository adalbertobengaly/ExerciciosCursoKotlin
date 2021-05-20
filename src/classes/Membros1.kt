package classes

class Data (var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(dia = 10, mes = 11, ano = 2003)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) { println("$dia/$mes/$ano")}

    nascimento.dia = 11
    println(nascimento.formatar())
}
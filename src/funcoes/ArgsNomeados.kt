package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) a $chefe."
}

fun main() {
    println(relacaoDeTrabalho("Davi", "João"))
    println(relacaoDeTrabalho(funcionario = "Davi", chefe = "João"))
}
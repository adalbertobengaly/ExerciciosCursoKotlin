package classes

class Cliente {
    var nome: String = "" // Definimos um atributo variável dentro da classe
}

fun main() {
    val cliente = Cliente() // Instaciamos um objeto a partir da classe // A instância foi atribuída a uma constante
    cliente.nome = "João" // Alteramos o nome do cliente
    print("O cliente é ${cliente.nome}")
}

// Cliente() -> construtor
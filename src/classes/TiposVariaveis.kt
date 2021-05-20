package classes

val diretamenteNoArquivo = "Bom Dia"

fun topLevel() {
    val local = "Fulano!"
    println("$diretamenteNoArquivo $local")
}

class Coisa {
    var variavelDeInstancia: String = "Boa Noite" // Variável de instância é uma variável que pertence ao objeto

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano" //
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}


/* Existem dois tipos de variáveis ou constantes que se pode declarar dentro de uma classe :
      * variáveis de classe que são variáveis que são compartilhadas por todos os objetos e tem apenas
      um único valor compartilhado entre eles.
      *  variável de instância significa que para a cada novo objeto criado aquela variável
        terá uma cópia independente e podemos mexer de forma independente nos valores que pertença
        a cada um dos objetos.
*/
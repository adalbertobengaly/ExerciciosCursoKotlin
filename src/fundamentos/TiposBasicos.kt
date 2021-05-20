package fundamentos

fun main() {
    // Tipos Numéricos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647 // Underline pode ser usado para delimitar
    val num4: Long = 9_223_372_036_854_775_807 // = Long.MAX_VALUE

    // Tipos Numéricos Reais
    val num5: Float = 3.4F // Mesmo tamanho do Int
    val num6: Double = 3.14

    // Tipo Caractere
    val char: Char = '?'  // Outros exemplos... 'l', 'g', ' '

    // Tipo Booleano
    val boolean: Boolean = true // ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(2147483648 is Long)
    println(1.0 is Double)

    // Tudo é objeto
    println(10.dec())
}
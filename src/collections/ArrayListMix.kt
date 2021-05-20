package collections

fun main() {
    val listMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    for (item in listMix) {
        if(item is String) {
            println(item.toUpperCase())
        } else {
            println(item)
        }
    }
}
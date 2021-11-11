package collections

fun main() {
    val listMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    for (item in listMix){
        if (item is String) { // smart cast
            println(item.uppercase())
        } else {
            println(item)
        }
    }
}
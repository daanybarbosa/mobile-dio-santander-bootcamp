package one.digitalinnovation.collections

fun main(){
    //Criar um array sem mencionar a capacidade
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("----------------------")
    values.forEach {
        println(it)
    }

    println("----------------------")
    values.sort() //ordernar os valores do array
    values.forEach {
        println(it)
    }
}
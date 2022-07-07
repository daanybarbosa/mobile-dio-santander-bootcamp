package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5) //IntArray(tamanho do array)
    values[0] = 1 //array na posicao 0
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("------------------------")
    for(valor in values){
        println(valor)
    }

    println("------------------------")
    values.forEach {
        println(it)
    }

    println("------------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("------------------------")
    //interar sobre os indices do array
    for(index in values.indices){
        println(values[index]) //ira exibir o valor que está presente em cada indice
    }

    println("------------------------")
    values.sort() // ira ordenar os valores do array - maior para o menor
    for(valor in values){
        println(valor)
    }
}
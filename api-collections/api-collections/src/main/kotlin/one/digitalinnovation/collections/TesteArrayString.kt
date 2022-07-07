package one.digitalinnovation.collections

fun main(){
    val nomes = Array<String>(3) { "" }
    nomes[0] = "Maria"
    nomes[1] = "Zezé"
    nomes[2] = "Jose"

    println("----------------------")
    for(nome in nomes){
        println(nome)
    }

    println("----------------------")
    nomes.sort() //ordernar o conteudo do array
    nomes.forEach {
        println(it)
    }

    println("----------------------")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}
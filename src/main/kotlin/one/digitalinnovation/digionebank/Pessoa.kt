package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniele"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val daniele = Pessoa()

    println(daniele.nome)
    println(daniele.cpf)
}
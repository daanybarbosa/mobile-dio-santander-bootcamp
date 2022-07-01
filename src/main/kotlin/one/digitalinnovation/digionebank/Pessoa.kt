package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniele"
    var cpf: String = "123.123.123-12"

    private set //modificador de visibilidade - apenas o set (atribuidor) será privado.
    constructor() //construtor secundário
    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val daniele = Pessoa()
    println(daniele.pessoaInfo())
}
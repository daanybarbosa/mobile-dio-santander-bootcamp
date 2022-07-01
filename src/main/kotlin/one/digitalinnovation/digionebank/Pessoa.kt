package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniele"
    var cpf: String = "123.123.123-12"

    //private var cpf: String = "123.123.123-12" //colocando o private direto na propriedade , torna o set e get privados
    private set //modificador de visibilidade - apenas o set (modificador) será privado.
}

fun main(){
    val daniele = Pessoa()
    //daniele.cpf = "1234" //set - setando as informações

    println(daniele) //referencia do objeto em memoria
    println(daniele.nome) //get - pegando as informações
    println(daniele.cpf)
}
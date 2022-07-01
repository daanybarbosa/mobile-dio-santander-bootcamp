package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniele"
    var cpf: String = "123.123.123-12"

    /* Exemplo de inner class
    inner class Endereco {
        var rua: String = "Rua teste"
    }
    */
}

fun main(){
    val daniele = Pessoa()

    println(daniele.nome)
    println(daniele.cpf)

    //println(daniele.Endereco().rua) //Exemplo de inner class
}
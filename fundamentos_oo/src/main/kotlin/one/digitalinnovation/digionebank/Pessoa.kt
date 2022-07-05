package one.digitalinnovation.digionebank

abstract class Pessoa(
    val nome: String,
    val cpf: String
)

/*
// Exemplo 2
// open (classe aberta) - para possibilitar que a classe Funcionario possa herdar as propriedades da classe Pessoa
open class Pessoa(
    open val nome: String,
    open val cpf: String
)
 */

/*
// Exemplo 1
class Pessoa {
    var nome: String = "Daniele"
    var cpf: String = "123.123.123-12"

    private set //modificador de visibilidade - apenas o set (atribuidor) será privado.
    constructor() //construtor secundário
    fun pessoaInfo() = "$nome e $cpf"
}
 */
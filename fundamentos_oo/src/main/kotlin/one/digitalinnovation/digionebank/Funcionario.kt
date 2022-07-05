package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
     nome: String, //override -> ira sobreescrever a classe Pessoa
     cpf: String,
     val salario: BigDecimal
) : Pessoa(nome, cpf) {
     abstract fun calculoAuxilio():
}

/*
// Exemplo 1
class Funcionario(
     override val nome: String, //override -> ira sobreescrever a classe Pessoa
     override val cpf: String,
     val salario: BigDecimal
) : Pessoa(nome, cpf) {}
 */

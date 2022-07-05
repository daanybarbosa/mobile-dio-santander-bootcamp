package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val daniele = Pessoa("Daniele", "123.456.789-0")
    //println(daniele.pessoaInfo())
    println(daniele.nome)
    println(daniele.cpf)

    val bruno = Funcionario("Bruno", "123.456.789-0", BigDecimal.valueOf(2000.00))
    println(bruno.nome)
    println(bruno.cpf)
    println(bruno.salario)

}
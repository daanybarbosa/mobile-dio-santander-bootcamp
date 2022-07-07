package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista("João Pedro", "123.456.789-0", 2000.0)
    // println(joao.nome)
    // println(joao.cpf)
    // println(joao.salario)

    //imprimeRelatorio(joao)
    ImprimeRelatorioFuncionario.imprime(joao)
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
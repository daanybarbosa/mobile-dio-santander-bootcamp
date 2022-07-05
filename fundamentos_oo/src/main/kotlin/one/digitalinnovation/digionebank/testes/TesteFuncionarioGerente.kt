package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "123.456.789-0", 5000.00)
    //imprimeRelatorio(maria)
    imprimeRelatorioFuncionario.imprime(maria)
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
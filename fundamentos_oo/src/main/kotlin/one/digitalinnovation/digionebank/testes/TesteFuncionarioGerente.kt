package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "123.456.789-0", 5000.00, "senha123")
    //imprimeRelatorio(maria)
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria) //se a senha estiver correta, ira exibir true, caso esteja incorreta, ira exibir false
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
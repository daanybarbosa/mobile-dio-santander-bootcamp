package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    //val digiOneBank = Banco("DigiOne", 12)
    val digiOneBank = Banco(nome = "DigiOne", numero = 12) //argumentos nomeados

    //digiOneBank.nome = "DigiTwo" //alterando a variavel para var, é possivel altera-la

    println(digiOneBank.nome);
    println(digiOneBank.numero);

    val banco2 = digiOneBank.copy(nome = "Banco2", numero = 2)

    println(banco2.info());
}
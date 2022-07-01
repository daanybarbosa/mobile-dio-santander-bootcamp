package one.digitalinnovation.digionebank

import java.math.BigDecimal

//construtor primario
class Conta(
    val agencia: String,
    val numeroConta: String,
    val saldo: BigDecimal
) {
    //construtor - propriedades
    fun deposito(valor: BigDecimal){}

    fun saque(valor: BigDecimal){}
}
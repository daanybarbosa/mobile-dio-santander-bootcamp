package one.digitalinnovation.digionebank

data class Banco(
    //propriedades
    val nome: String,
    //var nome: String,
    val numero: Int
){
    fun info() = "$nome - $numero"
}

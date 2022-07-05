package one.digitalinnovation.digionebank

enum class ClienteTipo(val descricao: String) {
    // Objeto(tipo)
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");

    /*
    //Função estatica
    companion object{
        fun printDescricao() = ClienteTipo.des
    }
     */
}
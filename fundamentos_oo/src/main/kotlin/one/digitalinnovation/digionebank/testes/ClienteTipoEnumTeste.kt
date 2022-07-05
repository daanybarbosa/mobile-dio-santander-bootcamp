package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("Exemplo 1 - ${elemento.name} - ${elemento.toString()}")
        println("Exemplo 1 - ${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("Exemplo 2 - ${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("PF - ${pf.name}, ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("PJ - ${pj.name}, ${pj.descricao}")
}

package br.com

import br.com.questoes.questao1
import br.com.questoes.questao2
import br.com.questoes.questao4

fun main() {
    println("==========")

    println("SOMA = ${questao1()}")

    println("==========")

    val numero = 5
    if (questao2(numero)) {
        println("O $numero faz parte do Fibonacci")
    } else {
        println("O $numero não faz parte do Fibonacci")
    }

    println("==========")

    println("==========")

    println("Escolha uma opção: ")
    println("SP")
    println("RJ")
    println("MG")
    println("ES")
    println("Outros")
    val opcao = readln()

    questao4(opcao)

    println("==========")
}
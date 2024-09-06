package br.com

import br.com.questoes.*

fun main() {
    println("==========")
    // Mostrar soma
    println("SOMA = ${questao1()}")

    println("==========")
    // Verificar o número que o usuário inseriu está na sequencia
    println("Coloque o número: ")
    val numero = readln().toInt()
    if (questao2(numero)) {
        println("O $numero faz parte do Fibonacci")
    } else {
        println("O $numero não faz parte do Fibonacci")
    }

    println("==========")

    questao3()

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

    println("Digite a string que deseja inverter: ")
    val inputString = readln()

    // Chama a função para inverter a string
    val stringInvertida = questao5(inputString)

    // Exibe o resultado
    println("String invertida: $stringInvertida")
}
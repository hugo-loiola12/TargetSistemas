package br.com.questoes

fun questao2(numero: Int): Boolean {

    // Verifica se o número é negativo
    if (numero < 0) return false

    var a = 0
    var b = 1

    // Verifica se o número é 0 ou 1
    if (numero == a || numero == b) return true

    // Gera a sequência de Fibonacci até encontrar o número ou ultrapassá-lo
    while (b < numero) {
        val temp = b
        b = a + b
        a = temp
    }

    // Retorna true se o número encontrado na sequência for igual ao número fornecido
    return b == numero

}
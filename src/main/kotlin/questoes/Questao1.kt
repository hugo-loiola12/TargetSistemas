package br.com.questoes

fun questao1(): Int {
    val indice = 13
    var soma = 0
    var k = 0

    while (k < indice) {
        k += 1
        soma += k
    }

    return soma
}
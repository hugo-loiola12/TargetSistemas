package br.com.questoes

fun questao5(str: String): String {
    var stringInvertida = ""

    // Percorre a string de trás para frente e constrói a string invertida
    for (i in str.length - 1 downTo 0) {
        stringInvertida += str[i]
    }

    return stringInvertida
}
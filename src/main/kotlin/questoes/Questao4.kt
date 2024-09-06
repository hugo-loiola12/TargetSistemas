package br.com.questoes

fun questao4(estado: String) {
    val sp = 67836.43
    val rj = 36678.66
    val mg = 29229.88
    val es = 27165.48
    val outros = 19849.53

    val soma = sp + rj + mg + es + outros

    val porcentagem = when (val estado = estado.lowercase()) {
        "sp" -> "O estado de ${estado.uppercase()} representa: ${"%.2f".format((sp / soma) * 100)}% do valor mensal"
        "rj" -> "O estado de ${estado.uppercase()} representa: ${"%.2f".format((rj / soma) * 100)}% do valor mensal"
        "mg" -> "O estado de ${estado.uppercase()} representa: ${"%.2f".format((mg / soma) * 100)}% do valor mensal"
        "es" -> "O estado de ${estado.uppercase()} representa: ${"%.2f".format((es / soma) * 100)}% do valor mensal"
        "outros" -> "Outros estados representam: ${"%.2f".format((outros / soma) * 100)}% do valor mensal"
        else -> "ERRO, escolha um estado válido."
    }
    println(porcentagem)

}


package br.com.questoes

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

data class DiaValor(val dia: Int, val valor: Double)


fun questao3() {
    val caminhoJson = "src/main/dados.json"
    val json = File(caminhoJson).readText()

    // Usando Gson para converter o JSON em uma lista de objetos
    val gson = Gson()
    val itemType = object : TypeToken<List<DiaValor>>() {}.type
    val lista: List<DiaValor> = gson.fromJson(json, itemType)

    // Operações com os dados
    val somaValores = lista.sumOf { it.valor }
    val mediaValores = lista.filter { it.valor > 0 }.map { it.valor }.average()
    val valorMaximo = lista.maxByOrNull { it.valor }?.valor
    val diasSemValor = lista.filter { it.valor == 0.0 }

    println("Soma dos valores: $somaValores")
    println("Média dos valores (desconsiderando 0): $mediaValores")
    println("Valor máximo: $valorMaximo")
    println("Dias sem valor: ${diasSemValor.map { it.dia }}")
}

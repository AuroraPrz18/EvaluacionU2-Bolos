// Instituto Tecnologico Superior del Sur de Guanajuato
// Aurora Perez Calderon - S19120121
fun main(args: Array<String>) {
    // Entradas correctas
    val drawsCase1 = listOf(1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6)
    println("Tiradas: ${drawsCase1}")
    println("Score total: ${getScoreFromDraws(drawsCase1)}") // Se espera = 133

    val drawsCase2 = listOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    println("Tiradas: ${drawsCase2}")
    println("Score total: ${getScoreFromDraws(drawsCase2)}") // Se espera = 300

    val drawsCase3 = listOf(5, 5, 4, 5, 8, 2, 10, 0, 10, 10, 6, 2, 10, 4, 6, 10, 10, 10)
    println("Tiradas: ${drawsCase3}")
    println("Score total: ${getScoreFromDraws(drawsCase3)}") // Se espera = 179

    val drawsCase4 = listOf(5, 5, 4, 0, 8, 1, 10, 0, 10, 10, 10, 10, 4, 6, 10, 10, 5)
    println("Tiradas: ${drawsCase4}")
    println("Score total: ${getScoreFromDraws(drawsCase4)}") // Se espera = 186

    val drawsCase5 = listOf(5, 5, 4, 0, 8, 1, 10, 0, 10, 10, 10, 10, 4, 6, 10, 3, 5)
    println("Tiradas: ${drawsCase5}")
    println("Score total: ${getScoreFromDraws(drawsCase5)}") // Se espera = 179

    val drawsCase6 = listOf(3, 5, 0, 0, 1, 9, 8, 2, 10, 1, 5, 9, 0, 6, 2, 3, 7, 7, 3, 1)
    println("Tiradas: ${drawsCase6}")
    println("Score total: ${getScoreFromDraws(drawsCase6)}") // Se espera = 113

    val drawsCase7 = listOf(3, 5, 0, 0, 1, 9, 8, 2, 10, 1, 5, 9, 0, 6, 2, 3, 7, 2, 3)
    println("Tiradas: ${drawsCase7}")
    println("Score total: ${getScoreFromDraws(drawsCase7)}") // Se espera = 102

    // Entradas incorrectas
    // Caso donde no hay valores suficientes
    val drawsWrongCase1 = listOf(1, 4, 4, 5, 6, 4, 5, 5, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6)
    println("Tiradas: ${drawsWrongCase1}")
    val resul = getScoreFromDraws(drawsWrongCase1)
    println("Score total: "+ if(resul == ERROR) "ERROR, entrada incompleta" else resul) // Se espera = -10000 -> Entrada incompleta
    // Caso donde hay valores de más
    val drawsWrongCase2 = listOf(5, 5, 4, 0, 8, 1, 10, 0, 10, 10, 10, 10, 4, 6, 10, 3, 5, 1, 2, 3)
    println("Tiradas: ${drawsWrongCase2}")
    val resul2 = getScoreFromDraws(drawsWrongCase2)
    println("Score total: "+ if(resul2 == ERROR) "ERROR, entrada con valores de mas" else resul2) // Se espera = -10000 -> Entrada incorrecta
    // Caso donde la suma de frames es mayor a 10
    val drawsWrongCase3 = listOf(5, 5, 4, 7, 8, 2, 10, 0, 10, 10, 6, 2, 10, 4, 6, 10, 10, 10)
    println("Tiradas: ${drawsWrongCase3}")
    val resul3 = getScoreFromDraws(drawsWrongCase3)
    println("Score total: "+ if(resul3 == ERROR) "ERROR, entrada incorrecta" else resul3) // Se espera = -10000 -> Entrada incorrecta
}
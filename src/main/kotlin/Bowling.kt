const val OPEN = "Open"
const val SPARE = "Spare"
const val STRIKE = "Strike"
const val NA = "NA"
const val ERROR = -10000

fun getScoreFromDraws(draws: List<Int>): Int{
    return try {
        val resul = getScoreFromFrame(0, draws, 1, NA)
        return if(resul < 0 ) return ERROR else return resul
    } catch (e: ArrayIndexOutOfBoundsException) {
        return ERROR;
    }
}

fun getScoreFromFrame(frameStartPos: Int, draws: List<Int>, frameNumber: Int, lastDraw: String): Int{
    if(frameNumber>10){
        //println("${frameStartPos} ${draws.size-1}");
        if(frameStartPos == draws.size-1 && lastDraw==SPARE) return 0;
        if(frameStartPos+1 == draws.size-1 && lastDraw==STRIKE) return 0;
        if(frameStartPos >= draws.size && lastDraw==OPEN) return 0;
        return ERROR
    };
    //println(frameStartPos)
    var scoreDraw = draws[frameStartPos];
    return when(scoreDraw){
        in 0..9 -> {
            val score = draws[frameStartPos] + draws[frameStartPos+1]
            when(score){
                in 0..9 -> score + getScoreFromFrame(frameStartPos + 2, draws, frameNumber+1, OPEN)
                10 -> spare(frameStartPos, draws) + getScoreFromFrame(frameStartPos + 2, draws, frameNumber+1, SPARE)
                else -> ERROR
            }
        }
        10 -> strike(frameStartPos, draws) + getScoreFromFrame(frameStartPos + 1, draws, frameNumber+1, STRIKE)
        else-> ERROR
    }
}

fun spare(frameStartPos: Int, draws: List<Int>) = draws[frameStartPos] + draws[frameStartPos+1] + draws[frameStartPos+2]

fun strike(frameStartPos: Int, draws: List<Int>) = 10 + draws[frameStartPos+1] + draws[frameStartPos+2]
fun plusMinus(arr: Array<Int>): Unit {
    val arrSize = arr.size
    var positiveNums = 0
    var negativeNums = 0
    var zeros = 0
    for(item in arr){
        if(item > 0){
            positiveNums++
        }else if(item < 0){
            negativeNums++
        }else{
            zeros++
        }
    }
    val posRatio = (positiveNums.toDouble() / arrSize)
    var negRatio = negativeNums.toDouble() / arrSize
    var zerosRatio = zeros.toDouble() / arrSize
    println(posRatio)
    println(negRatio)
    println(zerosRatio)

}
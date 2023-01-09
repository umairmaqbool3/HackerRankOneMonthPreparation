fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var firstDiagnal:Int = 0
    var secondDiagnal:Int = 0
    for (row in arr.indices) {
        firstDiagnal += arr[row][row]
        secondDiagnal += arr[row][arr.size - 1 -row]  
    }
    return abs(firstDiagnal - secondDiagnal)
}
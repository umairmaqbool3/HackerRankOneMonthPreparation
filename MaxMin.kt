fun maxMin(k: Int, arr: Array<Int>): Int {
    arr.sort()
    var min = Int.MAX_VALUE
    for (i in 0..arr.size - k) {
        val diff = arr[i + k - 1] - arr[i]
        if (diff < min) {
            min = diff
        }
    }
    return min

}
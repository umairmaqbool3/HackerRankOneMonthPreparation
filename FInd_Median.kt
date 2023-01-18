fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    var median: Int = 0;
    if(arr.size % 2 ==0){
        median = arr[arr.size/2] + arr[arr.size/2-1]/2
        return median
    }
    return arr[arr.size/2]

}
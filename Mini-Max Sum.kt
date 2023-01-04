fun miniMaxSum(arr: Array<Int>): Unit {
    var sumArr = ArrayList<Long>()
    for (index in arr.indices) {
        var suppArr = arr
            var sum: Long = 0
            for(check in suppArr.indices){
                if(!(index == check)){
                    sum = sum + suppArr[check].toLong()
                }
            }
            sumArr.add(sum)
    }
    sumArr.toList()
    print(sumArr.min())
    print(" ")
    print(sumArr.max())

}
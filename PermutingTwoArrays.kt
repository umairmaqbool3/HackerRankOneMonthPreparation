fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    A.sort()
    B.sortDescending()
    var retValue: String = ""
    for(index in A.indices){
        val sum = A[index] + B[index]
        if(sum >= k){
            retValue = "YES"
        }else{
            return "NO"
        }
    }
    return retValue
}
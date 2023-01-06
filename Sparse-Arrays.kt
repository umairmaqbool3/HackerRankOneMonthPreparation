fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    var resultArray = Array<Int>(queries.size,{0})
    var itemCount = 0
    for(q in queries.indices){
        for(sitem in strings){
            if(queries[q] == sitem){
                itemCount += 1
            }
        }
        resultArray[q] = itemCount
        itemCount = 0
    }
    return resultArray
}
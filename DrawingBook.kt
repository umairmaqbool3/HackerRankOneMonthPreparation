fun pageCount(n: Int, p: Int): Int {
    var frontTurn = p/2
    var backTurn = if(n % 2 == 0) (n - p + 1) / 2 else (n - p) / 2
    return if(frontTurn > backTurn) backTurn else frontTurn
    // var pageTurnNum = 0
    // var pIsEven = if(p % 2 == 0) true else false
    // for(i in 1..n step 2){
    //     if(p == 1){
    //         return 0
    //     }
    //     if(pIsEven){
    //         if(p == i || p+1 == i || p == n-i){
    //             return pageTurnNum
    //         }
    //     }else{
    //         if(p == i || p-1 == i || p == n-i-1){
    //             return pageTurnNum
    //         }
    //     }
        
    //     pageTurnNum = pageTurnNum + 1
    // }
    // return pageTurnNum

}
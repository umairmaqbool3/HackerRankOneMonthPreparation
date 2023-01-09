fun lonelyinteger(a: Array<Int>): Int {
     var singleItem: Boolean = false
    var itemCount : Int = 0
    var singleExistingElement : Int = 0
   for(q in a){
       for(n in 0..a.size-1){
           if(q == a[n]){
               itemCount += 1 
           }
       }
       
       if(itemCount == 1){
            singleExistingElement = q
       }
       itemCount = 0
       }
       return singleExistingElement

}
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var pairs : Int = 0
    for(i in 0..ar.size-1){
        if(ar[i] > -1){
           val num = ar[i]
           for(item in ar.indices){
               if(ar[item] > -1){
                   if(item == i){
                       continue
                   }
                   if(ar[item] == num){
                       ar[item] = -1
                       pairs += 1
                       break
                   } 
               }
               
           } 
        }
       ar[i] = -1
    }
    return pairs

}
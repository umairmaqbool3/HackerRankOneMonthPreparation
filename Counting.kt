fun countingSort(arr: Array<Int>): Array<Int> {
    var freq: HashMap<Int, Int> = HashMap<Int, Int>();
    var a:Int=0;
    for (nums in 0..100) {
        a=nums;
        freq.put(a,0);
    } 
    //increase the value if the number exists 
    for(int element:arr){
        if(freq.containsKey(element)){
            freq.put(element, freq.get(element)+1);
        }
    }
    
    //add the value of hashmap to arraylist
    val numbers: Collection<Int>=freq.values();
     val countingSort1:ArrayList<Int>= ArrayList<Int>(numbers);
    
    return countingSort1;

}
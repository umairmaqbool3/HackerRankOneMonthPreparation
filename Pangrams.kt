fun pangrams(s: String): String {
    val CHARS = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val compareStr: String = s.toLowerCase()
    val removeSpaces: String = compareStr.replace(" ","")
    var checkExist : Boolean = true
    for(index in CHARS.indices){
        if(removeSpaces.contains(CHARS[index])){
            continue
        }
        checkExist = false
        break 
    }
    
    return if(checkExist) "pangram" else "not pangram"
}
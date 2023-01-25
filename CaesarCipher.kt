fun caesarCipher(s: String, k: Int): String {
    val alphabet:String = "abcdefghijklmnopqrstuvwxyz"
    val alphaCap:String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var result: String = ""
    for(i in s.indices){
        if(s[i] >= 'a' && s[i] <= 'z'){
            val pos = alphabet.indexOf(s[i]);
            val encryptPos = (k + pos) % 26;
            var getChar = alphabet.get(encryptPos)
            result += getChar
        }else if(s[i] >= 'A' && s[i] <= 'Z'){
            val pos = alphaCap.indexOf(s[i]);
            val encryptPos = (k + pos) % 26;
            var getChar = alphaCap.get(encryptPos)
            result += getChar
        }
        else{
            result += s[i]
        }
    }
    return result        

}
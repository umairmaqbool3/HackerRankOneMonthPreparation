fun timeConversion(s: String): String {
    var hour: Int = (s.substring(0, 2)).toInt()
   var timeDay: String = s.substring(8,10)
    if(timeDay.equals("AM"))
        {
            if(hour == 12)
                hour = 0;
        }
        else if(timeDay.equals("PM"))
        {
            if(hour != 12)
                hour += 12;
        }
   
   
//    println()
    return String.format("%02d%s", hour, s.substring(2, 8))

}
object Binary {
    fun toDecimal(s: String) : Int {        
        var result = 0.0
        s.reversed().forEachIndexed { i, c ->
            when (c) {
                '1' -> result += Math.pow(2.0, i.toDouble())
                '0' -> { }
                else -> return 0 
            }                
        }
        return result.toInt()
    }
}
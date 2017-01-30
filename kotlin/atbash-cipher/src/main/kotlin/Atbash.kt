object Atbash {
    private val nA = 'a'.toInt()
    private val nZ = 'z'.toInt()

    private fun cipher(c: Char) : Char {
        if (c.isDigit()) {
            return c
        }
        return (nA + nZ - c.toInt()).toChar()
    } 

    fun encode(s: String) : String {
        var r = ""
        var count = 0

        for (c in s) {
            if (c.isLetterOrDigit()) {
                r += cipher(c.toLowerCase())
                count += 1
                if (count % 5 == 0) r += ' '
            }            
        }        

        return r.trim()
    }

    fun decode(s: String) = s.filter { it != ' ' }.map { cipher(it) }.joinToString("")          
}
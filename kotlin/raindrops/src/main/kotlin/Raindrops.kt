object Raindrops {
    fun convert(n: Int) : String {
        var s = ""

        if (n % 3 == 0)
            s += "Pling"
        if (n % 5 == 0)
            s += "Plang"
        if (n % 7 == 0)
            s += "Plong"
        
        if (s.isEmpty())
            s = n.toString()

        return s
    }
}
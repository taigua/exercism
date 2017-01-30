object Hamming {
    fun compute(s1: String, s2: String) : Int {
        if (s1.length != s2.length) throw IllegalArgumentException()
        return s1.zip(s2).fold(0) { sum, p -> if (p.first != p.second) sum + 1 else sum }
    }
}
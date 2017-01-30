object Pangrams {
    fun isPangram(s: String) : Boolean {
        return s.toLowerCase().filter { it >= 'a' && it <= 'z' }
                .toSet().size == 26    
    }
}
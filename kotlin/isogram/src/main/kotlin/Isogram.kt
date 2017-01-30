object Isogram {
    fun isIsogram(s: String) : Boolean {
        val sentence = s.filter { it.isLetter() }
        return sentence.toLowerCase().toSet().size == sentence.length
    }
}
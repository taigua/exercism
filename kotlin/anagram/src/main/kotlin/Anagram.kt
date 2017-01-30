class Anagram(s: String) {
    private val word = s.toLowerCase()
    private val key = word.toList().sorted()
    
    fun match(list: List<String>) : List<String> = list.filter { isAnagram(it) }

    private fun isAnagram(s: String) : Boolean {
        val sl = s.toLowerCase()
        if (sl == word) return false
        return sl.toList().sorted() == key 
    }
}
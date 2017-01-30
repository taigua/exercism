object WordCount {
    fun phrase(words: String) : Map<String, Int> {
        val counts: MutableMap<String, Int> = mutableMapOf()
        words.split(Regex("[^a-zA-Z0-9']+")).forEach {
            val key = it.toLowerCase()
            if (!key.isEmpty()) counts[key] = counts.getOrElse(key) { 0 } + 1
        }

        return counts
    }
}
object ETL {
    fun transform(old: Map<Int, List<String>>) : Map<String, Int> {
        val new: MutableMap<String, Int> = mutableMapOf()
        old.forEach {
            it.value.forEach {
                letter -> new.put(letter.toLowerCase(), it.key)
            }
        }        
        return new
    }
}
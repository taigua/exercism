object Flattener {
    fun flatten(l: List<Any?>) : List<Any> {
        val result: MutableList<Any> = mutableListOf()
        flattenHelper(l, result)
        return result
    }

    private fun flattenHelper(l: List<Any?>, r: MutableList<Any>) {
        l.forEach {
            when (it) {
                null -> {}
                is List<*> -> flattenHelper(it, r)
                else -> r.add(it)
            }
        }
    }
    
}
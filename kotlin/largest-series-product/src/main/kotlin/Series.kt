class Series(s: String) {
    private var list: List<Int> = listOf()
    init {
        if (s.any { !it.isDigit() }) throw IllegalArgumentException()
        val base = '0'.toInt()
        list = s.map { it.toInt() - base } 
    }

    fun getLargestProduct(length: Int) : Long {
        if (length < 0 || length > list.size) throw IllegalArgumentException()

        var max = 0L
        for (i in (0..(list.size - length))) {
            val v = list.subList(i, i+length).fold(1L) { p, x -> p * x}
            if (v > max) max = v 
        }
        return max
    }
}
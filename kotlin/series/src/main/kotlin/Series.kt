object Series {
    fun slices(n: Int, s: String) = (0..(s.length - n)).map { digits(s.substring(it, it + n)) }

    private val base = '0'.toInt()
    private fun digits(str: String) = str.map {it.toInt() - base}
}
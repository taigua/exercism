class DNA(s: String) {
    val nucleotideCounts = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
    init {
        if (s.any { !isValidNucleotide(it) }) throw IllegalArgumentException()
        s.forEach {
            nucleotideCounts.set(it, nucleotideCounts.get(it)!! + 1)
        }
    }

    companion object {
        fun isValidNucleotide(c: Char) = when (c) {
            'A', 'C', 'G', 'T' -> true
            else -> false
        }
    }

    fun count(c: Char) : Int {
        if (!isValidNucleotide(c)) throw IllegalArgumentException()
        return nucleotideCounts.get(c)!!
    }
}
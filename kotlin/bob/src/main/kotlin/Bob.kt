object Bob {
    fun hey(s: String) : String {
        val s1 = s.trim()
        val s2 = s1.filter { it.isLetter() }
        return when {
            s1.isEmpty() -> "Fine. Be that way!"
            !s2.isEmpty() && s2.all { it.isUpperCase() } ->
                "Whoa, chill out!"
            s1.last() == '?' -> "Sure."
            else -> "Whatever."
        }
    }
}
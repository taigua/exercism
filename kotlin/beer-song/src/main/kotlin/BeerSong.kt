object BeerSong {

    val lyrics = verses(99, 0)

    fun verses(start: Int, end: Int) = start.downTo(end).map { verse(it) }.joinToString("\n")

    fun verse(n: Int) : String {
        if (n < 0 || n > 99) throw IllegalArgumentException()
        return "${wallFirst(n)}, ${beer(n)}.\n${takeBeer(n)}, ${wall((n + 99) % 100)}.\n"
    } 

    private fun wallFirst(n: Int) : String {
        val s = wall(n)
        return when (n) {
            0 -> s.capitalize()
            else -> s
        }
    }

    private fun wall(n: Int) = "${beer(n)} on the wall"

    private fun beer(n: Int) : String {
        val helper = { x: Int ->
            when (x) {
                0 -> "no more bottles"
                1 -> "1 bottle"
                else -> "$x bottles"
            }
        }

        return "${helper(n)} of beer"
    }

    private fun takeBeer(n: Int) = when (n) {
        0 -> "Go to the store and buy some more"
        1 -> "Take it down and pass it around"
        else -> "Take one down and pass it around"
    }
}
/**
 * Created by Corwin on 2017/2/1.
 */
object PascalsTriangle {
    private val triangle = mutableListOf(listOf(1))

    fun computeTriangle(n: Int) : List<List<Int>> {
        if (n < 0) throw IllegalArgumentException()
        if (n == 0) return emptyList()

        compute(n)

        return triangle.take(n)
    }

    private fun compute(n: Int) {
        while (triangle.size < n) {
            computeNextLevel()
        }
    }

    private fun computeNextLevel() {
        val previous = triangle.last()
        val l = mutableListOf(1)
        var i = 0
        while (i < previous.size - 1) {
            l.add(previous[i] + previous[i+1])
            i += 1
        }
        l.add(1)
        triangle.add(l)
    }
}
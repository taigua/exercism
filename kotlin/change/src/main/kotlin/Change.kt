/**
 * Created by Corwin on 2017/2/2.
 */
class Change(coins: Set<Int>) {
    private val coins = coins.toList()
    private val changes = mutableListOf<Int>()

    fun issue(n: Int) : List<Int> {
        if (n < 0 || coins.isEmpty() || n < coins.min()!!)
            throw IllegalArgumentException()
        if (n == 0)
            return listOf()

        makeChange(n)

        return changes.sorted()
    }

    // Translate from rubyquiz 154 {http://rubyquiz.com/quiz154.html}
    private fun makeChange(n: Int) {
        val parents = (0..n).map { -1 }.toMutableList()
        val workList = mutableListOf(Pair(0, 0))
        parents[0] = 0

        while (parents[n] < 0 && !workList.isEmpty()) {
            val base       = workList[0].first
            val startIndex = workList[0].second
            workList.removeAt(0)

            for (i in (startIndex..coins.size-1)) {
                val coin = coins[i]
                val total = base + coin
                if (total <= n && parents[total] < 0) {
                    parents[total] = base
                    workList.add(Pair(total, i))
                }
            }
        }

        var count = n
        while (count > 0) {
            val parent = parents[count]
            changes.add(count - parent)
            count = parent
        }
    }
}
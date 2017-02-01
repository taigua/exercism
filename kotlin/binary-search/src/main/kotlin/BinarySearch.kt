/**
 * Created by Corwin on 2017/2/1.
 */
object BinarySearch {
    fun <T: Comparable<T>>search(list: List<T>, target: T) : Int {
        if (list.sorted() != list)
            throw IllegalArgumentException()

        var hi = list.size - 1
        var lo = 0
        while (hi >= lo) {
            val guess = lo + (hi - lo) / 2
            if (list[guess] > target)
                hi = guess - 1
            else if (list[guess] < target)
                lo = guess + 1
            else
                return guess
        }
        return -1
    }
}
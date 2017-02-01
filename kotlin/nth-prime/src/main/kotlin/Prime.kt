/**
 * Created by Corwin on 2017/2/1.
 */

object Prime {
    private val primes = mutableListOf(2L)
    private val step = 1000

    fun nth(i: Int) : Long {
        if (i <= 0) {
            throw IllegalArgumentException()
        }

        var start = 3L
        while (primes.size < i) {
            sieve(start, step)
            start += 2 * step
        }

        return primes[i-1]
    }

    private fun sieve(start: Long, num: Int) {
        var numbers = (start..(start + num*2 - 1) step 2).toMutableList()
        sieveByPrimes(numbers)
        numbers = sieveBySelf(numbers)
        primes.addAll(numbers)
    }

    private fun sieveByPrimes(numbers: MutableList<Long>) {
        primes.forEach { p -> numbers.removeAll { it % p == 0L }}
    }

    private fun sieveBySelf(numbers: MutableList<Long>) : MutableList<Long> {
        if (numbers.size < 2) return numbers

        var sieveResult = numbers.toMutableList()
        var i = 0
        while (i < sieveResult.size) {
            val base = sieveResult[i]
            var numbersToSieve = sieveResult.toMutableList()
            numbersToSieve.removeAll { it > base && it % base == 0L }
            i += 1
            sieveResult = numbersToSieve
        }

        return sieveResult
    }

}
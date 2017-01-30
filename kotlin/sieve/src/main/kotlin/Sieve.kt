object Sieve {
    fun primesUpTo(n: Int) : List<Int> {
        val primes = mutableListOf<Int>()
        if (n >= 2) {
            val numbers = Array(n + 1) { true }
            numbers[0] = false
            numbers[1] = false
            val sqrtLimit = Math.sqrt(n.toDouble()).toInt()

            for (factor in 2..sqrtLimit) {
                if (numbers[factor]) {
                    for (multiple in (factor * factor)..n step factor) {
                        numbers[multiple] = false
                    }
                }
            }

            numbers.forEachIndexed { number, tag ->
                if (tag) primes.add(number)
            }
        }
        return primes
    }
}
/**
 * Created by Corwin on 2017/1/31.
 */
class Luhn(num: Long) {
    companion object {
        private fun digits(num: Long) : List<Int> {
            var n = num
            val digits: MutableList<Int> = mutableListOf()
            while (n != 0L) {
                digits.add((n % 10).toInt())
                n /= 10
            }
            return digits.toList()
        }

        private fun addends(num: Long) : List<Int> {
            return digits(num).mapIndexed { i, v ->
                if (i % 2 != 0) {
                    val temp = v * 2
                    if (temp > 9) temp - 9 else temp
                } else {
                    v
                }
            }
        }
    }

    val addends : List<Int> = Companion.addends(num).reversed()

    val checkDigit: Int = addends.last()

    val checksum: Int = addends.sum()

    val isValid: Boolean = checksum % 10 == 0

    val create: Long = num * 10 + (10 - Companion.addends(num * 10).sum() % 10) % 10

}
import java.math.BigInteger

object Hexadecimal {
    fun toDecimal(s: String) : Int {
        try {
            val i = BigInteger(s, 16)
            return i.toInt()
        } catch (e: NumberFormatException) {
            return 0
        }
    }
}
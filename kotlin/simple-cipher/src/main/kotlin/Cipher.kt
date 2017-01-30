import java.util.Random

class Cipher(key: String = genKey()) {
    companion object {
        private val KEY_LENGTH = 100
        private fun genKey() : String {
            val rand = Random()
            return (1..KEY_LENGTH).map {'a' + rand.nextInt(26)}.joinToString("")
        }
    }

    init {
        if (key.isEmpty() || !key.matches(Regex("[a-z]+")))
            throw IllegalArgumentException()
    }

    val key: String = key

    fun encode(input: String) = code(key, input, 1)
    fun decode(input: String) = code(key, input, -1)



    private fun mod(n: Int, m: Int) = ((n % m) + m) % m

    private fun code(key: String, text: String, sign: Int) : String {
        return text.toList().foldIndexed("") { i, output, letter ->
            val offset = sign * (key[mod(i, key.length)] - 'a')
            output + ('a' + mod(letter - 'a' + offset, 26))
        }
    }

}
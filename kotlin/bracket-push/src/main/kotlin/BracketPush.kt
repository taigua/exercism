/**
 * Created by Corwin on 2017/2/1.
 */
object BracketPush {

    fun isValid(str: String) : Boolean {
        val s = str.replace(Regex("[^\\p{Ps}\\p{Pe}]"), "")
        val l = mutableListOf<Char>()
        s.forEach {
            when {
                l.isEmpty() -> l.add(it)
                check(l.last(), it) -> l.removeAt(l.size - 1)
                else -> l.add(it)
            }

        }
        return l.isEmpty()
    }

    private fun check(l: Char, r: Char) : Boolean {
        return when {
            l == '(' && r == ')' -> true
            l == '{' && r == '}' -> true
            l == '[' && r == ']' -> true
            else -> false
        }
    }
}
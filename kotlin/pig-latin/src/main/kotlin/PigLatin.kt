/**
 * Created by Corwin on 2017/2/1.
 */
object PigLatin {
    private val rVowel = Regex("^([aeiou]|xr|yt)(.*)$")
    private val rConsonant = Regex("^([^aeiou]*qu|y|[^aeiou]+)(.*)$")

    fun translate(input: String) = input.trim().split(Regex("\\s+")).map { translateWord(it) }.joinToString(" ")

    private fun translateWord(input: String) : String {
        val mv = rVowel.matchEntire(input)
        val mc = rConsonant.matchEntire(input)
        return when {
            mv != null -> mv.groupValues[1] + mv.groupValues[2] + "ay"
            mc != null -> mc.groupValues[2] + mc.groupValues[1] + "ay"
            else -> ""
        }
    }
}
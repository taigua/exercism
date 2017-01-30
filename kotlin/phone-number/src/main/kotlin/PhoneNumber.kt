class PhoneNumber(s: String) {
    companion object {
        val ERROR_NUMBER = "0000000000"
        fun parse(s: String) : String {
            val s1 = s.filter { it.isDigit() }
            return when (s1.length) {
                10 -> s1
                11 -> if (s1[0] == '1') s1.drop(1) else ERROR_NUMBER
                else -> ERROR_NUMBER 
            }
        }
    }

    val number = parse(s)
    val areaCode = number.take(3)

    override fun toString() = "($areaCode) ${number.substring(3, 6)}-${number.substring(6, 10)}" 
}
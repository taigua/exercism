class Year(val year: Int) {
    val isLeap = when (year % 100) {
        0    -> year % 400 == 0
        else -> year % 4 == 0
    }
}
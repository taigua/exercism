class Squares(val n: Int) {
    fun squareOfSum() : Int {
        val sum = n * (1 + n) / 2
        return sum * sum
    } 

    fun sumOfSquares() = n * (n + 1) * (2*n + 1) / 6

    fun difference() = squareOfSum() - sumOfSquares()
}
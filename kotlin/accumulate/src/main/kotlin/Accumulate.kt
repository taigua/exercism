object Accumulate {
    fun <T, R> accumulate(list: List<T>, f: (T) -> R) : List<R> = list.map { f(it) }   
}
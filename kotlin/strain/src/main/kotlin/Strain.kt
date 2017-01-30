object Strain {
    fun <T> keep(l: List<T>, f: (T) -> Boolean) = l.filter { f(it) }
    fun <T> discard(l: List<T>, f: (T) -> Boolean) = l.filter { !f(it) } 
}
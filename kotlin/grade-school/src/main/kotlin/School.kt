class School {
    val grades: MutableMap<Int, MutableList<String>> = mutableMapOf()

    fun db() : Map<Int, List<String>> = grades

    fun grade(grade: Int) : List<String> = grades.getOrElse(grade) { listOf() }

    fun sort() : Map<Int, List<String>> = grades.mapValues{ it.value.sorted() }.toSortedMap() 

    fun add(name: String, grade: Int) {
        val list = grades.getOrPut(grade) { mutableListOf() }
        list.add(name)
    }


}
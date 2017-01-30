object Acronym {
    fun generate(s: String) : String {
        val l = s.split(Regex("\\W+"))
        var acronym = ""
        for (word in l) {
            acronym += word[0].toUpperCase()
            val remainer = word.drop(1)
            val upperRemainer = remainer.replace(Regex("[^A-Z]"), "")
            if (!upperRemainer.isEmpty() && remainer != upperRemainer)
                acronym += upperRemainer
        }
        return acronym
    } 
    
}
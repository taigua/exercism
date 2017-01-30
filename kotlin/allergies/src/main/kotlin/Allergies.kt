enum class Allergen(val score: Int) {
    EGGS(1),
    PEANUTS(2),
    SHELLFISH(4),
    STRAWBERRIES(8),
    TOMATOES(16),
    CHOCOLATE(32),
    POLLEN(64),
    CATS(128)
}

class Allergies(val scores: Int) {
    fun isAllergicTo(a: Allergen) = a.score and scores != 0
    fun getList() : List<Allergen> = Allergen.values().toList().filter { isAllergicTo(it) }    
}
object RnaTranscription {
    private val dnaMap = mapOf(        
        'G' to 'C',
        'C' to 'G',
        'T' to 'A',
        'A' to 'U'
    )

    fun ofDna(rna: String) : String {
        return rna.map { dnaMap[it] }.joinToString(separator="")        
    }
}
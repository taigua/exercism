class SpaceAge(val seconds: Long) {
    companion object {
        val EARTH_RATIO   = 31557600.0
        val MERCURY_RATIO = 0.2408467
        val VENUS_RATIO   = 0.61519726
        val MARS_RATIO    = 1.8808158
        val JUPITER_RATIO = 11.862615
        val SATURN_RATIO  = 29.447498
        val URANUS_RATIO  = 84.016846
        val NEPTUNE_RATIO  = 164.79132

        fun round(v: Double) = Math.round(v * 100) / 100.0
    }

    private val earth = seconds / EARTH_RATIO

    fun onEarth() = round(earth)
    fun onMercury() = round(earth / MERCURY_RATIO)
    fun onVenus() = round(earth / VENUS_RATIO)
    fun onMars() = round(earth / MARS_RATIO)
    fun onJupiter() = round(earth / JUPITER_RATIO)
    fun onSaturn() = round(earth / SATURN_RATIO)
    fun onUranus() = round(earth / URANUS_RATIO)
    fun onNeptune() = round(earth / NEPTUNE_RATIO)
}
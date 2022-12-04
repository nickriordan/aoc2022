data class Point(val x: Int, val y: Int) {
    fun north() = Point(x, y - 1)
    fun northeast() = Point(x + 1, y - 1)
    fun east() = Point(x + 1, y)
    fun southeast() = Point(x + 1, y + 1)
    fun south() = Point(x, y + 1)
    fun southwest() = Point(x - 1, y + 1)
    fun west() = Point(x - 1, y)
    fun northwest() = Point(x - 1, y - 1)
    fun ordinalPoints() = listOf(west(), east(), north(), south())
    fun quadrantPoints() = listOf(northeast(), southeast(), southwest(), northwest())
}

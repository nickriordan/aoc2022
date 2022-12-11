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

data class Grid(private val data: Map<Point, Int>, val xIndices: IntRange, val yIndices: IntRange) {
    companion object {
        fun of(data: List<List<Int>>) =
            Grid(data.flatMapIndexed { y, line ->
                line.mapIndexed { x, value -> Point(x, y) to value }
            }.toMap(), data.first().indices, data.indices)
    }

    fun at(pt: Point) = data[pt] ?: throw Exception("No such point")

    fun toNorth(pt: Point) = (pt.y - 1 downTo yIndices.first).map { y -> Point (pt.x, y) }
    fun toSouth(pt: Point) = (pt.y + 1 .. yIndices.last).map { y -> Point(pt.x, y) }
    fun toEast(pt: Point) = (pt.x + 1 .. xIndices.last).map { x -> Point(x, pt.y) }
    fun toWest(pt: Point) = (pt.x - 1 downTo xIndices.first).map { x -> Point(x, pt.y) }
}
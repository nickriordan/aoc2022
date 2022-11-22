import kotlin.math.absoluteValue

fun loadStrings(fileName: String): List<String> =
    object {}::class.java.getResourceAsStream(fileName)?.bufferedReader()?.readLines()
        ?: throw Exception("Failed to load file $fileName")

fun loadInts(fileName: String) = loadStrings(fileName).map(String::toInt)

fun loadSingleLineInts(fileName: String) = loadStrings(fileName).first().split(",").map(String::toInt)

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

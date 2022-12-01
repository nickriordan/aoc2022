fun dec01part1() = caloriesForEachElf().max()
fun dec01part2() = caloriesForEachElf().sortedDescending().let { it[0] + it[1] + it[2] }
private fun caloriesForEachElf() =
    loadStrings("dec01.txt").fold(listOf(0)) { acc, i ->
        if (i.isEmpty()) acc + 0 else acc.dropLast(1) + (acc.last() + i.toInt())
    }

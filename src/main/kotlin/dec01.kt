fun dec01part1() = caloriesForEachElf().max()
fun dec01part2() = caloriesForEachElf().sorted().takeLast(3).sum()
private fun caloriesForEachElf() = loadAsSingleString("dec01.txt")
    .split("\n\n").map { it.split("\n").map(String::toInt).reduce { acc, i -> acc + i } }

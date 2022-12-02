fun dec02part1() = loadStrings("dec02.txt").sumOf {
    mapOf(
        "A X" to 4,      // R/R - draw (3 + 1)
        "B X" to 1,      // P/R - loss (0 + 1)
        "C X" to 7,      // S/R - loss (6 + 1)
        "A Y" to 8,      // R/P - won (6 + 2)
        "B Y" to 5,      // P/P - draw (3 + 2)
        "C Y" to 2,      // S/P - loss (0 + 2)
        "A Z" to 3,      // R/S - loss (0 + 3)
        "B Z" to 9,      // P/S - won (6 + 3)
        "C Z" to 6       // S/S - draw (3 + 3)
    )[it]!!
}

fun dec02part2() = loadStrings("dec02.txt").sumOf {
    mapOf(
        "A X" to 3,      // R/? - must lose - rock wins against scissors (3)
        "B X" to 1,      // P/? - must lose - paper wins against rock (1)
        "C X" to 2,      // S/? - must lose - scissors wins against paper (2)
        "A Y" to 4,      // R/R - must draw - hence (1 + 3)
        "B Y" to 5,      // P/P - must draw - hence (2 + 3)
        "C Y" to 6,      // S/S - must draw - hence (3 + 3)
        "A Z" to 8,      // R/? - must win  - paper wins against rock (2 + 6)
        "B Z" to 9,      // P/? - must win  - scissors wins against paper (3 + 6)
        "C Z" to 7       // S/? - must win  - rock wins against scissors (1 + 6)
    )[it]!!
}

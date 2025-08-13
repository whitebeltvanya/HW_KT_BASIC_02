package ru.netology

fun main() {
    val likesList = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 99, 1000, 3888, 7_555, 10_000, 1000_000)
    for (likes in likesList) {
        val personStr = getPersonByIf(likes)
        println("Понравилось $likes $personStr")
    }
}

fun getPersonByIf(likes: Int): String {
    val ret = if (likes == 0 ||
        (likes >= 1000 && likes % 1000 == 0)
    ) {
        "человек"
    } else if (likes == 1) {
        "человеку"
    } else if (likes >= 2 && likes <= 4) {
        "людям"
    } else {
        "человекам"
    }
    return ret
}

fun getPersonByWhen(likes: Int): String {
    val ret = when {
        (likes == 0 || (likes >= 1000 && likes % 1000 == 0)) -> "человек"
        likes == 1 -> "человеку"
        (likes in 2..4) -> "людям"
        else -> "человекам"
    }
    return ret
}

package ru.netology

fun main() {
    val likesList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 101, 121, 1911, 7_321, 9_811, 10_000)
    for (likes in likesList) {
        val personStr = getPersonByIf(likes)
        println("Понравилось $likes $personStr")
    }
}

fun getPersonByIf(likes: Int): String {
    val ret = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
//    } else if (likes % 1000 == 0) {
//        "человек"
    } else {
        "людям"
    }

    return ret
}

fun getPersonByWhen(likes: Int): String {
    val ret = when {
        (likes % 10 == 1 && likes % 100 != 11) -> "человеку"
        //(likes % 1000 == 0) -> "человек"
        else -> "людям"
    }
    return ret
}

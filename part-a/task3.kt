fun letterGrade(mark: Int): String {
    return when {
        mark !in 0..100 -> "Invalid"
        mark >= 90 -> "A"
        mark >= 80 -> "B"
        mark >= 70 -> "C"
        mark >= 60 -> "D"
        else -> "F"
    }
}
fun status(mark: Int): String =
    if (mark >= 60) "Pass" else "Fail"

fun task3() { val marks = listOf(97, 88, 74, 61, 45, 130)
    for (mark in marks) {
        println("$mark -> ${letterGrade(mark)} -> ${status(mark)}")
    }
}
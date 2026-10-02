data class Course(
    val code: String,
    val title: String,
    val credits: Int,
    val days: String )
fun findCourse(list: List<Course>, code: String): String {
    return list.firstOrNull { it.code == code }?.title ?: "Course not found"
}
fun task5() {
    val courses = listOf(
        Course("CSC 402", "Mobile Application Programming", 3, "Mon / Wed"),
        Course("CSC 311", "Database Systems", 4, "Sun / Tue"),
        Course("CSC 340", "Operating Systems", 3, "Mon / Wed"),
        Course("MATH 202", "Discrete Mathematics", 3, "Sun / Thu"),
        Course("ENG 214", "Technical Writing", 2, "Tue") )
    println("All courses:")
    courses.forEach {
        println(it)
    }

    println("\nCourses with 3 credits or more:")
    courses.filter {
        it.credits >= 3
    }.forEach {
        println(it)
    }

    println("\nCourse codes:")
    val courseCodes = courses.map {
        it.code
    }
    println(courseCodes)

    println("\nTotal credit hours:")
    val totalCredits = courses.sumOf {
        it.credits
    }
    println(totalCredits)

    println("\nFind course:")
    println(findCourse(courses, "CSC 402"))
    println(findCourse(courses, "CSC 999"))

    println("\nCopy CSC 402 with 4 credits:")
    val csc402 = courses.first { it.code == "CSC 402" }
    val updatedCourse = csc402.copy(credits = 4)
    println(updatedCourse)

    println("\nOriginal CSC 402:")
    println(csc402)
}
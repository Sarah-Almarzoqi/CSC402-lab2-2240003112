fun greetStudent(name: String, course: String = "CSC 402"): String {
    return "Welcome to $course, $name!"
}
fun finalMark(quizzes: Double, project: Double, finalExam: Double): Double =
    quizzes * 0.10 + project * 0.70 + finalExam * 0.20

fun printBanner(title: String, width: Int = 40) {
    println("-".repeat(width))
    println(title)
    println("-".repeat(width))
}

fun task2(){
    printBanner("CSC 402 Lab 2")
    println(greetStudent("Sarah Almarzoqi"))
    println(greetStudent("Sarah Almarzoqi", "CSC 311"))

    val mark1 = finalMark(80.0, 90.0, 85.0)
    val mark2 = finalMark(
        finalExam = 85.0,
        quizzes = 80.0,
        project = 90.0
    )

    println(mark1)
    println(mark2)
}

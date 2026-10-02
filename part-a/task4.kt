fun describeTeam(teamName: String?): String {
    return teamName?.let {
        "Team: $it (${it.length} characters)"
    } ?: "Team not registered yet"
}
fun task4() { val nickname: String? = null
    val fullName: String = "Sarah Almarzoqi"
    println(fullName.length)
    println(nickname?.length)
    println(nickname ?: "no nickname set")
}
fun main() {
    val obj: Any = getStuff("2")
    val casted: Int? = obj as? Int
    println(casted)
}

fun getStuff(value: String): Any {
    return when (value) {
        "1" -> 99
        "2" -> "Hello"
        "3" -> true
        "4" -> 16.1
        else -> false
    }
}
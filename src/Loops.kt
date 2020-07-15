fun main(args: Array<String>) {
    for (i in 0 until 10 step 2) {
        println(i)
    }
    for (i in 10 downTo 0) {
        println(i)
    }
    val names = listOf("Roshan", "Priyanka", "Shashi", "Ankit", "Roshanian")
    for (i in names) {
        println(i)
    }
    names.map { it }.forEach { println(it) }
}
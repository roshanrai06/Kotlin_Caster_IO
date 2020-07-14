fun main(args: Array<String>) {
    val name = listOf("Roshan", "Priyanka", "Shashi", "Ankit","Roshanian")
    println(name)
    val filter = name.filter { it != "Roshan" }
    println("After Filter******")
    println(filter)
    val ages = listOf(23, 33, 12, 9, 17, 19, 99)
    println(ages)
    val adults = ages.filter(::isAdult)
    println("After Filter******")
    println(adults)

    println(name.last { it.contains("Rosh") })
}

fun isAdult(age: Int): Boolean {
    return age > 18
}
fun main(args: Array<String>) {
    val name = listOf("Roshan", "Priyanka", "Shashi", "Ankit", "Roshanian")
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


    val names = listOf("Roshan", "Priyanka", "Shashi", "Ankit", "Roshanian")
    val approved = mutableListOf("Lallan", "Danial")
    val addSome = listOf("Monu", "Sonu")
    val newFilter = names.filterNotTo(approved, { it.contains("") })
    println(newFilter)
    val allOfUs = listOf(names, approved, addSome)
    println(allOfUs.flatten())
    println(names.plus(approved).plus(addSome))
    val abbreviation = names.map { it.substring(0, 3).toUpperCase() }.map { it.contains("R") }
    println("Abbreviation$abbreviation")


}

fun isAdult(age: Int): Boolean {
    return age > 18
}
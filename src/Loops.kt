import kotlin.system.measureNanoTime

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
    names.forEachIndexed { index, p ->
        println("Index: $index,Name: $p")
    }
    //val list= generateSequence(1) { it+1 }.take(50000000).toList()
    //val result= list.filter { it%3==0 }.average()
    println("Done")
}
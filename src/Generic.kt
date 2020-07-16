fun main() {
    val listOfStrings: List<String> = listOf("Roshan", "Priyanka", "Pusu", "Gusu")
    val listOfInteger: List<Int> = listOf(1, 2, 3, 4, 5)
    val result=EventList(listOfStrings)
    println(result.evenItems())
    val resultInt=EventList(listOfInteger)
    println(resultInt.evenItems())


}

class EventList<T>(private val list: List<T>) {
    fun evenItems(): List<T> {
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }
}
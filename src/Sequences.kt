fun main() {
    listOf("A", "B", "C").filter {
        println("Filter: $it")
        true
    }.filter {
        println("Hello: $it")
        true
    }.forEach { println("For each : $it") }

    println("Sequence *******")

    sequenceOf("X", "Y", "Z").filter {
        println("Filter: $it")
        true
    }.filter {
        println("Hello: $it")
        true
    }.forEach { println("For each : $it") }
}
import java.lang.Thread.sleep

fun main() {
    val name: String by lazy {
        println("Computed")
        sleep(3000)
        "Roshan"
    }
    println(name)
    println(name)
    println(name)

}
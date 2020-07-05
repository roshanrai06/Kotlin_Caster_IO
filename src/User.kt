class User(var firstName: String, var lastName: String) {
    constructor(firstName: String, lastName: String, isPlatinum: Boolean)

    fun printFullName() {
        println("$firstName $lastName")
    }

}

fun main() {
    val user = User("Roshan", "Rai")
    user.printFullName()
}
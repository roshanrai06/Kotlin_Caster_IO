class User(private var firstName: String, private var lastName: String) {
    var fullName: String = "$firstName $lastName"
        get() = "First Full Name $field"
        set(value) {
            if (value.startsWith("Roshan")) {
                field = "Roshan The Great"
            }
        }

    constructor(firstName: String, lastName: String, isPlatinum: Boolean) : this(firstName, lastName) {
        println("$firstName $lastName $isPlatinum")

    }

    constructor(firstName: String) : this(firstName, "") {
        println(firstName)

    }

    fun printFullName() {
        println("$firstName, $lastName")
    }

    companion object {
        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }

    object FavouriteFood {
        var name: String = "Chicken"

    }

}

fun main() {
    val user = User("Roshan", "Rai", false)
    val user1 = User("Roshan")
    println(user1.fullName)
    user1.fullName = "Roshan"
    println(user1.fullName)
    // user.printFullName()
    User.createUser("Roshan", "Rai Companion").printFullName()
    println(User.FavouriteFood.name)
    User.FavouriteFood.name = "Now Its Paneer"
    println(User.FavouriteFood.name)
}
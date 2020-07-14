fun main(args: Array<String>) {
    val users = arrayOf(User("Roshan", "Rai"), User("Priyanka", "Rai"), User("Akita", "Rai"))
    users.forEach {
        print(it.printFullName())
    }

    val updateUser = users.plus(User("Chottin", "Singh"))
    updateUser.forEach {
        print(it.printFullName())

    }
}
fun main() {
    // val lambdaName : (InputType) -> ReturnType = {arguments:InputType->body}
    // Last line of code in body will be the return type

    // greeter ("Roshan")
    // "Hello  Roshan "

    val greeter1: (String) -> String = { name: String ->
        "Hello $name"
    }
    val greeting1: String = greeter1("Roshan")
    println(greeting1)

    // greeter ("Roshan","Roshan")
    // "Hello  Roshan  Rai"

    val greeter2: (String, String) -> String = { firstName: String, lastName: String ->
        "Hello $firstName $lastName"
    }
    val greeting2: String = greeter2("Roshan", "Rai")
    println(greeting2)
    val greeter3: (String, String) -> String = { firstName: String, lastName: String ->
        val modifiedFirstName = firstName.toUpperCase()
        val modifiedLastName = lastName.toUpperCase()
        "Hello $modifiedFirstName $modifiedLastName"
    }
    val greeting3: String = greeter3("Roshan", "Rai")
    println(greeting3)
    val greeter4: (String, String) -> Unit = { firstName: String, lastName: String ->
        val modifiedFirstName = firstName.toUpperCase()
        val modifiedLastName = lastName.toUpperCase()
        println("Hello With Unit Return Type $modifiedFirstName $modifiedLastName")
    }
    greeter4("Roshan", "Rai")
    lineLogger {
        println("Message1")
        println("Message1")
        println("Message1")
    }
    repeater(5) { index ->
        if (index < 3) {
            println("Hello")
        } else {
            println("Bye")

        }

    }



    derbyAnnouncer { player: String ->
        "$player is a great asset to the team"


    }
}

fun derbyAnnouncer(block: (String) -> String) {
    val players = listOf(
            "Roshan",
            "Priyanka",
            "Pusu",
            "Gusu",
            "Gala",
            "Masala"
    )
    val randomPlayers = players.random()
    println("Next player is $randomPlayers")
    val announceMessage = block(randomPlayers)
    println(announceMessage)

}

fun lineLogger(block: () -> Unit) {
    repeat(1) {
        println("************")
    }
    block()
    repeat(1) {
        println("************")
    }

}

fun repeater(times: Int, block: (index: Int) -> Unit) {
    repeat(times) { index ->
        block(index)

    }
}
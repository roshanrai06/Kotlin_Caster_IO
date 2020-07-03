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
}
import java.awt.Button

fun main(args: Array<String>) {
    val button = Button()
    button.addActionListener {
        object : OnClickListener {
            override fun onClick() {
                println("Clicked")
            }

        }
    }
    val name = "Roshan Rai"
    println(name.initials())
    val age = 29
    println(age.isAdult())

}

interface OnClickListener {
    fun onClick()
}
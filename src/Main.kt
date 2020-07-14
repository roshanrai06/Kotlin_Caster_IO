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

}

interface OnClickListener {
    fun onClick()
}
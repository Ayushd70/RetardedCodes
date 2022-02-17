fun main() {

    val str: String = when (100) {

        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x value is unknown"
            "x is an alien"
        }
    }

    println(str)
}
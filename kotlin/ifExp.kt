fun main() {

    val a = 2

    val b = 5

    val maxValue: Int = if (a > b) {
        print("a is greater")
        a
    } else {
        print("b is greater")
        b
    }

    println(maxValue)
}
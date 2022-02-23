fun main() {

    val x = 6
    val y = 10

    val greaterVal = x findGreaterValue y   // x.findGreaterValue(y)

    println(greaterVal)
}

infix fun Int.findGreaterValue(other: Int): Int {       // INFIX and Extension Func

    return if (this > other)
        this
    else
        other
}
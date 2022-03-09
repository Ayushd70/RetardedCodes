fun main() {

    // Elements :   32  0   0   54  0
    // Index    :   0   1   2   3   4

    val myArray = Array(5) { 0 }   // Mutable. Fixed Size.
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray) {              // Using individual elements (Objects)
        println(element)
    }

    println()

    for (element in myArray) {
        println(element)
    }
}

fun main() {

    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 90)

    val mySmallNums = myNumbers.filter { it < 10 }    // OR { num -> num < 10 }
    for (num in mySmallNums) {
        println(num)
    }

    val mySquaredNums = myNumbers.map { it * it }     // OR { num -> num * num }
    for (num in mySquaredNums) {
        println(num)
    }

    val people = listOf(Pperson(10, "Steve"), Pperson(23, "Annie"), Pperson(17, "Sam"))
    val names = people.filter { person ->person.name.startsWith("S") }.map { it.name }

    for (name in names) {
        println(name)
    }
}

class Pperson(var age: Int, var name: String) {
    // RandomCode
}
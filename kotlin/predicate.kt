fun main() {

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = { num: Int -> num > 10 }

    val check1 = myNumbers.all(myPredicate)
    println(check1)

    val check2 = myNumbers.any(myPredicate)
    println(check2)

    val totalCount: Int = myNumbers.count(myPredicate)
    println(totalCount)

    val num = myNumbers.find(myPredicate)
    println(num)
}
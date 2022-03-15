class Person {
    var name: String = "Ayush Dubey"
    var age: Int = 22
}

fun main() {

    /** Scope Function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    val person = Person()

    val bio: String = with(person) {
        println(name)
        println(age)
        age + 5
        "Developer, Student And Learner." // will be returned and stored in 'bio' String variable
    }

//    println("Age after five years is $ageAfterFiveYears")
    println(bio)
}
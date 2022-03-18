class Person2 {
    var name: String = "Ayush Dubey"
    var age: Int = 22
}

fun main() {

    /** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    val person = Person2()

    val bio = person.run {
        println(name)
        println(age)
        age + 5
        "Developer"   // will be returned and stored in 'bio' variable
    }

    println(bio)
}
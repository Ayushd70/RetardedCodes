import java.util.*

fun main() {

    /** Scope Function: 'let'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'lambda result'  */

    // Use 'let' function to avoid NullPointerException

    val name = "Hello"

    // Execute the lambda expression only if the 'name' variable is NOT NULL
    val stringLength = name.let { it ->
        println(it.reversed())
        println(it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
        it.length       // Will be returned and stored within stringLength variable
    }

    println(stringLength)
}
import kotlinx.coroutines.*


fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val time = measureTimeMillis {
        val msgOne = getMessageOne()
        val msgTwo = getMessageTwo()
        println("The entire message is: ${msgOne + msgTwo}")
    }

    println("Completed in $time ms")
    println("Main program ends: ${Thread.currentThread().name}")    // main thread
}

suspend fun getMessageOne(): String {
    delay(1000L)
    return "Hello "
}

suspend fun getMessageTwo(): String {
    delay(1000L)
    return "World!"
}
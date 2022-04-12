import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val msg: Deferred<Unit> = async(start = CoroutineStart.LAZY) { getMessage() }
    val msg2: Deferred<Unit> = async(start = CoroutineStart.LAZY) { getMessage2() }
    println("The entire message is: ${msg.await() + msg2.await()}")

    println("Main program ends: ${Thread.currentThread().name}")
}

suspend fun getMessage(): String {
    delay(1000L)
    println("After working in getMessage()")
    return "Hello "
}

suspend fun getMessage2(): String {
    delay(1000L)
    println("After working in getMessage2()")
    return "World!"
}
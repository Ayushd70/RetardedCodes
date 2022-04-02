import kotlinx.coroutines.*


fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        mySuspendFunc(1000)
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    mySuspendFunc(2000)

    println("Main program ends: ${Thread.currentThread().name}")
}

suspend fun mySuspendFunc(time: Long) {
    delay(time)
}
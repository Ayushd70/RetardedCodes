import kotlinx.coroutines.*


fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {    // Thread: T1
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    delay(2000)

    println("Main program ends: ${Thread.currentThread().name}")
}
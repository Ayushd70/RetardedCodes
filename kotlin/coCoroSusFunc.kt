import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    val job: Job = launch {
        for (i in 0..500) {
            print("$i.")
            yield()
        }
    }

    delay(10)
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")
}
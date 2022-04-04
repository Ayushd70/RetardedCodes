import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    val job: Job = launch(Dispatchers.Default) {
        for (i in 0..500) {
            if (!isActive) {
                return@launch // break
            }
            print("$i.")
            withContext(Dispatchers.IO) {
                Thread.sleep(1)
            }
        }
    }

    delay(10)
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")
}
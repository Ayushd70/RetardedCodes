import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    val job: Job = launch(Dispatchers.Default) {
        try {
            for (i in 0..500) {
                print("$i.")
                delay(5)
            }
        } catch (ex: CancellationException) {
            print("\nException caught safely: ${ex.message}")
        } finally {
            print("\nClose resources in finally")
        }
    }

    delay(10)
    job.cancel(CancellationException("Crash"))
    job.join()

    println("\nMain program ends: ${Thread.currentThread().name}")
}
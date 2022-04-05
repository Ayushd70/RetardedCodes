import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    withTimeout(1300) {
        try {
            for (i in 0..1000) {
                print("$i.")
                delay(500)
            }
        } catch (ex: TimeoutCancellationException) {
            // .. code..
        } finally {
            // .. code..
        }
    }

    println("\nMain program ends: ${Thread.currentThread().name}")
}
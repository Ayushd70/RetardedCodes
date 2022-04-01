@file:OptIn(DelicateCoroutinesApi::class)

import kotlinx.coroutines.*


fun main() {        // Executes in main thread

    println("Main program starts: ${Thread.currentThread().name}")

    GlobalScope.launch {    // creates a background coroutine that runs on a background thread
        println("Fake work starts: ${Thread.currentThread().name}")
        withContext(Dispatchers.IO) {
            Thread.sleep(1000)
        }      // Pretend to do some work... may be file upload
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    // Blocks the current main thread & wait for coroutine to finish (practically not a right way to wait)
    Thread.sleep(2000)
    println("Main program ends: ${Thread.currentThread().name}")
}
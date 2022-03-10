fun main() {

    //Map Tutorial: Key-Value pair
    //var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
    //var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size

    val myMap = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size

    myMap[4] = "Yogi"
    myMap[43] = "Rahul"
    myMap[7] = "Akhilesh"
    myMap[43] = "Modi"

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")  // myMap.get(key)
    }
}

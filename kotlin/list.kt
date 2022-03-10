fun main() {

    // Elements :
    // Index    :   0   1   2   3   4

//    var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
//    var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements
    val list = ArrayList<String>()      // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Yogi")        // 0
    list.add("Rahul")    // 1
    list.add("Akhilesh")    // 2

    list.remove("Akhilesh")

    list[1] = "Modi"

    for (element in list) {             // Using individual elements (Objects)
        println(element)
    }
}
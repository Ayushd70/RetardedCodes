fun main() {

    val user = User("Ayush", 30)

    println(user.id)
}

class User(var name: String) {

    var id: Int = -1

    init {
        println("User has got a name as $name and id is $id")
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}
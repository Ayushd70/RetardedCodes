fun main() {

    val user1 = Admin("Ayush", 10)

    val user2 = Admin("Ayush", 10)

    println(user1.toString())

    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    val newUser = user1.copy(id = 25)
    println(newUser)
}

data class Admin(var name: String, var id: Int)
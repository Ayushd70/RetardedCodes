fun main() {

    val dog = Dog()
    dog.bread = "labrador"
    dog.color = "black"
    dog.bark()
    dog.eat()

    val cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    val animal = Animal()
    animal.color = "white"
    animal.eat()
}

open class Animal {         // Super class / Parent class /  Base class

    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Dog : Animal() {      // Subclass / Child class / Derived class

    var bread: String = ""

    fun bark() {
        println("Bark")
    }
}

class Cat : Animal() {      // Subclass / Child class / Derived class

    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}
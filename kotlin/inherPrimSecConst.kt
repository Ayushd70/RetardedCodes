fun main() {

    var dog = TheDog("Black", "Pug")
}

open class TheAnimal {      // Super class / Parent class /  Base class

    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}

class TheDog : TheAnimal {    // Subclass / Child class / Derived class

    var bread: String = ""

    constructor(color: String, breed: String): super(color) {
        this.bread = breed

        println("From Dog: $color and $breed")
    }
}
fun main() {

    val student = Student()
    println("Pass status: " + student.hasPassed(57))

    println("Scholarship Status: " + isScholar(57))
}

fun isScholar(marks: Int): Boolean {
    return marks > 95
}

class Student {         // OUR OWN CLASS

    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}
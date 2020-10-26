open class Person(name: String) {
	protected val name: String = name
		get() = field.capitalize() 
}

class Student(name: String, university: String = "none") : Person(name) {
	private val university: String = university

	val showStudent: () -> Unit = { println("Name is ${this.name}, university is ${this.university}") }
}

fun main() {
	val student = Student("maksym", "CUT")
	student.showStudent()
}
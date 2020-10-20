fun auraColor(studentPoints: Int = 2): Unit {
	val satisfactionLevel = (Math.pow(Math.random(), (110 -studentPoints) / 100.0) * 20).toInt()
	
	println("aura is " + when (satisfactionLevel) {
		in 1..5 -> "red"
		in 6..10 -> "orange"
		in 1..15 -> "purple"
		else -> "green"
	})
}

fun printStudentStatus(name: String, auraColor: String) {
	println("$name has a $auraColor face color")
}

fun main() {
	var studentPoints: Int = 100
	var hasCredit: Boolean = false
	val university = "Politechnika Krakowska"
	val name = "Maksym"
	val studentId = 111111

	println("studentPoints is $studentPoints and hasCredit is $hasCredit")
	println("university is $university, name is $name and studentId is $studentId")

	auraColor()

	printStudentStatus(auraColor = "white", name = name)
}

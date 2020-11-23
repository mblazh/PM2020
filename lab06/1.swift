import UIKit

class Student {
	private var name: String
	private var surname: String
	private var points: Double

	init(name: String, surname: String, points: Double) {
		self.name = name
		self.surname = surname
		self.points = points
	}

	internal func showStudent() {
		var satisfactionLevel = round(pow(Double.random(in: 0...1), (110 - self.points) / 100) * 20)
		var auraColor: String

		switch satisfactionLevel {
			case 0...5:
				auraColor = "red"

			case 6...10:
				auraColor = "orange"

			case 11...15:
				auraColor = "purple"

			default:
				auraColor = "green"
		}

		print(self.name, "has a", auraColor, "face color")
	}
}

var student = Student(name: "Mike", surname: "Pence", points: 5)
student.showStudent()

package woche06.Tag03Vererbung.musterloesungen.Aufgabe8.src

import Course
import Dozent
import Student

fun main() {
    var students = mutableListOf(
        Student("Markus", 25),
        Student("Julian", 21),
        Student("Sepp", 21),
        Student("Maria", 31),
        Student("Johannes", 35)
    )
    var mathe = Course("mathe", students)
    var gordon = Dozent("Gordon", 28, mutableListOf(mathe))
    gordon.gradeStudent(students[0], 3.5)
    gordon.gradeStudent(students[0], 1.2)
    print(students[0].avgGrade())
    gordon.printCourses()
}
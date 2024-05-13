class Dozent(name: String, age: Int, var courses: MutableList<Course>): Person(name, age) {

    fun printCourses() {
        this.courses.forEach { course: Course -> println(course.name) }
    }

    fun gradeStudent(student: Student, grade: Double) {
        student.grades.add(grade)
    }
}
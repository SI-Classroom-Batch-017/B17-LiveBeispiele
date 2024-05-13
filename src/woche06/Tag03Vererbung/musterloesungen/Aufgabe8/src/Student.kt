class Student(name: String, age: Int) : Person(name, age) {
    var grades = mutableListOf<Double>()

    fun avgGrade(): Double {
        if (grades.isEmpty()) return 0.0
        else return grades.average()
    }
}
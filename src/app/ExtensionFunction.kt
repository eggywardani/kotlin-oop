package app

import data.Student
import data.sayHello
import data.upperName


fun main() {
    val student:Student? = Student("Nida", 22)
    student.sayHello("Linaa")
    println(student?.upperName)

}



package app

import data.Teacher

fun main() {
    val teacher = Teacher("Lian")
    println(teacher.name)
    /*teacher.teach // error*/
}
package app

import data.Student

fun main() {
    val student = Student("Eggy", 20)
    println(student.name)
    println(student.age)

    val result:String = student.let {
        "Name ${it.name}, age ${it.age}"
    }
    println(result)
    val result2:String = student.run {
        "Name ${this.name}, age ${this.age}"
    }
    println(result2)

    val result3:Student = student.apply {
        "Name ${this.name}, age ${this.age}"
    }
    println(result3)
    println(result3.name)
    println(result3.age)


    val result4:Student = student.also {
        "Name ${it.name}, age ${it.age}"
    }

    println(result4)
    println(result4.name)
    println(result4.age)

    val result5:String = with(student) {
        "Name ${this.name}, age ${this.age}"
    }
    println(result5)
}
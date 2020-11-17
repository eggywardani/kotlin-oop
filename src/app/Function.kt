package app

import data.Person

fun main() {

    val eggy = Person()
    eggy.firstName = "Eggy"
    eggy.middleName = "Andika"
    eggy.lastName = "Wardani"

    eggy.sayHello("Nadia")
    eggy.run()
    val fullName = eggy.getFullName()
    println(fullName)

}
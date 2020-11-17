package app

import data.Person

fun main() {
    val eggy = Person()
    eggy.firstName = "Eggy"

    eggy.sayHello("Nadia")
    eggy.sayHello("Nadia", "Pratiwi")

}
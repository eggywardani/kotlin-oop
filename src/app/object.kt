package app

import data.Person

fun main() {
    val eggy = Person()
    val nadia = Person()

    eggy.firstName = "Eggy"
    eggy.middleName = "Andika"
    eggy.lastName = "Wardani"

    println(eggy)
    println(nadia)
    println(eggy.firstName)
    println(eggy.middleName)
    println(eggy.lastName)

}
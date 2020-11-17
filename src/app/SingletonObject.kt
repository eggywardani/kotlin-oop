package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "DIUBAH"
    println(Utilities.toUpper("Nadia pratiwi"))



    a()
    b()

    println(Application.Companion.toUpper("linda"))
}

fun a(){
    println(Utilities.name)
}
fun b(){
    println(Utilities.name)
}

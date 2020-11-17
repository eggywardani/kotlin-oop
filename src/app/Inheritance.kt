package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Eggy")
    manager.sayHello("Nadia")

    val vicePresident = VicePresident("Ava")
    vicePresident.sayHello("Indah")
}
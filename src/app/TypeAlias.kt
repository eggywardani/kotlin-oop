package app

import data.Application

typealias App = Application
typealias App2 = data2.Application

fun main() {
    val app = App("Koland")
    val app2 = App2("Fol")
    sayHello { "Ekooo" }
}

typealias StringSupplier =()-> String

fun sayHello(supplier:StringSupplier){
    println("Hello ${supplier()}")

}
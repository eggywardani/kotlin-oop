package app

import data.Boss
import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee:Employee = Employee("Eggy")
    employee.sayHello("Budi")

    employee = Manager("Eggy")
    employee.sayHello("Budi")
    employee = VicePresident("Eggy")
    employee.sayHello("Budi")


}
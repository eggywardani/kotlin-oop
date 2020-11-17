package app

import data.Boss

fun main() {

    /*val employee = Boss.Employee("Eko")  error*/
    val boss = Boss("Eggy")
    val employee1 = boss.Employee("Nadia")
    val employee2 = boss.Employee("Lia")

    val boss2 = Boss("Wardani")
    val employee3 = boss2.Employee("Ana")
    val employee4 = boss2.Employee("Luna")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()






}
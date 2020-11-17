package app

import data.Company

fun main() {
    val company1 = Company("Eggy")
    val company2 = Company("Eggy")

    println(company1 == company2)
    println(company1 == company1)


}
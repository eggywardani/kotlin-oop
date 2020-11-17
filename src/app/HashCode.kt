package app

import data.Company

fun main() {
    val company1 = Company("Eggy")
    val company2 = Company("Nada")

    println(company1.hashCode())
    println(company2.hashCode())

    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company1.hashCode())


}
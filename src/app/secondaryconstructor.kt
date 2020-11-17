package app

import data.Address

fun main() {
    val address = Address("jalan A", "Jakarta")
    val address2 = Address("jalan A", "Jakarta", "Indonesia")

    println(address.street)
    println(address2.street)
}
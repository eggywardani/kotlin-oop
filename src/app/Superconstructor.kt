package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Eggy")
    println(premiumCustomer.name)

    val executiveCutomer = ExecutiveCustomer("Eggy", 1000000000)
    println(executiveCutomer.name)
    println(executiveCutomer.balance)
}
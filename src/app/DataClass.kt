package app

import data.Product

fun main() {
    val product  = Product("Indomie", "3000", "Food")
    println(product)
    println(product.name)
    println(product.price)
    println(product.category)

    val product2 = product.copy(name = "Bakso")
    println(product2)


}
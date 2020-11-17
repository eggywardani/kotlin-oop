package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    avanza.year = 2016
    val almaz = Car("Wuling", "Almaz")

    println(avanza.brand)
    println(almaz.brand)
    println(avanza.year)
    println(almaz.year)

}
package app

import data.Television

fun main() {
    val tv = Television()
    tv.initTelevision("Sharp")
    println(tv.brand)
}
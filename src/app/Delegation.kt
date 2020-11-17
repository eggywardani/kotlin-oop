package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("ELllo")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Jol")
    baseDelegate.sayBye("Lina")
}
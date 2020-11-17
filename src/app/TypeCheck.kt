package app

import data.HandPhone
import data.Laptop

fun printObj(any: Any){
    if (any is Laptop){
        println("Laptop : ${any.name}")

    }else if (any is HandPhone){

        println("Handphone : ${any.name}")
    }else{
        println(any)

    }


}
fun printObjWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop : ${any.name}")
        is HandPhone -> println("Handphone : ${any.name}")
        else -> println(any)
    }


}

fun printString(any: Any){
    val value = any as String
    println(value)
}
fun printStringSafe(any: Any){
    val value = any as? String
    println(value)
}

fun main() {
    printObj("Eggy")
    printObj(99)
    printObj(Laptop("HP"))
    printObj(HandPhone("Xiaomi"))
    printObj('w')


    printObjWhen(Laptop("Lenovo s340"))
    printString("Eggy")
    /*printString(2) // Error*/
    printStringSafe(3)// Null



}
package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val female = Gender.FEMALE
    val allGenders = Gender.values()
    val manValue = Gender.valueOf("MALE")
    val womanValue = Gender.valueOf("FEMALE")

    for (a in allGenders){
        println(a)
    }
    println(allGenders.toList())
    println(manValue)
    println(womanValue)
    man.desc()
    womanValue.desc()



}
package app

import data.User

fun main() {

    val user1 = User("Eggy", "eggy12345")
    val user2 = User("Andika", "rahasia")

    user1.userNameParam ="Nadia Pratiwi"

    println(user1.userNameParam)
    println(user1.passwordParam)
    println(user2.userNameParam)
    println(user2.passwordParam)

}
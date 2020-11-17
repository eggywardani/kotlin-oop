package app

import data.Game
import data.Login
import data.MinMax

fun main() {
    val game = Game("Naruto Ultimate", 200000)
    /*val name = game.name
    val price = game.price
    */

    val (name,price) = game
    println(name)
    println(price)

//    val result = minmax(10,100)
//    val min = result.min
//    val max = result.max
//
    val (min, max) = minmax(1000,10)
    println(min)
    println(max)

    val login = Login("eko","rahasia")
    /*login(login){
        login.username == "eko" && login.pass == "rahasia"
    }
    */

    login(login){(username, password) ->
        login.username == "eko" && login.pass == "rahasia"
    }

}

fun minmax(value1:Int, value2: Int):MinMax{
    return when{
        value1 > value2 ->MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }

}

fun login(login: Login, callback:(Login)->Boolean):Boolean{
    return callback(login)
}
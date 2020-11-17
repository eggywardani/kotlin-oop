package program

import annotations.Fancy
import app.a

@Fancy(author = "Eggy")
class MyApplication(val name:String, val version:Int) {
    fun info():String = "Application $name-$version"
}
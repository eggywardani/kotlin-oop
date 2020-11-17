package app

import data.Action

fun main() {

    fireAction(sampleAction())
    fireAction(object :Action{
        override fun action() = println("Action one")
    })
    fireAction(object :Action{
        override fun action() = println("Action two")
    })


}


class sampleAction:Action{
    override fun action() {
        println("Hi Action")
    }
}

fun fireAction(action: Action){
    action.action()
}
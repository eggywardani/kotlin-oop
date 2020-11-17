package data

interface Base {
    fun sayHello(name:String)
    fun sayBye(name: String)
}

class MyBase:Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayBye(name: String) {
        println("Bye $name")
    }
}

class MyBaseDelegate(val base:Base):Base by base

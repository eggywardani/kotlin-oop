package data

class Person{


    var firstName:String = ""
    var middleName:String?= null
    var lastName:String =""


    fun sayHello(name:String){
        println("Halo $name, my name is $firstName")
    }
    fun sayHello(firstName:String, lastNameParam:String){
        println("Halo $firstName $lastNameParam, my name is ${this.firstName}")
    }


    fun run(){
        println("I am running")
    }

    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }
}
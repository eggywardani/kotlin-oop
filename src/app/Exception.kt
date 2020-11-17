package app

import exception.ValidationException

fun main() {


    try {
        validateSayHello("Ekkkko")
        validateSayHello("")
        println("Program")

    }catch (error:ValidationException){
        println("Terjadi error : ${error.message}")
    }catch (error: Throwable){
        println("Terjadi error : ${error.message}")
    }finally {
        println("Finally will always be executed")
    }


}

fun validateSayHello(name:String){
    if (name.isBlank()){
        throw ValidationException("name is Blank")
    }else{
        println("Hello $name")
    }
}
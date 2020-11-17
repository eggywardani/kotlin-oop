package data

class User (var userNameParam:String, var passwordParam:String){

    override fun toString(): String {
        return "User with username : $userNameParam"
    }


}
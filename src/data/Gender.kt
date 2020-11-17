package data

enum class Gender(val desc:String) {
    MALE("LAKI"),
    FEMALE("WANITA");
    fun desc(){
        println(desc)

    }
}
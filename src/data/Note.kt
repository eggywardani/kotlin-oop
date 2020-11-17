package data

class Note(title:String) {
    var title:String = title
    get() {
        println("Call Getter Function")
        return field
    }

    set(value) {
        if (value.isNotBlank()){
            field = value
        }else{
            println("Invalid Title")
        }
    }
}


class BigNote(val title: String){
    val bigTitle:String
    get() = title.toUpperCase()


}

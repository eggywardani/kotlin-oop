package data

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty

class Account(desc:String ="") {
    val name:String by lazy {
        println("Name is called")
        "Eggy"
    }

    var desc:String by Delegates.observable(desc){
        property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }
}
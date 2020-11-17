package data

class Address {


    var street:String =""
    var city:String =""
    var country:String ="Indonesia"


    constructor(paramStreet:String, paramCity:String){
        street = paramStreet
        city = paramCity

    }

    constructor(paramStreet:String, paramCity:String, paramcountry:String):this(paramStreet, paramCity){

        country = paramcountry
    }
}
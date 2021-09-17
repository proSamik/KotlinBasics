package com.example.helloworld

fun main(){
    var samik = Person1("Samik", "Choudhury")
    var guest = Person1()
    var lastname = Person1(lastName = "LastName")
}

class Person1(firstName: String = "Guest", lastName: String = "User"){

    //Initializer Block
    init{
        println("Initialised a new Person instance with " +
                "firstname= $firstName & lastname= $lastName")
    }
}
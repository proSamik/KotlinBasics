package com.example.helloworld

fun main(){
    var samik = Person("Samik", "Choudhury", 19)
    samik.hobby = "Cycling"
    samik.stateHobby()
    samik.age = 20
    println("Samik is ${samik.age} years old")

    var xyz = Person()
    xyz.hobby = "to play Video Games"
    xyz.stateHobby()
    println("xyz is ${xyz.age} years old")
}

class Person(firstName: String = "Guest", lastName: String = "User"){
    //Member Variable - Properties
    var age: Int? = null
    var hobby : String = "to watch Netflix"
    var FirstName: String? = null
    var LastName: String? = null

    //Initializer Block
    init{
        this.FirstName = firstName
        this.LastName= lastName
        println("Initialised a new Person instance with " +
                "firstname= $firstName & lastname= $lastName and age= $age")
    }

    //Constructor- Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
                this.age = age
            }

    //Member functions - Methods
    fun stateHobby(){
        println("$FirstName\'s hobby is $hobby")
    }
}
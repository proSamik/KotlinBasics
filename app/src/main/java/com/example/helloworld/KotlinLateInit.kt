package com.example.helloworld

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
    println("brand is ${myCar.myBrand}")
    println("MaxSpeed is ${myCar.maxSpeed}")
    myCar.maxSpeed = 10
    println("MaxSpeed is ${myCar.maxSpeed}")

}

class Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"
    //Custom getter
    get(){
        return field.lowercase()
    }
    init {
        this.owner = "Guest"
    }

    var maxSpeed: Int = 250
// The Upper Code is auto generated
//    get() = field
//    set(value)
//    {
//        field = value
//    }
    get() = field
    set(value)
    {
        field = if(value > 0) value else throw IllegalArgumentException("Max Speed cannot be less than 0")
    }

    var myModel: String ="m5"
        private set

}
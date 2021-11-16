package com.example.helloworld

fun main(){
    myFunction()
    // Storing the return value
    var result = addUp(6,9)
    println("The result is $result")
}

fun myFunction(){
    println("Called from MyFunction")
}

// Method -  a method is a Function is within in a class

    //Parameter Input   //Return type
fun addUp(a:Int, b: Int) : Int{
    return a + b
}

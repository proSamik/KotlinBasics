package com.example.helloworld

fun main(){

    //Arithmetic Operators (+, -, *, /, %)

    //Simple Int operations
    val a= 5
    val b= 3
    var result = a + b
    println("$a + $b = $result")

    result /= 2
    println("8 / 2 = $result")

    result *=3
    println("4 * 3 = $result")

    result %=5
    println("Remainder when 12 divided by 5 = $result")

    //Simple float operations
    val c = 5.0
    val d = 3

    var resultDouble: Double = c/d
    println(resultDouble)

    //a =5, b =3, c= 5.0, d= 3
    //Comparison Operators (==, !=, <, >, <=, >=)
    val isEqual = a==b

    val isNotEqual = a!=d

    println("is5greater3 ${a > b}")
    println("is5LowerEqual3 ${a <= b}")


    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3


    //Increment & Decrement operators (++, --)
    myNum = 1
    println("${myNum++}")
    println(myNum)
    println("${++myNum}")


}
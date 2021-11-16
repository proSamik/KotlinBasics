package com.example.helloworld

//Lambda expression is a function which has no name.
//They are 'function literals', i.e functions that are not declared, but passed immediately as an expression.
//Lambda is defined with curly braces {} which takes variables as a parameter (if any) and a body of a function.
//The body of a function is written after the variable(if any) followed by -> operator.
// Syntax : { variable(s) -> body_of_lambda}

fun main(){
    //Returning
    val sum1: (Int, Int) -> Int = {a: Int, b:Int -> a+b}
    println(sum1(10,5))

    //even shorter
    val sum2 = {a: Int, b:Int -> println(a+b)}
    sum2(10,6)
}
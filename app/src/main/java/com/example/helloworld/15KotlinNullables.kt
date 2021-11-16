package com.example.helloworld

import kotlin.collections.toList as toList1
import kotlin.text.toLowerCase as toLowerCase

fun main(){

    var name: String = "Hello"
    name = "World"
    // name = null -> Compilation ERROR

    var nullableName: String? = "Hello"
    nullableName = null

    var len1 = name.length


    //Old way
    if(nullableName != null){

        var len2 = nullableName.length
    }
    else {
        null
    }

    // new way - the kotlin way
    var len2 = nullableName?.length
    nullableName = "Hello"
    nullableName?.let { println(it.length) }

    //Nullables and the Elvis Operator   (Elvis operator- ?:)
    nullableName = null
    val name1 = nullableName ?: "Guest"
    println("name is $name1")
    nullableName="SSS"
    println(nullableName!!.toString().lowercase())

    //We can perform safe checks

}
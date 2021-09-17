package com.example.helloworld

fun main(){

    /*
    * This is
    * a
    * multi line
    * comment
    */

    // Immutable variable
    val hello = "Hello"

    //Mutable variable
    var myName = "Samik"
    myName = "Samik Choudhury"
    println("$hello, \n$myName")

    // TODO: Add new functionality

    /*
    * Integer TYPES:
    * Byte (8 bit), Short (16 Bit)
    * Int(32 Bit), Long(64 Bit)
    */

    val myByte: Byte = 99
    val myShort: Short = 999_9
    val myInt: Int = 999_999_999
    val myLong: Long = 999_999_999_999_999_999

    /*
    * Floating Point Number Types:
    * Float (32 Bit), Double (64 Bit)
    * */

    val myFloat: Float = 99.99F
    val myDouble: Double = 999_999_999_999.999_999_999_999_999_999

    /*
    * Booleans are type which is used to represent logical values
    * It can have value either true or false only
    * */

    var isMorning: Boolean = true
    isMorning = false

    var isSunday = false
    isSunday = true


    //Characters
    val letterChar= 'A'
    val digitChar = '%'

    //Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    val lengthOfStr = myStr.length
    var lastCharInStr = myStr[lengthOfStr - 1]

    print("First char= $firstCharInStr & Last Char= $lastCharInStr")

}
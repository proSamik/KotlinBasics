package com.example.helloworld
//
//import kotlin.math.floor
//
//fun main(){
//
//    val stringList: List<String> = listOf("Denis", "Frank", "Michael", "Garry")
//
//    val mixedTypeList: List<Any> = listOf("Anil", 31, 5, "BDay", 70.5, "Weighs","kg")
//
//    //General Approach
//    for(value in mixedTypeList){
//        if (value is Int){
//            println("Integer: '$value'")
//        }
//        else if (value is Double){
//            println("Double: '$value' with Floor value: ${floor(value)}")
//        }
//        else if(value is String)
//            println("String: '$value' of length ${value.length} ")
//        else
//            println("Unknown Value")
//    }
//
//    //Alternate
//    for(value in mixedTypeList){
//        when (value) {
//            is Int -> println("Integer: '$value'")
//            is Double -> println("Double: '$value' with Floor value: ${floor(value)}")
//            is String -> println("String: '$value' of length ${value.length} ")
//            else -> println("Unknown Value")
//        }
//    }
//
//    // SMART CAST
//    val obj1: Any = "I have a dram"
//    if (obj1 !is String)
//        println("Not a String")
//    else{
//        //Obj is automatically cast to a String in this scope
//        println("Found a String of length ${obj1.length}")
//    }
//
//    //Explicit (unsafe) Casting using the "as" keyword - can go wrong
//
////    val str1: String = obj1 as String
////    println(str1.length)
//
////    val obj2: Any = 1337
////    val str2: String = obj2 as String
////    println(str2)
//
//    //Explicit (Safe) Casting using the "as?" keyword
//    val obj3: Any = 1337
//    val str3: String? = obj3 as? String //Works
//    println(str3) // Prints null
//
//}
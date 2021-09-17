package com.example.helloworld

fun main(){

    // Conditional Operators- if-else

    var heightOfPerson1 = 175
    var heightOfPerson2 = 180

    if(heightOfPerson1 > heightOfPerson2){
        println("Person 1 is taller")
    }
    else if(heightOfPerson1 == heightOfPerson2){
        println("Both the person has same height")
    }
    else{
        println("Person 2 is taller")
    }

    println("********* if-else with strings **********")

    var myClub = "GDSC"

    if (myClub == "GDSC"){
        println("Then you are at right place to learn Android")
    }
    else{
        println("Visit GDSC to learn Android")
    }

    var isGDSCBest = true
    if (isGDSCBest)
        println("You're right")
    else
        println("You're Wrong")


    println("************ when() - Alternative to long nested if-else statements*************")

    var yearOfStudy = 2

    when(yearOfStudy){

        1 -> println("You need to study 4 years for BE degree")
        2 -> println("You need to study 3 years for BE degree")
        3 -> println("You need to study 2 years for BE degree")
        4 -> println("You need to study 1 year for BE degree")

        else -> println("You don't need to study for BE Degree anymore")
    }

    var age = 16

    when(age){
        !in 17..27 -> println("You are not eligible for Regular Army")
        in 17..19 -> println("Eligible for TES Entry")
        in 21..27 -> println("Eligible for TGC Entry")
        20, 28 -> println("Eligible to prepare for Army")
        else -> println("Try Different Carrer options")
    }

    var x: Any = 13.37F

    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        is Boolean -> println("$x is a Boolean")
        else -> println("$x is none of the default type")
    }

}
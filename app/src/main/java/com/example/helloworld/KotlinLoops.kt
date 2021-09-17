package com.example.helloworld

fun main(){

    //while loop - Entry Control Loop
    var x = 1
    while(x <= 10){
        print("$x ")
        x += 1
    }
    println("\nWhile loop is done")

    // Do While loop - Exit Control Loop

    x = 20

    do {
        print("$x ")
        x++
    }while(x <= 10)

    println("\nDo-While loop is done")


    //While loop another example
    var feltTemp = "cold"
    var roomTemp = 10

    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "Warm"
            println("It's $feltTemp now")
        }
    }


    //For Loop 1st method
    for(num  in 1..10){
        print("$num ")
    }
    println("\nFor Loop 1st is completed")

    //For Loop 2nd method
    for(num in  1 until 10 ){ //Same as - for(i in 1.until(10))
        print("$num ")
    }
    println("\nFor Loop 2nd is completed")

    //For Loop 3rd method
    for(num in  10 downTo 1 ){
        print("$num ")
    }
    println("\nFor Loop 3rd is completed")

    //For Loop 4th method
    for(num in  10 downTo 1 step 2){ //Same as - for(i in 10.downTo(1).step(2))
        print("$num ")
    }
    println("\nFor Loop 4th is completed")

}
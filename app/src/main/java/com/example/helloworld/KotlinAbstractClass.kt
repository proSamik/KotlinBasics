package com.example.helloworld

/*
* An abstract class cannot be instantiated
* However, you can inherit subclasses from an abstract class.
* The members (properties and methods) of an abstract class are non-abstract
* unless you explicitly use the abstract keyword to make them abstract.
*/

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double){ //Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    //Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breathe()

    //Concrete (Non Abstract) Method
    fun displayDetails(){
        println("name: $name, Origin: $origin, " +
                "Weight: $weight, maxSpeed: $maxSpeed")
    }
}

class Human(name: String, origin: String,
            weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        println("Run on two legs")
    }

    override fun breathe() {
        println("Breathe through mouth or nose")
    }
}

class Elephant(name: String, origin: String,
               weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight){

    override fun run() {
        println("Run through four legs")
    }

    override fun breathe() {
        println("breathe through trunk")
    }
}

fun main(){
    val human = Human("Anil","India", 69.0, maxSpeed = 28.0)
    val elephant = Elephant("Maharaj", "India", 5400.0, 60.0)

    human.run()
    elephant.run()

    human.breathe()
    elephant.breathe()

    human.displayDetails()
    elephant.displayDetails()
}
package com.example.helloworld


/*
* The class that inherits the features of another class is called the
* Sub Class, Child Class or Derived Class,
* and the class from whose features' are inherited is called the
* Super Class, Parent Class or Base Class
*/

////Super Class, Parent Class or Base Class
//open class Vehicles{
//    //Properties
//    //methods
//}
//
////Sub Class
//open class Cars : Vehicles(){
//
//}
//
//class ElectricCars: Cars(){
//
//}

//Certain functions have mind, don't implement directly then use Interface
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("This drivable is braking")
    }
}



open class Cars(override val maxSpeed: Double, val name: String, val brand:String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }



    open fun drive(distance: Double){
        println("Car Drove for $distance KM")
    }
}

class ElectricCar(override val maxSpeed: Double, name:String, brand:String, batteryLife: Double)
    : Cars(maxSpeed, name, brand){

        var chargerType = "Type1"

        override var range = batteryLife * 6

        override fun drive(distance: Double){
            println("Drove for $distance KM on electricity")
        }

        override fun drive(): String{
            return "Drove for $range KM on electricity"
        }

    override fun brake() {
        println("The braking is of electric car")
    }
}

//Any Class inherits from the Any Class

fun main(){
    var audiA3 = Cars(230.0,"A3", "Audi")
    var teslaS = ElectricCar(240.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)

    teslaS.drive()

    //Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)

    audiA3.brake()
    teslaS.brake()
}
package com.example.helloworld

// 1 Parameter in definition is minimum requirement
data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"Guest1")

    val name = user1.name
    println(name)
    user1.name = "User1"

    val user2 = User(1, "User1")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="User2")
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) //Print User2

    val (id1,name1) = updatedUser
    println("id = $id1, name= $name1")

}
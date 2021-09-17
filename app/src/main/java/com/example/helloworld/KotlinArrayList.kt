package com.example.helloworld

// ArrayLists are used to create dynamic arrays
// The ArrayList class provides both read and write functionalities
// The ArrayList follows the sequence of insertion order
// An ArrayList is non synchronized and it may contain duplicate elements


//Constructor of ArrayList
//ArrayList<E>():Is used to create a empty ArrayList
//ArrayList(capacity:Int): Is used to create an ArrayList filled with the elements of a collection

//Function of ArrayList
// open fun add(element: E): Boolean -> used to add the specific element into the collection.
// open fun clear() -> used to remove all elements from the collection.
// open fun get(index: Int): E -> used to return the element at specified index in the list.
// open fun remove(element: E): Boolean -> used to remove a single instance of the specific element from current collection, if it is available

fun main(){
    //Adding elements in Arraylist
    val arrayList1 = ArrayList<String>()     //Creating an empty arraylist
    arrayList1.add("One")                    //Adding an object in arrayList
    arrayList1.add("Two")
    println("_______print ArrayList_____")
    for(i in arrayList1){
        println(i)
    }

    //ArrayList Using Collections
    val arrayList2: ArrayList<String> = ArrayList<String>(5)
    var list1: MutableList<String> = mutableListOf<String>()

    list1.add("One")
    list1.add("Two")

    arrayList2.addAll(list1)

    println("_______print ArrayList_____")
    for(i in arrayList2){
        println(i)
    }

    //Filled elements in ArrayList using collections
    val itr = arrayList2.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }
    println("Size of arrayList2= ${arrayList2.size}")


    //ArrayList - get()
    val arrayList3: ArrayList<String> = ArrayList<String>()
    arrayList3.add("three")
    arrayList3.add("four")

    for(i in arrayList3){
        println(i)
    }

    println("_______arrayList.get(1)______")
    println(arrayList3.get(index = 1))
}

package theory_practice

import kotlin.collections.indices as indices1

fun ifElseFormats(): Unit{
    //If expression
    println("\n-> If/else expression")

    //case 1
    var a = 5
    var b = 3
    var m = a

    if (a > b) println("a is greater than b")

    //case 2
    if (a < b){
        println("a is less than b")
    } else {
        println("a is greater than b")
    }

    //case 3
    var result = if (m != 3) println("m is different than 3") else println("m is no different than 3")

}

fun whenFormats(): Unit {
    //When expression
    println("\n-> When expression")

    var n = 1
    var x = 9

    when (n){
        0 -> println("entrance floor")
        in 1..3 -> println("first 3 floors")
        !in 100..101 -> println("floors that do not exist")
        else -> println("Emergency exit")

    }
}

fun whenWithFunction(a: String) = when(a){
    "hi" -> println("Hello!")
    else -> println("Good bye!")

}

fun forLoop(): Unit{
    //For Loops
    println("\n-> For loop expression")

    loop@ for (i in 1..3) println("Iteration -> ${i}")

    loop@ for (i in 0..5){
        println("Iteration -> ${i}")
    }

    println("For with downTo and step")
    loop@ for (i in 9 downTo 3 step 3){
        println("Iteration -> ${i}")
    }

    var arr = listOf<Int>(7, 3, 25, 23, 78)

    loop@ for (i in arr.iterator()){
        println(i)
    }

    arr.forEach {
        println("\n-> For each with array\n ${it}")
    }

}

fun whileLoop(): Unit{
    println("\n-> While loop")

    var n = true
    loop@ while (n){
        println("Simple while")
        n = false
    }

    println("\n-> Do while loop")

    loop@ do {
        println("part of do")
    }while(n)
}


fun returnsJumps(): Unit{
    /*
    Returns and jumps:

        In Kotlin, we can use three structural jump expressions:
        -Return: default it returns from the nearest attached function or anonymous function.
        -Break: ends the nearest surrounding loop.
        -Continue: continues to the next step of the closest surrounding loop.
 */
    println("\n-> Continue")
    for (i in 1..5) {
        println("$i Always printed.")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i Not always printed.")
    }

    println("\n-> Break")
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j != 5) println("return Ok"); break@loop

        }
        println(i)
    }

    println("\n-> Return")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")

}

fun hashCodeExample(): Unit {
    //A set is a collection that has no specific order and does not allow duplicate values.

    println("\n-> HashSet")
    val hashcodeTest = hashSetOf("a")

    //add
    hashcodeTest.add("j")
    hashcodeTest.add("Hola")

    //iteration
    hashcodeTest.forEach{
        println("Iterate: ${it}")
    }

    //remove
    hashcodeTest.remove("j")
    println(hashcodeTest.toString())

    println("\n-> HashMap")
    val hashMapTest = hashMapOf<Int, String>(0 to "Uno")
    val hashMapT2 = hashMapOf<Int, String>(1 to "Dos")
    val hM3 = hashMapTest + hashMapT2

    println(hM3.toString())


    println("\n-> MutableSet")
    val mutableSetT = mutableSetOf(0,1,2,3,4,5)

    //add
    mutableSetT.add(10)

    //Iteration
    mutableSetT.forEach{
        println("Iterate elements of mutableSet: ${it}")
    }

    //remove
    mutableSetT.remove(3)
    println(mutableSetT.toString())

    //size
    println("Size of my mutableSet: ${mutableSetT.size}")

    //contains
    println("My mutableSet contain 7: ${mutableSetT.contains(7)}")


    println("\n-> MutableMap")
    val mutableMapT = mutableMapOf<Int, String>(0 to "Happy", 1 to "Sad", 2 to "Funny")

    //Iterate
    mutableMapT.forEach{
        println("Iterate elements: "+ it.key +" - "+ it.value)
    }

    //remove
    mutableMapT.remove(0)
    println(mutableMapT.toString())

    //size
    println("Size of my mutableMap: ${mutableMapT.size}")

    //contains
    println("My mutableSet contain key 1: ${mutableMapT.contains(1)}")


    //Summary

    //Arrays store ordered data of the same type, and have a fixed size.
    //Arrays are used to implement many of the other collection types.
    //Lists are a resizable, ordered collection.
    //Sets are unordered collections and cannot contain duplicates.
    //Maps work similarly to sets and store pairs of keys and values of the specified type.

}
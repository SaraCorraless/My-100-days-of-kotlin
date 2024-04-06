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
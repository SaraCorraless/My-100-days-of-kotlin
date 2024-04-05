package theory_practice

fun ifElseFormats(): Unit{
    //If expression

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
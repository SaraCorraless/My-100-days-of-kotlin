package theory_practice

fun arrayExample(): Unit {
    //An array contains several values called elements or sometimes objects.
    //The elements of an array are ordered with an index and are accessed through it.
    //To declare an array in code, use the arrayOf() function.

    val arrayTest = arrayOf<Int>(1,2,3,4)
    //Array data type array Of(1,2,3,4) can be omitted
    val arrayT = arrayOf(5,6,7,8)

    val allArray = arrayTest + arrayT

    allArray.forEach {
        println("Array element: "+ it)
    }
    //add element
    allArray[allArray.size-1] = 9

    //remove element
    allArray.toMutableList().removeAt(6)  //there is no proper function of an array
    allArray.forEach {
        println("Array element test 2: "+ it)
    }

    //get element
    println("\nelement 5: " + allArray.get(5))
    
}


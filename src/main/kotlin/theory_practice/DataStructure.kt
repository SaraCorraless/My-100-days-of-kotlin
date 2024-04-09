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

fun listExample(): Unit {
    //It is a resizable array in which we can store all types of data or objects.
    //With a list, you can also insert new elements between other elements in a specific index.

    //List: is an interface that defines properties and methods related to an ordered, read-only collection of elements.

    //MutableList: extends the List interface by defining methods for modifying a list, such as adding or removing elements.
    // With this option we can modify the list by adding or deleting elements

    val listTest = listOf("H", "o", "L", "A")
    println(listTest.toString())

    val listT2 = listOf<Int>(5,3,1)
    println(listT2.toString())
    println("List size listTest: ${listTest.size}")
    println("Position 3: ${listTest[3]}")



    //iterate list
    listT2.forEach {
        println("Iterate: "+ it)
    }

    val mutableListTest = mutableListOf<Int>(2, 4, 3, 1, 11, 43)
    //add element
    mutableListTest.add(33)

    //remove element
    mutableListTest.remove(11)

    println(mutableListTest.toString())

    //Contains
    println("Contains element: "+ mutableListTest.contains(33))


}


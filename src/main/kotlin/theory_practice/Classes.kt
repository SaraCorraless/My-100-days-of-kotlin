package theory_practice

import classes.Book

//Classes provide blueprints from which objects can be built. An object is an instance of a class that consists of data specific to that object.
//Object-oriented programming basics:
    //Encapsulation: Wraps properties and related methods that perform actions on those properties in a class.
    //Abstraction: It is an extension of encapsulation. The idea is to hide the internal implementation logic as much as possible.
    //Inheritance: Allows you to create a class based on the characteristics and behavior of other classes by establishing a parent and child relationship.
    //Polymorphism: It is the ability to use different objects in a common way.

fun useClasses(): Unit{
    var comic = Book("Marvel", 30)
    var num = 0
    var numRandom: Int = 0
    num = comic.numPages
    do {
        numRandom = comic.readPages(num)
        if ( numRandom <= num){
            num = num - numRandom
            println("Pages read: ${num}")
        }
    }while (num != 0)


}

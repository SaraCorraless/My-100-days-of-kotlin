package theory_practice

import classes.Dog

fun scopeFunctions(): Unit{
    println("\n-> Scope functions")

    /*
    Using Run, with and apply we use this, and we can access the members of that object within the block.
     */

    //Run and this
    val miDog: Dog = Dog("BettyTest", "YorkshireTest", 9)
     miDog.run {
         this.name = "Betty"
         this.breed = "Yorkshire"

         println(this.toString())
     }

    /*
    Using let and also we use it and they obtain the context of the object through a lambda argument, that is, the object is passed to them.
     */

    //Let and it
    miDog.let {
        it.name = "Betty2"

        it.givePaw()
    }

    miDog.let { miDog->
        miDog.name = "Betty3"
        println( miDog.toString())

    }

    //Returns the context of the object
    /*
    The value that will be returned by the object itself to which the scope functionality is being applied.
    These functions are apply and also.
     */

    val miDog2 = Dog().apply {
        this.name = "Thor"
        this.breed = "Bull dog"
        this.age = 2
    }
    println(miDog2)

    val miDog3 = Dog().also {
        it.name = "Rita"
        it.age = 1
        it.breed = "dachshund"
    }
    println(miDog3)

    //Returns the result of the lambda
    /*
    Returns the last object of the lambda itself.
    The scope functions that allow this function are let, run, and with.
     */

    val miDog4 = Dog().let { tempDog ->
        tempDog.name = "Ron"
        tempDog.breed = "dachshund"
        tempDog.age = 5

    }

    val miDog5 = Dog().run {
        this.name = "Pita"
        this.breed = "dachshund"
        this.age = 4
    }

    val miDog6 = with(Dog()){
        this.name = "Nico"
        this.breed = "dachshund"
        this.age = 3
    }


    //Summary:
    /*
    1- You will need to return an object and you are only going to apply members of the object within the block so apply.
    2- If you were to include variables external to the block, also.
    3- If we want to return the last line of the block we would have to see if you need to check if the object is null, if not, with.
    4- If you need to check if the object is null we would have to see between let and run, let passes the object as an argument and
    allows us to change the name and run reference to the object by accessing its variables within the block.
     */

}
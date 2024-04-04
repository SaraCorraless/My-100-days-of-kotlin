package theory_practice

fun unaryOperator(): Unit {
    println("\n-> Unary operators")

    val a = 2

    println("Positive "+ (+a))
    println("Positive with equivalent function  "+ a.unaryPlus())

    println("Negative "+ (-a))
    println("Negative with equivalent function  "+ a.unaryMinus())
}

fun arithmeticOperator(): Unit{
    println("\n-> Aritmetic operators")

    val num1 = 20
    val num2 = 4

    //Addition
    println("Addition "+ (num1+num2))
    println("Addition with equivalent function  "+ num1.plus(num2))

    //Subtraction
    println("Subtraction "+ (num1-num2))
    println("Subtraction with equivalent function  "+ num1.minus(num2))

    //Multiplication
    println("Multiplication "+ (num1*num2))
    println("Multiplication with equivalent function  "+ num1.times(num2))

    //Division
    println("Division "+ (num1/num2))
    println("Division with equivalent function  "+ num1.div(num2))

    //Residue
    println("Residue "+ (num1%num2))
    println("Residue with equivalent function  "+ num1.rem(num2))

}

fun compositeAssignmentOperators(): Unit {
    println("\n-> Composite assignment operators")

    var num1 = 112
    val num2 = 5

    num1+=num2
    println("Addition += $num1")  //num1.plusAssign(num2)

    num1-=num2
    println("Subtraction -= $num1")  //num1.minusAssign(num2)

    num1*=num2
    println("Multiplication *= $num1")  //num1.timesAssign(num2)

    num1/=num2
    println("Division /= $num1")  //num1.divAssign(num2)

    num1%=num2
    println("Residue %= $num1")  //num1.remAssign(num2)

}


fun incrementDecrementOperators(): Unit{
    println("\n-> Increment And Decrement Operators")
    var num = 2

    println("Increment in prefix ++2 ${++num}")
    println("Increment in suffix 2++ ${num++}")

    println("Decrement in prefix --2 ${--num}")
    println("Decrement in suffix 2-- ${num--}")
}

fun relationalOperators(): Unit{
    println("\n-> Relational Operators")
    val a = 5
    val b = 8

    //equal
    println("Equal -> ${a==b}")
    println("Equal with equivalent function -> ${a.equals(b)}")

    //different
    println("Different -> ${a!=b}")
    println("Different with equivalent function -> ${!(a.equals(b))}")

    //less than
    println("Less than -> ${a<b}")
    println("Less than with equivalent function -> ${a.compareTo(b)<0}")

    //greater than
    println("Greater than -> ${a>b}")
    println("Greater than with equivalent function -> ${a.compareTo(b)>0}")

    //less than or equal
    println("Less than or equal -> ${a<=b}")
    println("Less than or equal with equivalent function -> ${a.compareTo(b)<=0}")

    //greater than or equal
    println("Greater than or equal -> ${a>=b}")
    println("Greater than or equal with equivalent function -> ${a.compareTo(b)>=0}")

}

fun logicalOperators(): Unit{
    println("\n-> Logical operators")
    var a = (5==5)
    var b = (10>20)


    //AND
    println("a and b ->${a && b}")

    //OR
    println("a or b ->${a || b}")

    //NOT
    println("not a ->${!a}")

}

fun bitLevelOperators(): Unit{
    println("\n-> Bit Level Operators")

    //Functions
    val a2 = 0b110101
    val b2 = 0b101010
    println("Function and -> ${a2.and(b2)}")
    println("Function or -> ${a2.or(b2)}")
    println("Function xor -> ${a2.xor(b2)}")
    println("Function inv -> ${a2.inv()}")
    println("Function shl -> ${a2 shl b2}")
    println("Function shr -> ${a2 shr b2}")
    println("Function ushr -> ${a2 ushr b2}")

}
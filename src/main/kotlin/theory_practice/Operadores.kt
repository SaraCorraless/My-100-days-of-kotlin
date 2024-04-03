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
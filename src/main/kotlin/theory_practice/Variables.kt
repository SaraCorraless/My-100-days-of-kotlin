package theory_practice


/*
    multi-line comment
*/

//simple comment

fun syntax(): Unit {

    //print text by console with line break
    println("This is a line break")

    //print text by console in one line
    print("Hi world! ")

}

fun variables(): Unit{
    //simple variable
    var sV1: Boolean = true //type boolean
    var sV2 = false

    //constant variable
    //just a value assignment
    val cV: Char = 'K' //type character

    var S: String = "test" //type String

    var i: Int = 2 //type Integer  min-> -2.147.483.648  max-> +2.147.483.647

    var f: Float = 1.2f //type Float

    var d: Double = 30.7 //type Double: more precise that float

    var b: Byte = 20 //type Byte  min-> -128    max->  +127

    var sh: Short = 2020 //type short  min-> -32 768   max-> +32 767

    var l: Long = 1500300200 //type Long  min-> -9.223.372.036.854.775.808  max-> +9.223.372.036.854.775.807

}
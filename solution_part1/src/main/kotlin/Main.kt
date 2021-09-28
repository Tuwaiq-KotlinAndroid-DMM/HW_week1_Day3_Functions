
// Part I - Practice with functions.
//Question 1
//
//Create a function called add() that takes two input numbers and returns the sum of these numbers.

fun add(x:Int,y:Int){
    var z = x+y
    println("The summation of $x and $y is $z")
}

//Question 2
//
//Create a function called fullName() that takes three inputs strings which are first, middle, and last name, and returns the full name.

fun fullname(f:String,m:String,l:String){
    print("Nice to meet you  $f $m $l :)")
}

//======================================================================================================================
//======================================================================================================================

fun main(args: Array<String>) {
    print("Please enter the first value: ")
    var a = readLine()!!.toInt()
    print("Please enter the second value: ")
    var b = readLine()!!.toInt()

    add(a,b)

    print("Please enter your first name: ")
    var f: String = readLine()!!.toString()
    print("Please enter your middle name: ")
    var m: String = readLine()!!.toString()
    print("Please enter your last name: ")
    var l: String = readLine()!!.toString()

    fullname(f,m,l)
}



//Challenge 1: Mathematical Operations
//
//Create a function called math() that takes two input numbers and that will do Add, Subtract, Multiply,
// and Divide between these two numbers, and return the operator's name with its result.

fun math(x:Int,y:Int){
    var Add = (x + y)
    println("add: $Add")
    var Subtract = (x - y)
    println("Subtract: $Subtract")
    var Multiply = (x * y)
    println("Multiply: $Multiply")
    var Divide = (x / y)
    println("Divide: $Divide")
}

fun main(args: Array<String>) {
    print("Please enter the first number: ")
    var x = readLine()!!.toInt()
    print("Please enter the second number: ")
    var y = readLine()!!.toInt()
    math(x,y)

}
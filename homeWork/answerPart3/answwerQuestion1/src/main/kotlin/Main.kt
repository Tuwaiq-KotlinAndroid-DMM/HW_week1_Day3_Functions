fun main(args: Array<String>) {
    // What program doing
    println("The program for enter two numbers and it's calculate the sum ,multiply , subtract and divide")

    // Declare the variables
    // massage for user to input the numbers

    println("Enter the first number: ")
    var numberOne = readLine()!!.toInt()
    println("Enter the secound number: ")
    var numberTwo = readLine()!!.toInt()

    // Declare the variable for save result
    var output: String
    output = math(numberOne,numberTwo)

    // Print output
    println(output)
}

fun math (numberOne: Int, numberTwo:Int):String{
    var sum = numberOne + numberTwo
    var multiple = numberOne * numberTwo
    var subtract = numberOne - numberTwo
    var divide =
        if (numberTwo != 0)
        numberOne / numberTwo
    else
        "connot divide by 0"


    return "The Sum is: $sum \n" +
            "The multiply is: $multiple \n" +
            "The subtract is: $subtract \n" +
            "The divide is: $divide \n"
}
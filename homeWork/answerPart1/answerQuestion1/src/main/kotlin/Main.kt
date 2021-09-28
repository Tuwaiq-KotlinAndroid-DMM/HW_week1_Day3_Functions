fun main(args: Array<String>) {
    // This program for calculate sum two numbers

    // Massege for user to input frist number
    println("Enter frist number: ")
    // Declare the variables
    var numberOne = readLine()!!.toInt()
    // Massege for user to input frist number
    println("Enter scound number: ")
    // Declare the variables
    var numberTwo = readLine()!!.toInt()

    // Declare the variables for save the sum of calculate
    var sum = add(numberOne,numberTwo)
    // Print the sum
    println("The sum is: $sum")



}
// This function for calculate two numbers
fun add (numberOne: Int , numberTwo: Int):Int {
    // return the sum of two numbers
    return numberOne + numberTwo
}
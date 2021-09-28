fun main(args: Array<String>) {

    // print what programming doing
    println("The program extracts the maximum number from among the three input numbers")

    // Declare variables and have the user enter the value for three numbers

    // Print massege for user to enter Frist number
    println("Enter Frist number: ")

    // Declare Frist variable and the user enter the value
    var fristNumber : Int = readLine()!!.toInt()

    // Print massege for user to enter Second number
    println("Enter Second number: ")

    // Declare Second variable and the user enter the value
    var secondNumber : Int = readLine()!!.toInt()

    // Print massege for user to enter Third number
    println("Enter Third number: ")

    // Declare Third variable and the user enter the value
    var thirdNumber : Int = readLine()!!.toInt()

    // Print a message to the user with the numbers he entered
    println("Your numbers is: $fristNumber , $secondNumber , $thirdNumber")

    maximum(fristNumber,secondNumber,thirdNumber)
}

val maximum : (Int, Int, Int) -> Unit = {
    fristNumber, secondNumber, thirdNumber ->

    // Compare the first number with the second number
    if (fristNumber > secondNumber){
        // Compare the first number with the third number
        if (fristNumber > thirdNumber){
            println("The maximum number: $fristNumber")
        }
        else{
            println("The maximum number: $thirdNumber")
        }
    }
    // Compare the second number with the third number
    else if (secondNumber > thirdNumber) {
        println("The maximum number: $secondNumber")
    }
    // If not first number greater than second number and second number not greater than third number
    else {
        println("The maximum number: $thirdNumber")
    }



}
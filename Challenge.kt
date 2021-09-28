fun main() {
    println("Please Enter two numbers")
    print("Please Enter first number here:")
    val num1 = readLine()!!.toInt()
    print("Please Enter second number here:")
    val num2 = readLine()!!.toInt()
    val result = math(num1,num2)
    print(result)
}

fun math(num1: Int, num2: Int): String {
    val addition = num1+num2
    val Subtraction = num1-num2
    val multiplication = num1*num2
    val division = num1/num2
    return(" Add: $addition \n Subtract: $Subtraction \n multiply: $multiplication \n Divide:$division ")


}
fun main() {
    print("Enter first number: ")
    var num1 = readLine()!!.toInt()
    print("Enter second number: ")
    var num2 = readLine()!!.toInt()
    print("Enter third number: ")
    var num3 = readLine()!!.toInt()
    if (num1 > num2 && num1 > num3)
        println("The largest number is ${mx(num1, num2, num3)}")
    else if (num2 > num1 && num2 > num3)
        println("The largest number is ${mx1(num1, num2, num3)}")
    else if (num3 > num1 && num3 > num2)
        println("The largest number is ${mx2(num1, num2, num3)}")
    // if user put 2 number equal and greater than third number
    else if (num1 == num2 && num1 > num3)
        println("The largest number is ${mx(num1, num2, num3)}")
    else if (num1 == num3 && num1 > num2)
        println("The largest number is ${mx(num1, num2, num3)}")
    else if (num2 == num1 && num2 > num3)
        println("The largest number is ${mx1(num1, num2, num3)}")
    else if (num1 == num2 && num1 == num2)
        println("they are equal!")


}

val mx: (Int, Int, Int) -> Int = { a: Int, b: Int, c: Int -> a }
val mx1: (Int, Int, Int) -> Int = { a: Int, b: Int, c: Int -> b }
val mx2: (Int, Int, Int) -> Int = { a: Int, b: Int, c: Int -> c }
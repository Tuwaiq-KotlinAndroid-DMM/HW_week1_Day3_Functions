fun main(args: Array<String>) {

    /* Question 3
    Create an anonymous function called maximum() that takes three number
    as input and return the largest one of these numbers.*/

    println("The largest number is "+ maximum(10,14,12))
}

val maximum:(Int,Int,Int) -> Int = {number1,number2,number3 ->

    var greatestNumber =number1
    if (greatestNumber <= number2) {
        greatestNumber = number2
    }
    if (greatestNumber <= number3) {
        greatestNumber = number3
    }
    greatestNumber
}
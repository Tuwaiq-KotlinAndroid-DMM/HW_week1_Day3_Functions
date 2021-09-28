fun main(args: Array<String>) {


/* Question 1
 Create a function called add() that takes two input numbers and returns the sum of these numbers.*/
    //Q1(calling add function)
    println(add(10, 12))

/*Question 2
Create a function called fullName() that takes three inputs strings which are
 first, middle, and last name,and returns the full name*/

    //Q2(calling fullName function)
    println(fullName("Ahmed", "Abdullah", "Al Waleed"))
}

// Q1(The add function)
fun add(number1: Int, number2: Int): Int {
    return number1 + number2

}

// Q2(The fullName function)
fun fullName(firstName: String, middleName: String, lastName: String): String {
    return "$firstName $middleName $lastName"

}
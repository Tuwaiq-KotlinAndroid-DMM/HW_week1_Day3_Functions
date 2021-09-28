fun main(args: Array<String>) {
    // Part 1 - Practice Function
    // Question 1 - add function
    println(add(10, 12))

    // Question 2 - full name function
    println(fullName("Ahmed", "Abdullah", "Al Waleed"))
}
fun add(num1:Int, num2:Int) : Int {
    return num1 + num2
}
fun fullName(first:String, middle:String, last:String) : String {
    return ("$first $middle $last")
}
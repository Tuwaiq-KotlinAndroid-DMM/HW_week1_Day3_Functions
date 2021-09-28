fun main(args: Array<String>) {
    // declaring fun for Q1
    println(add(10, 12))
    // declaring fun for  Q2
    println(fullName("Ahmed", "Abdullah", "Al Waleed"))
}

// creating add fun (Q1)
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

// creating fullName fun (Q2)
fun fullName(first: String, middle: String, last: String): String {
    return ("$first $middle $last")
    
}
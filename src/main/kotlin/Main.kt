fun main(args: Array<String>) {
    var num1 = 10
    var num2 = 12
    add(10, 12)
    fullname("ahmad","abdullah","alwaleed")
}

fun add(num1: Int, num2: Int) {
    println(num1 + num2)
}
fun fullname(first: String, middle: String, last: String) {

    println("the name is $first $middle $last")
}
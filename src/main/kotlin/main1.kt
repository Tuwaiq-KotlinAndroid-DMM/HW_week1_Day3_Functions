fun main(args: Array<String>) {

    print("Entre first number: ")
    var num1 = readLine()!!.toInt()
    print("Entre second number: ")
    var num2 = readLine()!!.toInt()
    println(add(num1, num2))
}

fun add(a: Int, b: Int) = a + b

fun main(args: Array<String>) {

    print("enter operation: ")
    var o = readLine()

    print("Entre num1: ")

    var num1 = readLine()!!.toInt()
    print("Entre num2: ")
    var num2 = readLine()!!.toInt()
    when (o) {
        "+" -> print(ad(num1, num2))
        "-" -> print(minus(num1, num2))
        "*" -> print(times(num1, num2))
        "\\" -> print(div(num1, num2))
    }
}

fun ad(x: Int, y: Int): Int {
    return x + y
}

fun minus(x: Int, y: Int): Int {
    return x - y
}

fun times(x: Int, y: Int): Int {
    return x * y
}

fun div(x: Int, y: Int): Int {
    return x / y
}

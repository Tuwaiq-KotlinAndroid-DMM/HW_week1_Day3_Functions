fun main(args: Array<String>) {
    println("Enter number")
    var a = readLine()!!.toInt()
    println("Enter number")
    var b = readLine()!!.toInt()
    println("Enter number")
    var c = readLine()!!.toInt()
    var sum1 = sum(10, 15, 12)
    println(sum1)
}

val sum: (Int, Int, Int) -> String = { a, b, c ->
    if (a > b && a > c)
        "The largest number $a"
    else if (b > a && b > c)
        "The largest number $b"
    else
        "The largest number $c"
}
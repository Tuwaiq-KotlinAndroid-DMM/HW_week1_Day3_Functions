var fireBallsRemaining = 30
fun main() {
    println("PLease enter two integers")
    print("The first integer: ")
    var num1: Int = readLine()!!.toInt()
    print("The second integer: ")
    var num2: Int = readLine()!!.toInt()
    println(math(num1, num2))
    println("remaining fuel: " +castFireball())

}

fun math(num1: Int, num2: Int): String {
    var add = num1 + num2
    var subtract = num1 - num2
    var multiply = num1 * num2
    var divide = num1 / num2


    var text = "Add: $add\nSubtract: $subtract\nMultiply: $multiply\nDivide: $divide"
    return text

}

fun castFireball(): Int {
    if (fireBallsRemaining > 1 && fireBallsRemaining <= 50) {
        fireBallsRemaining -= 1
    }
    return fireBallsRemaining
}


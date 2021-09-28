fun main() {
    //Q3
    val maximum: (Int, Int, Int) -> Int = { num1, num2, num3 ->
        if (num1 > num2 && num1 > num3) {
            num1
        } else if (num2 > num1 && num2 > num3) {
            num2
        } else if (num3 > num1 && num3 > num2) {
            num3
        } else {
            0
        }
    }
    println("please enter three numbers:")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()
    var max = maximum(num1,num2,num3)
    if (max != 0 ){
        println("The maximum is " + max)
    } else {
        println("There is no absolute maximum")
    }
}
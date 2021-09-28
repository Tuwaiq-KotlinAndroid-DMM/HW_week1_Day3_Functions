fun main(args: Array<String>) {
    val maximum: (Int, Int, Int) ->String= {
        num1,num2,num3 ->
        if (num1 >= num2 && num1 >= num3) {
           ("the largest number is $num1")
        }else if (num2 >= num1 && num2 >= num3){
            ("the largest number is $num2")
        }else ("the largest number is $num3")
    }
    println(maximum(10,14,12))
}
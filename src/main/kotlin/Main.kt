fun main(args: Array<String>) {
    maximum(10, 12, 18)
}
val maximum = fun(num1: Int, num2: Int, num3: Int) {

    if (num1 >= num2) {
        if (num1 >= num3) {
             " the greatest number is $num1 "
        }
    } else if (num2 >= num3) {
        " the greatest number is $num2 "
    } else
       println (" the greatest number is $num3 ")
}
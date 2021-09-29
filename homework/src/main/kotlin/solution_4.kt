fun main(){
    var number1=2
    var number2=3

    println(math(number1,number2))





}
fun math(num1:Int,num2:Int):String{
    var add=num1+num2
    var sub=num1 -num2
    var mul=num1 *num2
    var di=num1/num2
    return "add is: $add \nSubtract is: $sub \nMultiply is: $mul \nDivide is: $di"

}
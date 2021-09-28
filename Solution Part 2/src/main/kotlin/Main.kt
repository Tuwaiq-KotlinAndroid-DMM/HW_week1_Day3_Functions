
//Question 3
//
//Create an anonymous function called maximum() that takes three number as input and return the largest one of these numbers.

val maximum : (Int,Int,Int) -> String = { num1:Int, num2:Int, num3:Int ->
    if(num1 > num2 && num1 > num3){
       " The number $num1 is the greatest" }
    else if(num2 > num1 && num2 > num3){
        " The number $num2 is the greatest" }
    else if(num3 > num1 && num3 > num2){
        " The number $num3 is the greatest"
    }else{
        ""
    }

}

fun main(args: Array<String>) {
    print("Enter the first number: ")
    var a = readLine()!!.toInt()
    print("Enter the second number: ")
    var b = readLine()!!.toInt()
    print("Enter the third number: ")
    var c = readLine()!!.toInt()
    println(maximum(a,b,c))
}
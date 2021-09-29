fun main(){

/*
    Question 3
    Create an anonymous function called maximum() that takes three number as input and return the largest one of these numbers.

    fun main() {
        println(maximum(10,14,12))
    }

    Output: "The largest number is 14"


    */
    println("Please Enter three numbers")
    print("Please Enter first number here:")
    val num1 = readLine()!!.toInt()
    print("Please Enter Second number here:")
    val num2 = readLine()!!.toInt()
    print("Please Enter third number here:")
    val num3 = readLine()!!.toInt()
    print(maximum(num1,num2,num3))
}
val maximum:(Int,Int,Int) ->{num1:Int,num2:Int,num3:Int:Int->
    return if (num1 <= num2 && num1 <= num3) {
        return num1
    } else if (num2 <= num1 && num2 <= num3) {
        return num2
    } else {
        num3
    }
}


}
// val any:() ->{
// }
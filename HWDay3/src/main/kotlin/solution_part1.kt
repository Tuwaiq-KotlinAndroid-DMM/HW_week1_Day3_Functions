fun main(){
    println("Please enter two numbers: ")
    var num1:Int = readLine()!!.toInt()
    var num2:Int = readLine()!!.toInt()

    println(add(num1,num2))
    println("please enter your first name: ")
    var first = readLine()
    println("please enter your middle name: ")
    var second = readLine()
    println("please enter your last name")
    var third = readLine()
    println(fullName("Ali","Saeed","Almatrood"))
}

//Q1
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

//Q2
fun fullName(first:String, middle:String, last:String): String{
    return "$first $middle $last"

}

////Part 1 Q1
//fun main() {
//    println("x:")
//    var x: Int = readLine()!!.toInt()
//    println("y:")
//    var y: Int = readLine()!!.toInt()
//    println("The sum of the numbers is:"+ add(x,y))
//}
//fun add(x:Int, y:Int):Int{
//    return (x+y)
//}
////Part 1 Q2
//fun main(){
//    val fullName:(String,String,String) ->  String = {name, name1,name2 ->
//        "Hello $name $name1 $name2"
//    }
//    println(fullName("belal","hamid","alrammah"))
//}
////Part 2 Q3
//fun main() {
//val maximum : (Int, Int, Int) -> Int = {
//        n1,n2,n3 ->
//    if (n1 > n2 && n1 > n3)
//        n1
//    else if (n2 > n3 && n2 > n1)
//        n2
//    else n3
//}
//  println("The greatest number is " +maximum(12,11,22))
//}

////part 3 challenge 1 (Opitnal)
//fun add(x:Int, y:Int):Int{
//    return (x+y)
//}
//fun div(x:Int,y: Int):Int{
//    return (x/y)
//}
//fun mul(x: Int,y: Int):Int{
//    return (x*y)
//}
//fun minus(x: Int,y: Int):Int{
//    return (x-y)
//}
//fun main (){
//    println("Type the number and press enter then /,*,+,or- and press enter then the another number and enter:")
//    line()
//
//
//}
//fun line(){
//    var m = readLine()!!.toInt()
//    var a = readLine()!!.toString()
//    var b = readLine()!!.toInt()
//    when (a) {
//        "+" -> println(add(m,b))
//        "/" -> println(div(m,b))
//        "-" -> println(minus(m,b))
//        "*" -> println(mul(m,b))
//        else -> println("you should type the right char  /,*,+,- at the second line")
//    }}
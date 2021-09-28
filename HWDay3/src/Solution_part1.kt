fun main()
{
    println(add(10,12))
    println(fullname("Ahmed","Abdullah","Al Waleed"))
}

fun add(x:Int,y:Int):Int{
    return (x +y)

}

fun fullname(first:String,second:String,last:String):String{
    return("$first $second $last")
}
fun main()
{
math(2,3)
println(castFireball(5))
}
fun math(num1:Int,num2:Int)
{
    var sum=num1+num2
    var sub=num1-num2
    var mult=num1 * num2
    var div=num1/num2
    println("Add: $sum")
    println("Subtract: $sub")
    println("Multiply: $mult")
    println("Divide: $div")
}


fun castFireball(castnum:Int,fuel:Int=50): String {
var remain=fuel-castnum
    if(remain<1)
    {
        return ("Fuel level: $remain , no more fuel left")
    }
    else
    {
        return ("Fuel level: $remain ,enough fireballs")
    }
}
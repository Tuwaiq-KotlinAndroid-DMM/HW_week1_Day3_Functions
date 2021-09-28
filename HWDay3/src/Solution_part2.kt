fun main()
{
println(maximum(10,14,12))
}

val maximum=fun(num1:Int, num2:Int,num3: Int): String {
 if(num1>num2 && num1>num3)
    {
      return("$num1 is the greatest")
    }
        else if(num2>num3)
    {
        return("$num2 is the greatest")
    }
        else
    {
       return( "$num3 is the greatest")
    }
    }
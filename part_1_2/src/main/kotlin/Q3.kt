fun main(args: Array<String>) {


val maximum:(String,String,String) -> String = {n1,n2,n3 ->
    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else
        println("$n3 is the largest number.")
    "GoodBuy"
}
println(maximum(readLine() !!.toString(),readLine() !!.toString(),readLine() !!.toString()))
}

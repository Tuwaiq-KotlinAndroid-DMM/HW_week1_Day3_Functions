fun main(args: Array<String>) {


    var num1 = 10
    var num2 = 14
    var num3 = 12


    println(maximum(num1, num2, num3))
}

val maximum: (Int, Int, Int) -> String = { n1: Int, n2: Int, n3: Int ->
    if (n1 >= n2 && n1 >= n3)
        "the largest number is $n1"
    else if (n2 >= n3 && n2 >= n1)
        "the largest number is $n2"
      else
    "the largest number is $n3"

}



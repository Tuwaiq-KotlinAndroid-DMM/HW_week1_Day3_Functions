fun main(args: Array<String>) {
    maximum (10,12,18)
    println(maximum(10,12,18))

}

val maximum = fun (n1: Int, n2: Int, n3: Int) {
    if (n1 >= n2)  {
        if (n1 >= n3)
            (" the greatest number is $n1 ")

    } else if (n2 >= n3) {
        (" the greatest number is $n2 ")
    } else
        println(" the greatest number is $n3 ")
}

fun main(args: Array<String>) {

    maximum  (10 , 12, 18)
    println()


}

val maximum = fun(n1:Int , n2:Int , n3:Int) {
    if (n1>=n2){
        if (n1>=n3){
            "the greatest number is $n1"
        }
    } else if (n2 >= n3) {
        "the greatest numberis $n2"

    } else
        println("the greatst number is $n3")
}
fun main() {


    println(maximum(10 , 12, 18))

}

val maximum :(Int ,Int , Int) -> String = { n1 , n2 , n3 ->
    var max = n1
    if (n1>=n2){
        if (n1>=n3){
            max = n1
//            "the greatest number is $n1"
        }
    } else if (n2 >= n3) {
        max = n2
//        "the greatest numberis $n2"

    } else
        max = n3
//        println("the greatst number is $n3")
    "the greatst number is $max"
}
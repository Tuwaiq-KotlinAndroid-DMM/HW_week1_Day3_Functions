fun main(args: Array<String>) {

 maximum(8,10,25)
    println(maximum(8,10,25))
}

var maximum:  (Int, Int, Int) -> String = {
        n1,n2,n3 ->
    var maxNum = 0

    if (n1 > n2 && n1 > n3) {
        maxNum = n1
    } else if(n2 > n1 && n2 > n3) {
        maxNum = n2

    }
    else if (n3 > n1 && n3 > n2) {
        maxNum = n3

    }
"the maximum number is $maxNum"
}



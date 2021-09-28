
fun main(args: Array<String>) {
    maximum (11, 44, 2)
}
    var maximum = fun(a: Int, b: Int, c: Int): Int {


        if (a >= b && a >= c) {
            println("$a is the maximum number.")
        }else if (b >= a && b >= c) {
            println("$b is the maximum number.")
        }else {
            println("$b is the maximum number.")
        }

}
fun main(args: Array<String>) {
    println(math(2, 3))
}

fun math(nu1: Int, nu2: Int): String {
    var sum = nu1 + nu2
    var sub = nu1 - nu2
    var multi = nu1 * nu2
    var div = nu1 / nu2

    var result = "add: $sum , subtract:$sub , multiply:$multi , Divide: $div "
    return result


}
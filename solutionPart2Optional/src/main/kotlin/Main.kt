fun main(args: Array<String>) {

val result = math (2,3)
println("the add is: $result")
println("the dedu is $result")

}


val math = {a: Int, b: Int -> val add = a + b
add.toString()
    val dedu = a - b
    dedu.toString()
}
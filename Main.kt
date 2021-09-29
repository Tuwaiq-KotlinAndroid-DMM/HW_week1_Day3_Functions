

fun main(args: Array<String>) {

    add(10, 12)

    println(name("Ahmed" , "abdulla" , "Alwaleed"))
}

//part1 Q1
fun add(a: Int, b: Int) {
    println(a + b)
}

//Part1 Q2

fun name (firstName:String , secondName:String , lastName:String) : String {

    var fullName = firstName + " " +secondName + " "+lastName

    return fullName

}

















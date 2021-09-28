fun main(args: Array<String>) {

    print("Entre first name: ")
    var first = readLine()!!.toString()
    print("Entre father name: ")
    var father = readLine()!!.toString()
    print("Enter family name: ")
    var family = readLine().toString()
    println(full_name(first,father,family))
}

fun full_name(x:String,y:String,z:String):String{
    return x+" "+ y+" " + z

}


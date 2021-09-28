fun main(args: Array<String>) {
    println(FullName(fName = readLine() !!.toString(), mName = readLine() !!.toString(),lName =readLine() !!.toString()))
}
fun FullName(fName: String, mName: String, lName:String): String {
    return "$fName $mName $lName "

}



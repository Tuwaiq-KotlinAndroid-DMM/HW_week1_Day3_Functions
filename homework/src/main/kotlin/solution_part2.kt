fun main()
{
    var firstName = "Ahmed"
    var midName="Abduallah"
    var lastName="waleed"

    println(fullName(firstName,midName,lastName))



}

fun fullName(fName:String,mName:String,lName:String):String{
    return ("$fName $mName $lName")

}
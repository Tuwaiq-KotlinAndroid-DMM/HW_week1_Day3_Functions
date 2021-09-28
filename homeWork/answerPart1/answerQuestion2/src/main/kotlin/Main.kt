fun main(args: Array<String>) {
    // This program doing for print full name

    // print massage for user for input
    // Declare three variables that user input his first ,middle and last name

    println("Enter your first name: ")
    var firsName = readLine()!!.toString()

    println("Enter your middle name: ")
    var middleName = readLine()!!.toString()

    println("Enter your last name: ")
    var lastName = readLine()!!.toString()

    // Declare variable for save the full name
    var fullName: String = fullName(firsName ,middleName,lastName)

    // Print his full name
    println("Your full name is: $fullName")


}

// Function for collection the first ,middle and last name
fun fullName (fristName: String, middleName: String, lastName: String): String{
    var fullName = "$fristName $middleName $lastName"
    return fullName
}
fun main() {


//Part_one_Question 1
    //readLine()
//val total = add(10,12)
//print(add(10,12))
    // fullName("Ahmed",middle_name = "Abdullah",last_Name = "Al Waleed")

    //println("please Enter two numbers:")

    fun add(num1: Int, num2: Int): Int {
        return (num1 + num2)
    }
    println("Please Enter numbers you want to add")
    print("Please Enter first number here:")
    val num1 = readLine()!!.toInt()
    print("Please Enter Second number here:")
    val num2 = readLine()!!.toInt()
    val result = add(num1, num2)
    print("Your answer is $result")

    println("\n")
    println("\n")

    fun fullName(first_name: String?, middle_name: String?, last_Name: String?) {
        print("Your full name is $first_name $middle_name $last_Name")
    }
    print("Pease Enter your first name here:")
    val firstName = readLine()
    print("Pease Enter your Middle name here:")
    val middleName = readLine()
    print("Pease Enter your Middle name here:")
    val lastName = readLine()
    val full_name = fullName(firstName, middleName, lastName)
    println(full_name)
}




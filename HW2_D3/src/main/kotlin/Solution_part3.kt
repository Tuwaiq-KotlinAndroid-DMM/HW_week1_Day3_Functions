fun main() {
    // Part 3 - More Practicing
    // Challenge 1 - Mathematical operations
    println("Challenge 1")
    println(math(2, 3))
    println("\nChallenge 2")
    // Challenge 2 - Fireball fuel level
    // This is the case when the fuel is Not enough to cast a fireball
    println("Your fuel level is ${castFireball(2, 7)}")
    // This is the case when the fuel is enough to cast a fireball
    println("Your fuel level is ${castFireball(5)}")

}
fun math(num1:Int, num2:Int) : String{
    return (
            "Add: ${num1 + num2}\nSubtract: ${num1 - num2}\n" +
            "Multiply: ${num1 * num2}\nDivide: ${num1 / num2}"
            )
}
fun castFireball(numOfFireball:Int, fuelLevel:Int = 50) : Int {
    /* I assumed that 1 fireball will consume 5 point from the fuel.
       So, maximum number of fireball each user can fire is 10 fireballs.
    * */
    var fuel = fuelLevel - (numOfFireball * 5)
    if (fuel in 1..50) {
        println("You can fire it!!")
        return fuel
    } else if (fuel < 0) {
        println("The fuel level is underflow!\nYou can't fire the fireball")
        return 0
    }
    return 0
}



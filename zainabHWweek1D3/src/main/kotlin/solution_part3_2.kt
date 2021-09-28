fun main(args: Array<String>) {


/* Challenge 2: Fireball Fuel Level*/
    println("Enter number of fireballs cast")
    var castNumber = readLine()!!.toInt()
    println(castFireball(castNumber))

/* Challenge 2: Fireball Fuel Level*/

}

fun castFireball(number: Int): String {

    if (number < 1)
        return "remaining fuel value is 50"
    else if (number < 20)
        return "remaining fuel value is 40"
    else if (number < 40)
        return "remaining fuel value is 30"
    else if (number < 60)
        return "remaining fuel value is 20"
    else if (number < 80)
        return "remaining fuel value is 10"
    else if (number < 90)
        return "remaining fuel value is 5"
    else
        return "remaining fuel value is 1"
}


fun main() {

    // Fireball equal 35
    var fireBallsRemaining = 35
    var fulRemaining = 30

    // print how many fireball
    println("remaining fuel: " +castFireball(fireBallsRemaining,fulRemaining))

}



fun castFireball(fireBallsRemaining:Int, fulRemaining :Int): Int {
    // Declere cariable for save how many fireball
    var z :Int =fulRemaining
    if (fulRemaining >= fireBallsRemaining  ) {
        if (fulRemaining >=1 &&  fulRemaining <= 50)
         z = fulRemaining - fireBallsRemaining
        else {
            println("Game Over")
            z = fulRemaining - fireBallsRemaining
        }
    }
    else {
        println("Game Over")
        z = fulRemaining - fireBallsRemaining
    }
    return z
}

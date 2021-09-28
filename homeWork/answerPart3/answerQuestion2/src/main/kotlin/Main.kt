
fun main() {
    var fireBallsRemaining = 35
    println("remaining fuel: " +castFireball(fireBallsRemaining))

}



fun castFireball(fireBallsRemaining:Int): Int {

    var z :Int
    if (fireBallsRemaining > 1 && fireBallsRemaining <= 50) {
         z = fireBallsRemaining - 1
    }
    else {
        z = fireBallsRemaining
    }
    return z
}

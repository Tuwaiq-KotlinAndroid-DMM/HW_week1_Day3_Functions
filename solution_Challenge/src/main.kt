/*fun math(x:Int,y:Int){
    println("add:"+(x+y))
    println("sub:"+(x-y))
    println("mult:"+(x*y))
    println("div:"+(x/y))
}
fun main(){
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()
    println(math(x,y))
}*/

//-----------------------------------------------------------------------

fun castFireball(Fireballs:String,fuel:Int,ThrowB:Int,n:Int,NyatHack:Int) {
    println(Fireballs)
    println("fuel is:$fuel")
    println("you have thrown $ThrowB")
    if (ThrowB == n) {
        var fuelWthrowB = ThrowB*2    // 1 ball costs 2 bars of fuel out of 50
        println("your fuel Now is:"+ (fuel - fuelWthrowB))
        val ThrowB2 = ThrowB/5         // each 5 fireball you throw you earn 1 NyatHack fireball
        if (ThrowB % 5 == 0){            // if the reminder of 5 == 0 then you earn one fire ball
            val NyatHack = ThrowB2       // Number of NyatHack ball Should == to ThrowB/5..
            println("NyatHack balls:$NyatHack")
            if((fuel - fuelWthrowB) <= 0){
                println("Game Over")   // if the fuel reached to 0 or less the game will end!
            }
        }
    }
}

fun main() {
    val Fireballs = "FireBalls:Unlimited"
    println("be carefull Each fireball will cost you 2 fuel bars")  // reminder of how much fireballs is gonna cost
    println("Your fuel is 50")
    var fuel:Int = 50
    println("Enter the number of thrown fireballs:")
    var ThrowB = readLine()!!.toInt()
    val n = ThrowB
    var NyatHack = 0
    println(castFireball(Fireballs,fuel,ThrowB,n,NyatHack))
}


//Challenge 2: Fireball Fuel Level
//
//Casting fireballs does not just print a message to the console.
// While NyetHack fireballs are strong, the player should not be able to cast an unlimited amount of them.
// Make the castFireball() function return a resulting remaining fuel value that depends on the number of fireballs cast.
// The fuel value should be between 1 and 50, with 50 being the maximum amount of fuel in the game.



fun castFireball(x:Int,f:Int){
    var fuel = f
    for(n in 1..11){
        if (x == 1){
            fuel =- 5
            println("fuel -5")
                 if(fuel == 50 ){println("fuel([][][][][][][][][][]50%)")}
            else if(fuel == 45 ){println("fuel([][][][][][][][][]45%)")}
            else if(fuel == 40 ){println("fuel([][][][][][][][]40%)")}
            else if(fuel == 35 ){println("fuel([][][][][][][]35%)")}
            else if(fuel == 30 ){println("fuel([][][][][][]30%)")}
            else if(fuel == 25 ){println("fuel([][][][][])25%")}
            else if(fuel == 20 ){println("fuel([][][][]20%)")}
            else if(fuel == 15 ){println("fuel([][][]15%)")}
            else if(fuel == 10 ){println("fuel([][]10%)")}
            else if(fuel == 5 ){("fuel([]5%)")}
            else if(fuel == 0 ){("fuel is empty")}
            }
        else if (n == 11) {break}
        }
    }

fun main() {
    println("Press x to fire the Fireballs")
    var x = readLine()!!.toString()
    var a : Int = 0
    var b : Int = 50
    if (x contentEquals "x")
         a = 1
    else if (x contentEquals "c")
        a = 2
    castFireball(a,b)
}
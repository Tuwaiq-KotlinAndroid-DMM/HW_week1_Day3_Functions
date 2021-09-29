fun main() {

    val fire = 50
    castFireball(fire)
}

fun castFireball(fire: Int) {

    println("through ball")
    var Fireball = readLine()!!.toInt()



    if (Fireball<= fire) {
        var remaining  = fire - Fireball

        println("fire is $remaining ")

        castFireball(remaining )

    } else
        println("No remaining fuel ")


}
fun main (){
println(maximum(45, 67,87))
}
var maximum = fun(x:Int, y:Int, z:Int){
    if (x >= y && x >= z ) {
        println("The greatest number is\t" + x)
    }else if(y >= x && y >= z) {
        println("The greatest number is\t" + y)
    }else
        println("The greatest number is\t" + z)
}
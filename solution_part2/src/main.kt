fun main(){
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()
    val maximum: (Int, Int, Int) -> Unit ={ num1, num2, num3 ->
        if(num2 < num3) {
            var maxTest = num2
            println(num3)
        }else if(num2 > num3){
            var maxTest = num2
            if (maxTest > num1 ){
                println("$maxTest is the gratest")
            }else{
                println("$num1 is the gratest")
            }
        }
    }
    println(maximum(num1,num2,num3))
}
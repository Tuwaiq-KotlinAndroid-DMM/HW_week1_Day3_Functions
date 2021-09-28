fun main() {
    // Part 2 - Practice with Anonymous Functions
    // Question 3 - maximum function
    var maximum: (Int, Int, Int) -> String = { num1, num2, num3 ->
        var max = num1
        if (max < num2 && num2 > num3) {
            max = num2
        } else if (max < num3) {
            max = num3
        }
        "The largest number is $max"
    }
    println(maximum(10,14,12))
}

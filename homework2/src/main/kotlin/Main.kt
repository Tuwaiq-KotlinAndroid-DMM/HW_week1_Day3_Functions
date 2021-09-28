
    fun main(args: Array<String>) {

        add(1,1)
        println(add(1,1))
        fullName("Hind", "Ziad","Alzarah")
    }
    fun add(n1: Int, n2: Int): Int {

        return n1+n2

    }
    fun fullName(first: String, middle: String, last: String ) {

        println("my full name is $first $middle $last")
    }


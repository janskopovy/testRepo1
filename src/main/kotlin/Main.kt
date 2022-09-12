fun main(args: Array<String>) {
    val myArray = mutableListOf<String>()
    repeat(10 ) {
        println("Insert your name")
        val name = readln()
        myArray.add(name)
    }
    println("Hello $myArray")
}



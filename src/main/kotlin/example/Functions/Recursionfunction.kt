package Functions

//Normal function call
//Recursive function call
//Kotlin supports recursion which means a Kotlin function can call itself.


// Kotlin program of factorial using recursion
//fun Fact(num: Int): Long
//{
//    return if (num == 1) num.toLong() // terminate condition
//    else num* Fact(num - 1)
//}
//// main method
//fun main()
//{
//    println("Factorial of 5 is: " + Fact(50))
//    // Recursive call
//}



fun main(args: Array<String>) {
    val a = 5

    val result = factorial(a)
    println( result )

}

fun factorial(a:Int):Int{
    val result:Int
    if( a <= 1){
        result = a
    }else{
        result = a*factorial(a-1)
    }
    return result
}
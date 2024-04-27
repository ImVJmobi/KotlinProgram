package Functions



//A higher-order function is a function that takes another function as parameter and/or returns a function.
//fun main(args: Array<String>) {

 //   val result = calculate(4, 5, ::sum)
 //   println( result )

//}

//fun sum(a: Int, b: Int) = a + b
//
//
//
//fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
//    return operation(a, b)
//}


//
//
//fun main(){
//
//    val rest = cal(5,2, ::sum)
//    println(rest)
//}
//
//fun sum(a:Int , b:Int) = a-b
//
//fun cal( a: Int , b: Int , opration:(Int ,Int) -> Int):Int{
//
//    return  opration(a,b)
//}


//fun main(){
//    val func = operation()
//    println( func(4) )
//}
//
//fun add(a:Int)= a+a
//
//fun operation(): (Int) -> Int {
//    return ::add
//}




fun main(){
    val func = operation()
    println( func(4) )
}

fun sub(a:Int)= a-a

fun operation(): (Int) -> Int {
    return ::sub
}
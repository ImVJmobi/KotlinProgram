package Functions


//
//fun main(args: Array<String>) {
//    val a = 4
//
//    val results = factorials(a)
//    println( results )
//
//}
//
//fun factorials(a:Int , accunm: Int = 1):Int{
//    val results:Int = a*accunm
//
//    return if( a <= 1){
//        results
//    }else{
//        factorials(a-1,results)
//
//    }
//
//
//}

//
//fun main(){
//    var a = 4
//    var results = factorials(a)
//    println(results)
//}
//
//
//fun factorials(a:Int , accnum:Int=1) : Int{
//
//    val results = a * accnum
//    return if (a <= 1) {
//        results
//    } else {
//        factorials(a - 1, results)
//    }
//
//
//}


import java.math.BigInteger

/*
*   Tailrec Function : Recursive Functions
*       -> Prevents Stackoverflow Exception
*
*   Fibonacci Series
*       0  1  1  2  3  5  8  13  21 ......
* */
fun main(args: Array<String>) {

    println(getFibonacciNumber(10, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0)
        return  b
    else
        return getFibonacciNumber(n - 1, a + b, a)
}
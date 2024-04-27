package org.example


//Check Fibonacci
//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
fun isFibonacci (num : Int) : Boolean{
    var a = 0
    var b = 1
    var fib = 0
    while ( fib < num){
        fib = a + b
        a = b
        b = fib
    }
    return fib == num || num == 0
}
fun main(){
    println("Enter the value")
    var num = readLine()!!.toInt()
    if (isFibonacci(num))
        println("$num is part of the Fibonacci series.")
    else
        println("$num is not part of the Fibonacci series.")
}
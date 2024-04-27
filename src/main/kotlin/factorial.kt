package org.example

import java.util.Scanner

// the factorial of 3 represents the multiplication of numbers 3, 2, 1, i.e. 3! = 3 × 2 × 1 and is equal to 6.
fun factorial(n :Int) : Int{
    return if (n == 0){
        1
    }else{
        n * factorial(n -1)
    }
}
fun main(){
    println("Enter the number :")
    val reader = readLine()!!.toInt()
    var result = factorial(reader)
    println(result)
}
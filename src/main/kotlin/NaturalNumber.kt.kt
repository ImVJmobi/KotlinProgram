package org.example



fun main(){
    print("Enter first number : ")
    var firstValue = readLine()!!
    print("Enter second number : ")
    var secondValue = readLine()!!
    println(firstValue)
    println(secondValue)
    val addition = {a : Int , b : Int -> (a + b) / 2}
    println(addition(firstValue.toInt(),secondValue.toInt()))
}
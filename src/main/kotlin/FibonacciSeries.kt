package org.example

//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

fun main() {
    var sum = 10
    var a = 0
    var b = 1
    println( " Fibonacci Numbers of $sum ")
    for (i in 1..sum){
        print("$a +")
        var result = a + b
        a = b
        b = result
    } }
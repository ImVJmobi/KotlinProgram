package org.example

import java.util.Scanner


fun main(args: Array<String>) {
    val num = 10
    var factorial: Long = 1

    for (i in factorial..num) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}





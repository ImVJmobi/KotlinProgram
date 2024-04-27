package org.example


fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun printPrimesInRange(start: Int, end: Int) {
    println("Prime numbers between $start and $end are:")
    for (num in start..end) {
        if (isPrime(num)) {
            println(num)
        }
    }
}

fun main() {
    // Test the function with a range
    val startNum = 10
    val endNum = 50
    printPrimesInRange(startNum, endNum)
}
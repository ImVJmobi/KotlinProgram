package org.example



fun main(){

    print("Enter first number : ")
    val a = readLine()!!.toDouble()
    print("Enter second number : ")
    val b = readLine()!!.toDouble()

    if (a > b) {
        print("$a is the largest of $a and $b")
    } else {
        print("$b is the largest of $a and $b")
    }
}

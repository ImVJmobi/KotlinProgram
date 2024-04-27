package org.example

// a number that can only be divided by itself and 1 without remainders
fun isPrimeNumber( Number : Int) : Boolean{
    if (Number <= 1){
        return false
        println("Number is <= 1")
    }
    for (i in 2 until Number) {
        if( Number % i == 0){
            return false
        } }
    return true
}
fun main(){
    print("Enter an integer : ")
    val num = readLine()!!.toInt()
    if ( isPrimeNumber(num) ) {
        println("$num is a prime number")
    } else {
        println("$num is not a prime number")
    } }
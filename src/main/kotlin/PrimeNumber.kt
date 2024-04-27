package org.example

import java.util.*


fun listPrimeNumber( n : Int):Boolean{

    if (n <= 1 ){
        return false
    }


    for ( i in 2 until n / 2) {

        if ( n % i == 0){

            var res =n % i == 0
            if(n % i == 0)
            return false
        }

    }
return true
}

fun main (){

    // Utilize Scanner for user input
    val reader = Scanner(System.`in`)

    // Get the range from the user
    print("Enter the start of the range: ")
    val start = reader.nextInt()
    print("Enter the end of the range: ")
    val end = reader.nextInt()

    // Loop through the range and print prime numbers
    for (num in start..end) {
        if (listPrimeNumber(num)) {
            print("$num ")
        }
    }
}
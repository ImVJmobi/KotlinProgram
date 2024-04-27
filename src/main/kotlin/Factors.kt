package org.example


//Factors of 10 are:
//1 2 3 4 5 6 7 8 9 10
fun factors( number : Int)  {
    println("Factors of $number are: ")
    for ( i in 1..number ){
        if (number % 2 ==0){
            print("$i ")
        }
    }
}
fun main(){
    factors(10)
}

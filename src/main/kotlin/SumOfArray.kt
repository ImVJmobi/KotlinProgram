package org.example



fun main(){

    val  listofArray = arrayOf(5,2,1,6,9,0)
    var sum =0

    for (i in listofArray){
        sum +=i
    }
    println(sum)
    println( sum / listofArray.size)
}
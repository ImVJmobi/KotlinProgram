package Excercise

fun main(){

    var str = "Hello Vijay"
    var revString = convertReverse(str)
    println("Original String is $ str")
    println("Reverse String is $revString")
}

fun convertReverse(strReverse : String) : String{
    var result = strReverse.reversed()
    return result
}
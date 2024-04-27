package Kotlin_In



inline fun addittion( a: Int , b : Int) : Int{
    return a+b
}

fun main(){
    var value = addittion(5,10)
    println(value)
}
package Kotlin_In

fun main (){
    val name: String? = null
    val length: Int = name?.length ?: 0 // If name is null, assign 0 as the length
    println(length)

}
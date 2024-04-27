package Kotlin_In

import Functions.operation
import jdk.dynalink.Operation


fun main(){

    var addValue = aDDition(10,23) {x , y -> x+y}
    var mulValue = multiply(5, 2){m , n -> m*n}
    val subtracttionCal = subTraction(90,10){k ,l -> k-l}
    println(addValue)
    println(mulValue)
    println(subtracttionCal)
}

fun aDDition (a:Int , b: Int , Operation:(Int,Int) -> Int ): Int{
    var calculationResult = Operation(a,b)
    return calculationResult
}

fun multiply (a: Int , b:Int , Muloperation :(Int,Int) -> Int): Int{
    val resiltMul = Muloperation(a,b)
    return  resiltMul
}

fun subTraction (a:Int , b:Int , subValue :(Int,Int) ->Int): Int{
    var subValue = subValue(a,b)
    return subValue
}
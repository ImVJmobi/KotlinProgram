package Excercise



fun main(){

    var firstNumber = 1
    var endNumber = 10

    var result = calculateNo(firstNumber,endNumber)
    println("Sum of numbers between $firstNumber and $endNumber: $result")
}

fun calculateNo(f:Int ,e:Int): Int{

    var result = 0

    for (i in f..e){
        result +=i
    }
return result
}
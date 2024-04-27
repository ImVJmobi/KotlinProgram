package Excercise

fun main() {

    var numbers = arrayOf(4,8,7,9,42,13,24,79,23,57,)
    findOdd(numbers)
    //println(findOdd(numbers))

}

fun findOdd(numbers : Array<Int>) : Int{

    var count = 0
    var sum =0
    for (num in numbers){

        if (num % 2 !== 0){
             sum += num
            count++
        }

    }
    println("Sum of the Odd $sum" )
    return count
}
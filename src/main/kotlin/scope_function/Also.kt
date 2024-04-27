package org.example.scope_function

class AlsoFunction {
    val numberList :MutableList<Int> = mutableListOf(1,3,5,6,8)

}

fun main(){
   var numberList =AlsoFunction().also{

       println(it.numberList)
       it.numberList.add(4)
       println("After Added ${it.numberList}")
       it.numberList.remove(3)
       it.numberList.remove(it.numberList[3])
       println("After Removed ${it.numberList}")


   }
}
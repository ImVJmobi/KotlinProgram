package org.example.scope_function



class applyFunction(){

    var name : String = ""
    var age : Int = 50

}


fun main(){

    val applyF = applyFunction().apply {

         this.name = "Vijay"
         age = 4
        println("My name is ${this.age} ")
    }

    with(applyF){
        println("My name is ${applyF.name} ")
    }

}
package org.example.scope_function

class WithFunction(){

    var name: String = ""
    var age  : Int = 20

}


fun main(){
    val withF = WithFunction()
    with(withF){
        this.name = "vijayakumar"
        this. age = 40
        println("My name is $this.name")
        println("My age is ${age}")
    }

}
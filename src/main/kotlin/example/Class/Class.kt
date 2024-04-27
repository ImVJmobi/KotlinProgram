package Class

import jdk.dynalink.Operation

class DemoClass {
    //Property
    var myName: String ="Hello world "
    //Data Member
    fun Operation(){
    println("My name is $myName")
}

}

fun main(){
    var demo = DemoClass()
    demo.Operation()
}
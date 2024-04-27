package Class


//a private package can be accessible within that specific file.
//A private class or interface can be accessible only by its data members, etc.
open class A() {
    private val i = 1

    fun doSomething(){
        println("Inside doSomething" )
        println("Value of i is $i" )
    }
}
class B : A() {
    fun printValue(){
        doSomething()
        // println("Value of i is $i" )
    }
}

fun main(args: Array<String>) {
    val a = A()
    val b = B()
    //a.doSomething()
    b.printValue()
}
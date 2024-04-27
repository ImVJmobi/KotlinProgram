package Class

//All classes in Kotlin have a common superclass called Any,

//Kotlin superclass Any has three methods:
// equals(), hashCode(), and toString().
// Kotlin is by default final, hence, we need to use the keyword open in front of the class declaration to make it inheritable for other classes.
// Kotlin uses operator ":" to inherit a class.

open class ParentClass {

open fun sayHello()
{
    println("Hello Vijay")
}

}
class childClass : ParentClass() {

}

fun main(){
    var greeting = childClass()
    greeting.sayHello()
}
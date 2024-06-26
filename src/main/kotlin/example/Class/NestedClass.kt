package Class




//when a class has been created inside another class, then it is called as a nested class.
//Kotlin nested class is by default static, hence, it can be accessed without creating any object of that class but with the help of . dot operator.
//Same time we cannot access members of the outer class inside a nested class.

class OuterClass {

    class NestedClass{
        fun greetings()="Good Evening"
    }
}

fun main(){
    var obj = OuterClass.NestedClass()
    println(obj.greetings())

}
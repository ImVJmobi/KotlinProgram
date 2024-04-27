package Class


//Code in a derived class can call its superclass functions and properties directly using the super keyword:

//open class ABC {
//    open fun think () {
//        println("Hey!! i am thinking ")
//    }
//}
//class BCD: ABC() { // inheritance happens using default constructor
//    override fun think() {
//        println("I am from Child")
//    }
//}
//fun main(args: Array<String>) {
//    var  a = BCD()
//    a.think()
//}



open class ABC {
    open val count: Int = 0

    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class BCD(override val count: Int = 400): ABC() {

    override fun think() {
        println("I am from Child")
    }

    fun displayCount(){
        println("Count value is $count")
    }
}
fun main(args: Array<String>) {
    var a = BCD(200)
    var b = BCD()
    a.displayCount()
    b.displayCount()
}
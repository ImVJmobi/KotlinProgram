package Class


//Anonymous inner class is a pretty good concept that makes the life of a programmer very easy.
//we are implementing an interface, the concept of anonymous inner block comes into picture.
//The concept of creating an object of interface using runtime object reference is known as anonymous class.
fun main(){
    var programmer :Human = object:Human { // Anonymous class
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}


interface Human {
    fun think()
}